package cproject;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**
 * 도서 관리 
 * 
 *@author SHY-702-01
 *@since 2021.04.06
 *@version 
 */
public class BookHandler {
   //Book bookList[] = new Book[5];
   Vector<Book> bv = new Vector<Book>();
   Book b = new Book();
   int bookCnt = MenuNum.num0;
   User u = new User();
   Scanner s;
   
   public BookHandler() {
      s= new Scanner(System.in);   
   }

   /**
    *도서 입력 메소드
    *
    *Buffered 클래스를 사용하에 텍스트 데이터 파일에 입력한 내용이 저장되도록 함
    *book Entity 클래스에서 set,get메소드를 통하여 리턴하여 값이 있는지 확인
    *
    *@throws java.io.IOException 입출력 관련
    *@author SHY-702-01
    */
public void inputBook() throws IOException{

         BufferedWriter bw = new BufferedWriter(new FileWriter("stockBook.txt", true));
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         
         String sPattern = "^[a-zA-Z0-9가-힣\\s]*$";
         int retry = MenuNum.num0;
         boolean regex;

         do {
            System.out.print("책 제목 : ");
            String bookTitle = s.nextLine();
            bw.write("책 제목: " + bookTitle + "\t");
            regex = Pattern.matches(sPattern, bookTitle);
            if (regex != true) {
               System.out.println("숫자를 포함한 문자열만 입력하세요.");
               break;
            }

            System.out.print("책 저자 : ");
            String bookAuthor = s.nextLine();
            bw.write("책 저자: " + bookAuthor + "\t");
            regex = Pattern.matches(sPattern, bookAuthor);
            if (regex != true) {
               System.out.println("숫자를 포함한 문자열만 입력하세요.");
               break;
            }

            System.out.print("출판사 : ");
            String bookPublisher = s.nextLine();
            bw.write("출판사: " + bookPublisher + "\t" + "\t");
            regex = Pattern.matches(sPattern, bookPublisher);
            if (regex != true) {
               System.out.println("숫자를 포함한 문자열만 입력하세요.");
               break;
            }

            System.out.print("책 코드 : ");
            String bookCode = s.nextLine();
            bw.write("책 코드: " + bookCode + "\t");
            regex = Pattern.matches(sPattern, bookCode);
            if (regex != true) {
               System.out.println("숫자를 포함한 문자열만 입력하세요.");
               break;
            }

            System.out.print("책 가격 : ");
            int bookPrice = MenuNum.num0;
            if (!s.hasNextInt() || (bookPrice = s.nextInt()) < MenuNum.num0) {
               System.out.println("정수만 입력하세요.");
               break;
            }
            bw.write("책 가격: " + bookPrice + "\t");

            System.out.print("책 판매량 : ");
            int bookSale = MenuNum.num0;
            if (!s.hasNextInt() || (bookSale = s.nextInt()) < MenuNum.num0) {
               System.out.println("정수만 입력하세요.");
               break;
            }
            bw.write("책 판매량: " + bookSale + "\t");

            System.out.print("책 출판연도 : ");
            int bookYear = MenuNum.num0;
            if (!s.hasNextInt() || (bookYear = s.nextInt()) < MenuNum.num0) {
               System.out.println("정수만 입력하세요.");
               break;
            }
            bw.write("책 출판연도: " + bookYear + "\t");

            s.nextLine();

            int borrow = MenuNum.num0;
            bw.write("대여 정보 : 0");
            bw.newLine();

            
            b.setBookTitle(bookTitle);
            b.setBookAuthor(bookAuthor);
            b.setBookPublisher(bookPublisher);
            b.setBookCode(bookCode);
            b.setBookPrice(bookPrice);
            b.setBookSale(bookSale);
            b.setBookYear(bookYear);
            b.setBorrow(borrow);
            bv.add(new Book(bookTitle, bookAuthor, bookPublisher, bookCode, bookPrice, bookSale, bookYear, borrow));

            System.out.println("또 입력하시겠어요? yes..1 no..0");
            retry = s.nextInt();
            if (retry == MenuNum.num0) {
               bw.close();
               break;
            }
            s.nextLine();
         } while (retry != MenuNum.num0);
      }
/**
 * 도서 출력용 메소드
 * 
 * File 생성자를 생성하여 텍스트 파일 객체를 생성
 * <br>tryCatch()를 사용하여 예외 발생이 되면 근원지를 찾아내 단계별로 에러를 출력하게한다.
 * <br>입력 메소드를 통해 저장된 텍스트 데이터파일을 불러와서
 * readLine메소드를 사용하여 한줄 한줄 읽으며 null값이 아니면 읽은 값들을 출력하게 한다.
 * 
 * @throws java.io.IOException 입출력 관련
 * 
 * 
 */
   
  public void outBook() throws IOException {
//     for (int i=0; i<bv.size(); i++) {
//        if (bv.get(i) != null) {
//           System.out.println("-------------");
//           System.out.println("책 제목 : " + bv.get(i).getBookTitle());
//           System.out.println("책 저자 : " + bv.get(i).getBookAuthor());
//           System.out.println("출판사 : " + bv.get(i).getBookPublisher());
//           System.out.println("책 코드 : " + bv.get(i).getBookCode());
//           System.out.println("책 가격 : " + bv.get(i).getBookPrice());
//           System.out.println("책 판매량 : " + bv.get(i).getBookSale());
//           System.out.println("책 출판연도 : " + bv.get(i).getBookYear());
//           System.out.println();
//        }
//     }
     File file = new File("stockBook.txt");
     try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = br.readLine()) != null) {
           System.out.println(line);
        }
     } catch (IOException e) {
        e.printStackTrace();
     }

  }

  /**
   * 도서 검색 메소드
   * 
   * stockBook.txt 에 있는 값에서 제목이 null값이 아닌지 판단하여
   * 유저가 입력한 값과 동일한 값이 있을시 출력
   * @throws java.io.IOException 입출력 관련
   * @author SHY-702-01
   * 
   * 
   */
   
  public void searchBook() throws IOException{
         System.out.print("책 제목을 입력해주세요 : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("책 제목: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * 도서 검색 메소드
   * 
   * stockBook.txt 에 있는 값에서 저자가 null값이 아닌지 판단하여
   * 유저가 입력한 값과 동일한 값이 있을시 출력
   * @throws java.io.IOException 입출력 관련
   */
  public void searchBook2() throws IOException{
         System.out.print("책 저자를 입력해주세요 : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("책 저자: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * 도서 검색 메소드
   * 
   * stockBook.txt 에 있는 값에서 출판사가 null값이 아닌지 판단하여
   * 유저가 입력한 값과 동일한 값이 있을시 출력
   * @throws java.io.IOException 입출력 관련
   */
  public void searchBook3() {
      
      System.out.print("책 출판사를 입력해주세요 : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("책 출판사: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * 도서 검색 메소드
   * 
   * stockBook.txt 에 있는 값에서 북 코드가 null값이 아닌지 판단하여
   * 유저가 입력한 값과 동일한 값이 있을시 출력
   * @throws java.io.IOException 입출력 관련
   */
  public void searchBook4() {
      
      System.out.print("북 코드를 입력해주세요 : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("북 코드: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * 도서 검색 메소드
   * 
   * stockBook.txt 에 있는 값에서 책 가격이 null값이 아닌지 판단하여
   * 유저가 입력한 값과 동일한 값이 있을시 출력
   * @throws java.io.IOException 입출력 관련
   */
  public void searchBook5() {
      
      System.out.print("책 가격을 입력해주세요 : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("책 가격: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * 도서 검색 메소드
   * 
   * stockBook.txt 에 있는 값에서 판매량이 null값이 아닌지 판단하여
   * 유저가 입력한 값과 동일한 값이 있을시 출력
   * @throws java.io.IOException 입출력 관련
   */
  public void searchBook6() {
      
      System.out.print("책 판매량을 입력해주세요 : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("책 판매량: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * 도서 검색 메소드
   * 
   * stockBook.txt 에 있는 값에서 책 연도가 null값이 아닌지 판단하여
   * 유저가 입력한 값과 동일한 값이 있을시 출력
   * @throws java.io.IOException 입출력 관련
   */
  public void searchBook7() {
      
      System.out.print("책 연도를 입력해주세요 : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("책 연도: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
   /**
    * 도서 판매량에 따른 내림차순 정렬 메소드
    * 
    * 기존 도서가 등록된 텍스트 파일에서 복사시킬 텍스트파일을 만들어
    * 한줄 씩 복사 시키면서 판매량에 의해 적은것 부터 내림차순이 된다
    * 
    * @throws java.io.IOException 입출력 관련
    * 
    * <p>내림차순관련 {@link Book#compareTo(Object)} 참조</p>
    * 
    */
  public void sortBook() throws IOException{
      System.out.println("판매량에 따른 내림차순 정렬");
      BufferedWriter out =null;
      BufferedReader in = null;
 
   try {
      in = new BufferedReader(new FileReader("stockBook.txt"));
      out = new BufferedWriter(new FileWriter("sort.txt"));
      
      Vector<String> list = new Vector<String>();
      String line;
      while((line=in.readLine()) != null) 
      {
         list.add(line);
         Collections.sort(bv);   
      }
      out.write(list+"");
      out.flush();
   }catch(IOException e) {
   }finally {
         try {
            if(in != null)
               in.close();
            if(out !=null)
               out.close();
         }catch(IOException e) {
            
         } 
           
   }
   
   }
//
//      for(int i = 0; i<bv.size();i++)
//      {
//         System.out.println("책 이름 : " + bv.get(i).getBookTitle() + "," +(i+1) + "위 : " + bv.get(i).getBookSale());
//      }
   /**
    * 도서 삭제 메소드
    * 
    * 기존에 데이터들이 저장된 파일 하나씩 읽어드리며 복사시킬 텍스트 파일에 넣으며,
    * 삭제를 시킬 값(책의 제목)을 입력하여 같은값을 확인한다면, 그 값만 삭제시키고 다 복사 하여 기존 텍스트 파일에 저장함
    * 
    * @throws java.io.IOException 입출력 관련
    */

  public void deleteBook1() throws IOException {
      System.out.print("삭제할 책 제목을 입력해주세요 : ");     
      String bT = s.nextLine();
      for (int i=0; i<bv.size(); i++) {
         if (bv.get(i) == null) {
            System.out.println("null값입니다.");
         }
         else if (bT.equals(bv.get(i).getBookTitle())) {
            System.out.println(bT + " 책이 삭제되었습니다.");
            bookCnt--;
            if (bookCnt == MenuNum.num1) {
               ++bookCnt;
            }
         }
      }
    
      
      File inputFile = new File("stockBook.txt"); //기존텍스트파일
      File tempFile = new File("newstockBook.txt"); //복사시킬 텍스트파일

      BufferedReader reader = new BufferedReader(new FileReader(inputFile));
      BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

      String lineToRemove = bT;
      String currentLine;

      while((currentLine = reader.readLine()) != null) {            
          String trimmedLine = currentLine.trim();
          if(trimmedLine.contains("책 제목: "+lineToRemove+"\t")) continue;
          writer.write(currentLine + System.getProperty("line.separator"));
      }
      
      System.out.println("해당 도서의 정보를 모두 삭제했습니다.");
      writer.close(); 
      reader.close();
      

      if(inputFile.exists() && tempFile.exists()) {  //파일 삭제 및 이름바꾸기             
         inputFile.delete();                      
           tempFile.renameTo(new File("stockBook.txt"));                             
       } else {
           System.out.println("파일이 존재하지 않습니다.");
       }
                                         
   }
  /**
   * 도서 삭제 메소드
   * 
   * 기존에 데이터들이 저장된 파일 하나씩 읽어드리며, 복사시킬 텍스트 파일에 넣으며
   * 삭제를 시킬 값(책 코드)을 입력하여 같은값을 확인한다면, 그 값만 삭제시키고 다 복사 하여 기존 텍스트 파일에 저장함
   * 
   * @throws java.io.IOException 입출력 관련
   */
  public void deleteBook2() throws IOException{
      System.out.print("삭제할 책 코드를 입력해주세요 : ");
      String bT = s.nextLine();
      for (int i=0; i<bv.size(); i++) {
         if (bv.get(i) == null) {
            //System.out.println("null값입니다.");
         }
         else if (bT.equals(bv.get(i).getBookCode())) {
            System.out.println(bv.get(i).getBookTitle() + " 책이 삭제되었습니다.");
            bv.remove(i);
            bookCnt--;
         }
      }
      
      File inputFile = new File("stockBook.txt");
      File tempFile = new File("newstockBook.txt");

      BufferedReader reader = new BufferedReader(new FileReader(inputFile));
      BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

      String lineToRemove = bT;
      String currentLine;

      while((currentLine = reader.readLine()) != null) {            
          String trimmedLine = currentLine.trim();
          if(trimmedLine.contains("책 코드: "+lineToRemove+"\t")) continue;
          writer.write(currentLine + System.getProperty("line.separator"));
      }
      System.out.println("해당 도서의 정보를 모두 삭제했습니다.");
      writer.close(); 
      reader.close(); 
      
      if(inputFile.exists() && tempFile.exists()) {  //파일 삭제및 이름바꾸기             
         inputFile.delete();                      
           tempFile.renameTo(new File("stockBook.txt"));                             
       } else {
           System.out.println("파일이 존재하지 않습니다.");
       }
   }
   
 /**
  * 도서 대출용 메소드
  * 
  * u 의 overdue의 값을 통해 연체되어있는 사용자인지 판단함
  * 연체되어있지않다면 오늘의 날짜를 yyyyMMdd형식으로 입력받아 그 책의 borrow에 저장
  * 
  * @return 연체이력 있을시 대여 불가능
  * @param u 로그인 하여 도서를 대출할 유저
  * <p>{@link User#getOverdue()} 참조</p>
  *
  */
  public void borrowBook(User u)
   {
      
      System.out.println("유저 확인");
        String ID = s.nextLine();
        
        if(ID.equals(u.getID())) 
        {
           if (u.getOverdue() > MenuNum.num0)//연체 이력이 있는지 확인
           {
              System.out.println("연체 이력이 있기에"+u.getOverdue()+"일 동안 대여 불가능");
              return;
           }
        }
      
        System.out.print("빌릴 책의 제목를 말해주세요 : ");
        String bName = s.nextLine();
        for(int i = 0; i<bv.size();i++)
        {
           if(bv.get(i)!=null )
           {
              if(bName.equals(bv.get(i).getBookTitle())) 
              {
                      
                 if(bv.get(i).getBorrow() != MenuNum.num0 )//borrow에는 대출시에 대출일이 yyyyMMdd 형식으로 저장되어잇음
                 {
                    System.out.println("이미 대출");break;
                 }
                 else 
                 {
                    System.out.println("오늘 날짜를 입력해주세요(yyyyMMdd 8자리 형식으로) : ");
                    int today = s.nextInt();
                    s.nextLine();
                    bv.get(i).setBorrow(today);//대출날짜를 borrow에 저장
                    break;
                 }
              }   
         
           }
        }
   }
   
   /**
    *도서 반납용 메소드  
    *
    *반납시의 날짜를 입력받아 대여 기간 2주에서 얼마나 연체되었는지 계산후
    *연체날만큼 u의 overdue 값을 더해 연체 일수를 늘림
    *
    *@param u 로그인 하여 도서를 반납할 유저
    */
  public  void returnBook(User u) 
   {   
       System.out.print("반납할 책이 제목을 말해주세요 : ");
       String bName = s.nextLine();

      for(int i = 0; i<bv.size();i++)
      {
         if(bv.get(i)!=null )
         {
            if( bName.equals(bv.get(i).getBookTitle())) 
            {
               if(bv.get(i).getBorrow() == MenuNum.num0)
               {
                  System.out.println("이미 반납");
                  break;
               }
               else 
               {
                  long overdue; //연체일수를 저장하는 변수
                  SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");//날짜를 입력받는 형식 지정           
                  Date rt = new Date(); //반납 날짜를 저장하는 변수
                  Date br = new Date(); //대출 날짜를 저장하는 변수
                  String temp;
              
                  temp = "" + bv.get(i).getBorrow();
                  System.out.println("오늘 날짜를 입력해주세요 (yyyyMMdd 8자리로입력해주세요) : ");
                  //rt = sdf.parse(s.nextLine());
                  //br = sdf.parse(temp);//parse를 통해 string을 date로 변환
                  try//String을 date 형식으로 변환할시 이클립에서 parseexception 에러가나오기때문에 try catch문 안에 꼭 넣어야함
                  {
                     rt = sdf.parse(s.nextLine());
                     br = sdf.parse(temp);
                  }
                  catch(Exception e)
                  {
                     //TODO: handle exception
                  }
                  overdue = TimeUnit.DAYS.convert(Math.abs(rt.getTime() - br.getTime()), TimeUnit.MILLISECONDS);//대여기간을 구함
                  if (overdue > 14)//대여최대 기간은 2주
                  {
                     System.out.println(overdue + "일 만큼 연체되었습니다. 연체된 일수 만큼 대여가 불가능합니다.");
                     bv.get(i).setBorrow(MenuNum.num0);//반납은 되었으니 borrow는 MenuNum.num0으로 설정
                     u.setOverdue((int)(overdue));//연체된 유저를 구분하기 위해 연체일수 만큼 overdue를 재설정
                     break;
                  }
                  System.out.println("반납 성공");
                  bv.get(i).setBorrow(MenuNum.num0) ;
                  break;
               }
            }
         }
         
      }
   }

}