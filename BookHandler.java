package cproject;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**
 * ���� ���� 
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
    *���� �Է� �޼ҵ�
    *
    *Buffered Ŭ������ ����Ͽ� �ؽ�Ʈ ������ ���Ͽ� �Է��� ������ ����ǵ��� ��
    *book Entity Ŭ�������� set,get�޼ҵ带 ���Ͽ� �����Ͽ� ���� �ִ��� Ȯ��
    *
    *@throws java.io.IOException ����� ����
    *@author SHY-702-01
    */
public void inputBook() throws IOException{

         BufferedWriter bw = new BufferedWriter(new FileWriter("stockBook.txt", true));
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         
         String sPattern = "^[a-zA-Z0-9��-�R\\s]*$";
         int retry = MenuNum.num0;
         boolean regex;

         do {
            System.out.print("å ���� : ");
            String bookTitle = s.nextLine();
            bw.write("å ����: " + bookTitle + "\t");
            regex = Pattern.matches(sPattern, bookTitle);
            if (regex != true) {
               System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
               break;
            }

            System.out.print("å ���� : ");
            String bookAuthor = s.nextLine();
            bw.write("å ����: " + bookAuthor + "\t");
            regex = Pattern.matches(sPattern, bookAuthor);
            if (regex != true) {
               System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
               break;
            }

            System.out.print("���ǻ� : ");
            String bookPublisher = s.nextLine();
            bw.write("���ǻ�: " + bookPublisher + "\t" + "\t");
            regex = Pattern.matches(sPattern, bookPublisher);
            if (regex != true) {
               System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
               break;
            }

            System.out.print("å �ڵ� : ");
            String bookCode = s.nextLine();
            bw.write("å �ڵ�: " + bookCode + "\t");
            regex = Pattern.matches(sPattern, bookCode);
            if (regex != true) {
               System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
               break;
            }

            System.out.print("å ���� : ");
            int bookPrice = MenuNum.num0;
            if (!s.hasNextInt() || (bookPrice = s.nextInt()) < MenuNum.num0) {
               System.out.println("������ �Է��ϼ���.");
               break;
            }
            bw.write("å ����: " + bookPrice + "\t");

            System.out.print("å �Ǹŷ� : ");
            int bookSale = MenuNum.num0;
            if (!s.hasNextInt() || (bookSale = s.nextInt()) < MenuNum.num0) {
               System.out.println("������ �Է��ϼ���.");
               break;
            }
            bw.write("å �Ǹŷ�: " + bookSale + "\t");

            System.out.print("å ���ǿ��� : ");
            int bookYear = MenuNum.num0;
            if (!s.hasNextInt() || (bookYear = s.nextInt()) < MenuNum.num0) {
               System.out.println("������ �Է��ϼ���.");
               break;
            }
            bw.write("å ���ǿ���: " + bookYear + "\t");

            s.nextLine();

            int borrow = MenuNum.num0;
            bw.write("�뿩 ���� : 0");
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

            System.out.println("�� �Է��Ͻðھ��? yes..1 no..0");
            retry = s.nextInt();
            if (retry == MenuNum.num0) {
               bw.close();
               break;
            }
            s.nextLine();
         } while (retry != MenuNum.num0);
      }
/**
 * ���� ��¿� �޼ҵ�
 * 
 * File �����ڸ� �����Ͽ� �ؽ�Ʈ ���� ��ü�� ����
 * <br>tryCatch()�� ����Ͽ� ���� �߻��� �Ǹ� �ٿ����� ã�Ƴ� �ܰ躰�� ������ ����ϰ��Ѵ�.
 * <br>�Է� �޼ҵ带 ���� ����� �ؽ�Ʈ ������������ �ҷ��ͼ�
 * readLine�޼ҵ带 ����Ͽ� ���� ���� ������ null���� �ƴϸ� ���� ������ ����ϰ� �Ѵ�.
 * 
 * @throws java.io.IOException ����� ����
 * 
 * 
 */
   
  public void outBook() throws IOException {
//     for (int i=0; i<bv.size(); i++) {
//        if (bv.get(i) != null) {
//           System.out.println("-------------");
//           System.out.println("å ���� : " + bv.get(i).getBookTitle());
//           System.out.println("å ���� : " + bv.get(i).getBookAuthor());
//           System.out.println("���ǻ� : " + bv.get(i).getBookPublisher());
//           System.out.println("å �ڵ� : " + bv.get(i).getBookCode());
//           System.out.println("å ���� : " + bv.get(i).getBookPrice());
//           System.out.println("å �Ǹŷ� : " + bv.get(i).getBookSale());
//           System.out.println("å ���ǿ��� : " + bv.get(i).getBookYear());
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
   * ���� �˻� �޼ҵ�
   * 
   * stockBook.txt �� �ִ� ������ ������ null���� �ƴ��� �Ǵ��Ͽ�
   * ������ �Է��� ���� ������ ���� ������ ���
   * @throws java.io.IOException ����� ����
   * @author SHY-702-01
   * 
   * 
   */
   
  public void searchBook() throws IOException{
         System.out.print("å ������ �Է����ּ��� : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("å ����: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * ���� �˻� �޼ҵ�
   * 
   * stockBook.txt �� �ִ� ������ ���ڰ� null���� �ƴ��� �Ǵ��Ͽ�
   * ������ �Է��� ���� ������ ���� ������ ���
   * @throws java.io.IOException ����� ����
   */
  public void searchBook2() throws IOException{
         System.out.print("å ���ڸ� �Է����ּ��� : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("å ����: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * ���� �˻� �޼ҵ�
   * 
   * stockBook.txt �� �ִ� ������ ���ǻ簡 null���� �ƴ��� �Ǵ��Ͽ�
   * ������ �Է��� ���� ������ ���� ������ ���
   * @throws java.io.IOException ����� ����
   */
  public void searchBook3() {
      
      System.out.print("å ���ǻ縦 �Է����ּ��� : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("å ���ǻ�: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * ���� �˻� �޼ҵ�
   * 
   * stockBook.txt �� �ִ� ������ �� �ڵ尡 null���� �ƴ��� �Ǵ��Ͽ�
   * ������ �Է��� ���� ������ ���� ������ ���
   * @throws java.io.IOException ����� ����
   */
  public void searchBook4() {
      
      System.out.print("�� �ڵ带 �Է����ּ��� : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("�� �ڵ�: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * ���� �˻� �޼ҵ�
   * 
   * stockBook.txt �� �ִ� ������ å ������ null���� �ƴ��� �Ǵ��Ͽ�
   * ������ �Է��� ���� ������ ���� ������ ���
   * @throws java.io.IOException ����� ����
   */
  public void searchBook5() {
      
      System.out.print("å ������ �Է����ּ��� : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("å ����: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * ���� �˻� �޼ҵ�
   * 
   * stockBook.txt �� �ִ� ������ �Ǹŷ��� null���� �ƴ��� �Ǵ��Ͽ�
   * ������ �Է��� ���� ������ ���� ������ ���
   * @throws java.io.IOException ����� ����
   */
  public void searchBook6() {
      
      System.out.print("å �Ǹŷ��� �Է����ּ��� : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("å �Ǹŷ�: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * ���� �˻� �޼ҵ�
   * 
   * stockBook.txt �� �ִ� ������ å ������ null���� �ƴ��� �Ǵ��Ͽ�
   * ������ �Է��� ���� ������ ���� ������ ���
   * @throws java.io.IOException ����� ����
   */
  public void searchBook7() {
      
      System.out.print("å ������ �Է����ּ��� : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("å ����: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
   /**
    * ���� �Ǹŷ��� ���� �������� ���� �޼ҵ�
    * 
    * ���� ������ ��ϵ� �ؽ�Ʈ ���Ͽ��� �����ų �ؽ�Ʈ������ �����
    * ���� �� ���� ��Ű�鼭 �Ǹŷ��� ���� ������ ���� ���������� �ȴ�
    * 
    * @throws java.io.IOException ����� ����
    * 
    * <p>������������ {@link Book#compareTo(Object)} ����</p>
    * 
    */
  public void sortBook() throws IOException{
      System.out.println("�Ǹŷ��� ���� �������� ����");
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
//         System.out.println("å �̸� : " + bv.get(i).getBookTitle() + "," +(i+1) + "�� : " + bv.get(i).getBookSale());
//      }
   /**
    * ���� ���� �޼ҵ�
    * 
    * ������ �����͵��� ����� ���� �ϳ��� �о�帮�� �����ų �ؽ�Ʈ ���Ͽ� ������,
    * ������ ��ų ��(å�� ����)�� �Է��Ͽ� �������� Ȯ���Ѵٸ�, �� ���� ������Ű�� �� ���� �Ͽ� ���� �ؽ�Ʈ ���Ͽ� ������
    * 
    * @throws java.io.IOException ����� ����
    */

  public void deleteBook1() throws IOException {
      System.out.print("������ å ������ �Է����ּ��� : ");     
      String bT = s.nextLine();
      for (int i=0; i<bv.size(); i++) {
         if (bv.get(i) == null) {
            System.out.println("null���Դϴ�.");
         }
         else if (bT.equals(bv.get(i).getBookTitle())) {
            System.out.println(bT + " å�� �����Ǿ����ϴ�.");
            bookCnt--;
            if (bookCnt == MenuNum.num1) {
               ++bookCnt;
            }
         }
      }
    
      
      File inputFile = new File("stockBook.txt"); //�����ؽ�Ʈ����
      File tempFile = new File("newstockBook.txt"); //�����ų �ؽ�Ʈ����

      BufferedReader reader = new BufferedReader(new FileReader(inputFile));
      BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

      String lineToRemove = bT;
      String currentLine;

      while((currentLine = reader.readLine()) != null) {            
          String trimmedLine = currentLine.trim();
          if(trimmedLine.contains("å ����: "+lineToRemove+"\t")) continue;
          writer.write(currentLine + System.getProperty("line.separator"));
      }
      
      System.out.println("�ش� ������ ������ ��� �����߽��ϴ�.");
      writer.close(); 
      reader.close();
      

      if(inputFile.exists() && tempFile.exists()) {  //���� ���� �� �̸��ٲٱ�             
         inputFile.delete();                      
           tempFile.renameTo(new File("stockBook.txt"));                             
       } else {
           System.out.println("������ �������� �ʽ��ϴ�.");
       }
                                         
   }
  /**
   * ���� ���� �޼ҵ�
   * 
   * ������ �����͵��� ����� ���� �ϳ��� �о�帮��, �����ų �ؽ�Ʈ ���Ͽ� ������
   * ������ ��ų ��(å �ڵ�)�� �Է��Ͽ� �������� Ȯ���Ѵٸ�, �� ���� ������Ű�� �� ���� �Ͽ� ���� �ؽ�Ʈ ���Ͽ� ������
   * 
   * @throws java.io.IOException ����� ����
   */
  public void deleteBook2() throws IOException{
      System.out.print("������ å �ڵ带 �Է����ּ��� : ");
      String bT = s.nextLine();
      for (int i=0; i<bv.size(); i++) {
         if (bv.get(i) == null) {
            //System.out.println("null���Դϴ�.");
         }
         else if (bT.equals(bv.get(i).getBookCode())) {
            System.out.println(bv.get(i).getBookTitle() + " å�� �����Ǿ����ϴ�.");
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
          if(trimmedLine.contains("å �ڵ�: "+lineToRemove+"\t")) continue;
          writer.write(currentLine + System.getProperty("line.separator"));
      }
      System.out.println("�ش� ������ ������ ��� �����߽��ϴ�.");
      writer.close(); 
      reader.close(); 
      
      if(inputFile.exists() && tempFile.exists()) {  //���� ������ �̸��ٲٱ�             
         inputFile.delete();                      
           tempFile.renameTo(new File("stockBook.txt"));                             
       } else {
           System.out.println("������ �������� �ʽ��ϴ�.");
       }
   }
   
 /**
  * ���� ����� �޼ҵ�
  * 
  * u �� overdue�� ���� ���� ��ü�Ǿ��ִ� ��������� �Ǵ���
  * ��ü�Ǿ������ʴٸ� ������ ��¥�� yyyyMMdd�������� �Է¹޾� �� å�� borrow�� ����
  * 
  * @return ��ü�̷� ������ �뿩 �Ұ���
  * @param u �α��� �Ͽ� ������ ������ ����
  * <p>{@link User#getOverdue()} ����</p>
  *
  */
  public void borrowBook(User u)
   {
      
      System.out.println("���� Ȯ��");
        String ID = s.nextLine();
        
        if(ID.equals(u.getID())) 
        {
           if (u.getOverdue() > MenuNum.num0)//��ü �̷��� �ִ��� Ȯ��
           {
              System.out.println("��ü �̷��� �ֱ⿡"+u.getOverdue()+"�� ���� �뿩 �Ұ���");
              return;
           }
        }
      
        System.out.print("���� å�� ���� �����ּ��� : ");
        String bName = s.nextLine();
        for(int i = 0; i<bv.size();i++)
        {
           if(bv.get(i)!=null )
           {
              if(bName.equals(bv.get(i).getBookTitle())) 
              {
                      
                 if(bv.get(i).getBorrow() != MenuNum.num0 )//borrow���� ����ÿ� �������� yyyyMMdd �������� ����Ǿ�����
                 {
                    System.out.println("�̹� ����");break;
                 }
                 else 
                 {
                    System.out.println("���� ��¥�� �Է����ּ���(yyyyMMdd 8�ڸ� ��������) : ");
                    int today = s.nextInt();
                    s.nextLine();
                    bv.get(i).setBorrow(today);//���⳯¥�� borrow�� ����
                    break;
                 }
              }   
         
           }
        }
   }
   
   /**
    *���� �ݳ��� �޼ҵ�  
    *
    *�ݳ����� ��¥�� �Է¹޾� �뿩 �Ⱓ 2�ֿ��� �󸶳� ��ü�Ǿ����� �����
    *��ü����ŭ u�� overdue ���� ���� ��ü �ϼ��� �ø�
    *
    *@param u �α��� �Ͽ� ������ �ݳ��� ����
    */
  public  void returnBook(User u) 
   {   
       System.out.print("�ݳ��� å�� ������ �����ּ��� : ");
       String bName = s.nextLine();

      for(int i = 0; i<bv.size();i++)
      {
         if(bv.get(i)!=null )
         {
            if( bName.equals(bv.get(i).getBookTitle())) 
            {
               if(bv.get(i).getBorrow() == MenuNum.num0)
               {
                  System.out.println("�̹� �ݳ�");
                  break;
               }
               else 
               {
                  long overdue; //��ü�ϼ��� �����ϴ� ����
                  SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");//��¥�� �Է¹޴� ���� ����           
                  Date rt = new Date(); //�ݳ� ��¥�� �����ϴ� ����
                  Date br = new Date(); //���� ��¥�� �����ϴ� ����
                  String temp;
              
                  temp = "" + bv.get(i).getBorrow();
                  System.out.println("���� ��¥�� �Է����ּ��� (yyyyMMdd 8�ڸ����Է����ּ���) : ");
                  //rt = sdf.parse(s.nextLine());
                  //br = sdf.parse(temp);//parse�� ���� string�� date�� ��ȯ
                  try//String�� date �������� ��ȯ�ҽ� ��Ŭ������ parseexception �����������⶧���� try catch�� �ȿ� �� �־����
                  {
                     rt = sdf.parse(s.nextLine());
                     br = sdf.parse(temp);
                  }
                  catch(Exception e)
                  {
                     //TODO: handle exception
                  }
                  overdue = TimeUnit.DAYS.convert(Math.abs(rt.getTime() - br.getTime()), TimeUnit.MILLISECONDS);//�뿩�Ⱓ�� ����
                  if (overdue > 14)//�뿩�ִ� �Ⱓ�� 2��
                  {
                     System.out.println(overdue + "�� ��ŭ ��ü�Ǿ����ϴ�. ��ü�� �ϼ� ��ŭ �뿩�� �Ұ����մϴ�.");
                     bv.get(i).setBorrow(MenuNum.num0);//�ݳ��� �Ǿ����� borrow�� MenuNum.num0���� ����
                     u.setOverdue((int)(overdue));//��ü�� ������ �����ϱ� ���� ��ü�ϼ� ��ŭ overdue�� �缳��
                     break;
                  }
                  System.out.println("�ݳ� ����");
                  bv.get(i).setBorrow(MenuNum.num0) ;
                  break;
               }
            }
         }
         
      }
   }

}