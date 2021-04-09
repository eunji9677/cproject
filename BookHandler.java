package cproject;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**
 * µµ¼­ °ü¸® 
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
    *µµ¼­ ÀÔ·Â ¸Ş¼Òµå
    *
    *Buffered Å¬·¡½º¸¦ »ç¿ëÇÏ¿¡ ÅØ½ºÆ® µ¥ÀÌÅÍ ÆÄÀÏ¿¡ ÀÔ·ÂÇÑ ³»¿ëÀÌ ÀúÀåµÇµµ·Ï ÇÔ
    *book Entity Å¬·¡½º¿¡¼­ set,get¸Ş¼Òµå¸¦ ÅëÇÏ¿© ¸®ÅÏÇÏ¿© °ªÀÌ ÀÖ´ÂÁö È®ÀÎ
    *
    *@throws java.io.IOException ÀÔÃâ·Â °ü·Ã
    *@author SHY-702-01
    */
public void inputBook() throws IOException{

         BufferedWriter bw = new BufferedWriter(new FileWriter("stockBook.txt", true));
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         
         String sPattern = "^[a-zA-Z0-9°¡-ÆR\\s]*$";
         int retry = MenuNum.num0;
         boolean regex;

         do {
            System.out.print("Ã¥ Á¦¸ñ : ");
            String bookTitle = s.nextLine();
            bw.write("Ã¥ Á¦¸ñ: " + bookTitle + "\t");
            regex = Pattern.matches(sPattern, bookTitle);
            if (regex != true) {
               System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
               break;
            }

            System.out.print("Ã¥ ÀúÀÚ : ");
            String bookAuthor = s.nextLine();
            bw.write("Ã¥ ÀúÀÚ: " + bookAuthor + "\t");
            regex = Pattern.matches(sPattern, bookAuthor);
            if (regex != true) {
               System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
               break;
            }

            System.out.print("ÃâÆÇ»ç : ");
            String bookPublisher = s.nextLine();
            bw.write("ÃâÆÇ»ç: " + bookPublisher + "\t" + "\t");
            regex = Pattern.matches(sPattern, bookPublisher);
            if (regex != true) {
               System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
               break;
            }

            System.out.print("Ã¥ ÄÚµå : ");
            String bookCode = s.nextLine();
            bw.write("Ã¥ ÄÚµå: " + bookCode + "\t");
            regex = Pattern.matches(sPattern, bookCode);
            if (regex != true) {
               System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
               break;
            }

            System.out.print("Ã¥ °¡°İ : ");
            int bookPrice = MenuNum.num0;
            if (!s.hasNextInt() || (bookPrice = s.nextInt()) < MenuNum.num0) {
               System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
               break;
            }
            bw.write("Ã¥ °¡°İ: " + bookPrice + "\t");

            System.out.print("Ã¥ ÆÇ¸Å·® : ");
            int bookSale = MenuNum.num0;
            if (!s.hasNextInt() || (bookSale = s.nextInt()) < MenuNum.num0) {
               System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
               break;
            }
            bw.write("Ã¥ ÆÇ¸Å·®: " + bookSale + "\t");

            System.out.print("Ã¥ ÃâÆÇ¿¬µµ : ");
            int bookYear = MenuNum.num0;
            if (!s.hasNextInt() || (bookYear = s.nextInt()) < MenuNum.num0) {
               System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
               break;
            }
            bw.write("Ã¥ ÃâÆÇ¿¬µµ: " + bookYear + "\t");

            s.nextLine();

            int borrow = MenuNum.num0;
            bw.write("´ë¿© Á¤º¸ : 0");
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

            System.out.println("¶Ç ÀÔ·ÂÇÏ½Ã°Ú¾î¿ä? yes..1 no..0");
            retry = s.nextInt();
            if (retry == MenuNum.num0) {
               bw.close();
               break;
            }
            s.nextLine();
         } while (retry != MenuNum.num0);
      }
/**
 * µµ¼­ Ãâ·Â¿ë ¸Ş¼Òµå
 * 
 * File »ı¼ºÀÚ¸¦ »ı¼ºÇÏ¿© ÅØ½ºÆ® ÆÄÀÏ °´Ã¼¸¦ »ı¼º
 * <br>tryCatch()¸¦ »ç¿ëÇÏ¿© ¿¹¿Ü ¹ß»ıÀÌ µÇ¸é ±Ù¿øÁö¸¦ Ã£¾Æ³» ´Ü°èº°·Î ¿¡·¯¸¦ Ãâ·ÂÇÏ°ÔÇÑ´Ù.
 * <br>ÀÔ·Â ¸Ş¼Òµå¸¦ ÅëÇØ ÀúÀåµÈ ÅØ½ºÆ® µ¥ÀÌÅÍÆÄÀÏÀ» ºÒ·¯¿Í¼­
 * readLine¸Ş¼Òµå¸¦ »ç¿ëÇÏ¿© ÇÑÁÙ ÇÑÁÙ ÀĞÀ¸¸ç null°ªÀÌ ¾Æ´Ï¸é ÀĞÀº °ªµéÀ» Ãâ·ÂÇÏ°Ô ÇÑ´Ù.
 * 
 * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
 * 
 * 
 */
   
  public void outBook() throws IOException {
//     for (int i=0; i<bv.size(); i++) {
//        if (bv.get(i) != null) {
//           System.out.println("-------------");
//           System.out.println("Ã¥ Á¦¸ñ : " + bv.get(i).getBookTitle());
//           System.out.println("Ã¥ ÀúÀÚ : " + bv.get(i).getBookAuthor());
//           System.out.println("ÃâÆÇ»ç : " + bv.get(i).getBookPublisher());
//           System.out.println("Ã¥ ÄÚµå : " + bv.get(i).getBookCode());
//           System.out.println("Ã¥ °¡°İ : " + bv.get(i).getBookPrice());
//           System.out.println("Ã¥ ÆÇ¸Å·® : " + bv.get(i).getBookSale());
//           System.out.println("Ã¥ ÃâÆÇ¿¬µµ : " + bv.get(i).getBookYear());
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
   * µµ¼­ °Ë»ö ¸Ş¼Òµå
   * 
   * stockBook.txt ¿¡ ÀÖ´Â °ª¿¡¼­ Á¦¸ñÀÌ null°ªÀÌ ¾Æ´ÑÁö ÆÇ´ÜÇÏ¿©
   * À¯Àú°¡ ÀÔ·ÂÇÑ °ª°ú µ¿ÀÏÇÑ °ªÀÌ ÀÖÀ»½Ã Ãâ·Â
   * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
   * @author SHY-702-01
   * 
   * 
   */
   
  public void searchBook() throws IOException{
         System.out.print("Ã¥ Á¦¸ñÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("Ã¥ Á¦¸ñ: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * µµ¼­ °Ë»ö ¸Ş¼Òµå
   * 
   * stockBook.txt ¿¡ ÀÖ´Â °ª¿¡¼­ ÀúÀÚ°¡ null°ªÀÌ ¾Æ´ÑÁö ÆÇ´ÜÇÏ¿©
   * À¯Àú°¡ ÀÔ·ÂÇÑ °ª°ú µ¿ÀÏÇÑ °ªÀÌ ÀÖÀ»½Ã Ãâ·Â
   * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
   */
  public void searchBook2() throws IOException{
         System.out.print("Ã¥ ÀúÀÚ¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("Ã¥ ÀúÀÚ: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * µµ¼­ °Ë»ö ¸Ş¼Òµå
   * 
   * stockBook.txt ¿¡ ÀÖ´Â °ª¿¡¼­ ÃâÆÇ»ç°¡ null°ªÀÌ ¾Æ´ÑÁö ÆÇ´ÜÇÏ¿©
   * À¯Àú°¡ ÀÔ·ÂÇÑ °ª°ú µ¿ÀÏÇÑ °ªÀÌ ÀÖÀ»½Ã Ãâ·Â
   * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
   */
  public void searchBook3() {
      
      System.out.print("Ã¥ ÃâÆÇ»ç¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("Ã¥ ÃâÆÇ»ç: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * µµ¼­ °Ë»ö ¸Ş¼Òµå
   * 
   * stockBook.txt ¿¡ ÀÖ´Â °ª¿¡¼­ ºÏ ÄÚµå°¡ null°ªÀÌ ¾Æ´ÑÁö ÆÇ´ÜÇÏ¿©
   * À¯Àú°¡ ÀÔ·ÂÇÑ °ª°ú µ¿ÀÏÇÑ °ªÀÌ ÀÖÀ»½Ã Ãâ·Â
   * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
   */
  public void searchBook4() {
      
      System.out.print("ºÏ ÄÚµå¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("ºÏ ÄÚµå: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * µµ¼­ °Ë»ö ¸Ş¼Òµå
   * 
   * stockBook.txt ¿¡ ÀÖ´Â °ª¿¡¼­ Ã¥ °¡°İÀÌ null°ªÀÌ ¾Æ´ÑÁö ÆÇ´ÜÇÏ¿©
   * À¯Àú°¡ ÀÔ·ÂÇÑ °ª°ú µ¿ÀÏÇÑ °ªÀÌ ÀÖÀ»½Ã Ãâ·Â
   * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
   */
  public void searchBook5() {
      
      System.out.print("Ã¥ °¡°İÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("Ã¥ °¡°İ: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * µµ¼­ °Ë»ö ¸Ş¼Òµå
   * 
   * stockBook.txt ¿¡ ÀÖ´Â °ª¿¡¼­ ÆÇ¸Å·®ÀÌ null°ªÀÌ ¾Æ´ÑÁö ÆÇ´ÜÇÏ¿©
   * À¯Àú°¡ ÀÔ·ÂÇÑ °ª°ú µ¿ÀÏÇÑ °ªÀÌ ÀÖÀ»½Ã Ãâ·Â
   * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
   */
  public void searchBook6() {
      
      System.out.print("Ã¥ ÆÇ¸Å·®À» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("Ã¥ ÆÇ¸Å·®: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
  /**
   * µµ¼­ °Ë»ö ¸Ş¼Òµå
   * 
   * stockBook.txt ¿¡ ÀÖ´Â °ª¿¡¼­ Ã¥ ¿¬µµ°¡ null°ªÀÌ ¾Æ´ÑÁö ÆÇ´ÜÇÏ¿©
   * À¯Àú°¡ ÀÔ·ÂÇÑ °ª°ú µ¿ÀÏÇÑ °ªÀÌ ÀÖÀ»½Ã Ãâ·Â
   * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
   */
  public void searchBook7() {
      
      System.out.print("Ã¥ ¿¬µµ¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
         String bT = s.nextLine();    

         File file = new File("stockBook.txt");
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               if(line.contains("Ã¥ ¿¬µµ: "+bT+"\t"))   
                  System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
           
         }                              
      }
   /**
    * µµ¼­ ÆÇ¸Å·®¿¡ µû¸¥ ³»¸²Â÷¼ø Á¤·Ä ¸Ş¼Òµå
    * 
    * ±âÁ¸ µµ¼­°¡ µî·ÏµÈ ÅØ½ºÆ® ÆÄÀÏ¿¡¼­ º¹»ç½ÃÅ³ ÅØ½ºÆ®ÆÄÀÏÀ» ¸¸µé¾î
    * ÇÑÁÙ ¾¿ º¹»ç ½ÃÅ°¸é¼­ ÆÇ¸Å·®¿¡ ÀÇÇØ ÀûÀº°Í ºÎÅÍ ³»¸²Â÷¼øÀÌ µÈ´Ù
    * 
    * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
    * 
    * <p>³»¸²Â÷¼ø°ü·Ã {@link Book#compareTo(Object)} ÂüÁ¶</p>
    * 
    */
  public void sortBook() throws IOException{
      System.out.println("ÆÇ¸Å·®¿¡ µû¸¥ ³»¸²Â÷¼ø Á¤·Ä");
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
//         System.out.println("Ã¥ ÀÌ¸§ : " + bv.get(i).getBookTitle() + "," +(i+1) + "À§ : " + bv.get(i).getBookSale());
//      }
   /**
    * µµ¼­ »èÁ¦ ¸Ş¼Òµå
    * 
    * ±âÁ¸¿¡ µ¥ÀÌÅÍµéÀÌ ÀúÀåµÈ ÆÄÀÏ ÇÏ³ª¾¿ ÀĞ¾îµå¸®¸ç º¹»ç½ÃÅ³ ÅØ½ºÆ® ÆÄÀÏ¿¡ ³ÖÀ¸¸ç,
    * »èÁ¦¸¦ ½ÃÅ³ °ª(Ã¥ÀÇ Á¦¸ñ)À» ÀÔ·ÂÇÏ¿© °°Àº°ªÀ» È®ÀÎÇÑ´Ù¸é, ±× °ª¸¸ »èÁ¦½ÃÅ°°í ´Ù º¹»ç ÇÏ¿© ±âÁ¸ ÅØ½ºÆ® ÆÄÀÏ¿¡ ÀúÀåÇÔ
    * 
    * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
    */

  public void deleteBook1() throws IOException {
      System.out.print("»èÁ¦ÇÒ Ã¥ Á¦¸ñÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");     
      String bT = s.nextLine();
      for (int i=0; i<bv.size(); i++) {
         if (bv.get(i) == null) {
            System.out.println("null°ªÀÔ´Ï´Ù.");
         }
         else if (bT.equals(bv.get(i).getBookTitle())) {
            System.out.println(bT + " Ã¥ÀÌ »èÁ¦µÇ¾ú½À´Ï´Ù.");
            bookCnt--;
            if (bookCnt == MenuNum.num1) {
               ++bookCnt;
            }
         }
      }
    
      
      File inputFile = new File("stockBook.txt"); //±âÁ¸ÅØ½ºÆ®ÆÄÀÏ
      File tempFile = new File("newstockBook.txt"); //º¹»ç½ÃÅ³ ÅØ½ºÆ®ÆÄÀÏ

      BufferedReader reader = new BufferedReader(new FileReader(inputFile));
      BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

      String lineToRemove = bT;
      String currentLine;

      while((currentLine = reader.readLine()) != null) {            
          String trimmedLine = currentLine.trim();
          if(trimmedLine.contains("Ã¥ Á¦¸ñ: "+lineToRemove+"\t")) continue;
          writer.write(currentLine + System.getProperty("line.separator"));
      }
      
      System.out.println("ÇØ´ç µµ¼­ÀÇ Á¤º¸¸¦ ¸ğµÎ »èÁ¦Çß½À´Ï´Ù.");
      writer.close(); 
      reader.close();
      

      if(inputFile.exists() && tempFile.exists()) {  //ÆÄÀÏ »èÁ¦ ¹× ÀÌ¸§¹Ù²Ù±â             
         inputFile.delete();                      
           tempFile.renameTo(new File("stockBook.txt"));                             
       } else {
           System.out.println("ÆÄÀÏÀÌ Á¸ÀçÇÏÁö ¾Ê½À´Ï´Ù.");
       }
                                         
   }
  /**
   * µµ¼­ »èÁ¦ ¸Ş¼Òµå
   * 
   * ±âÁ¸¿¡ µ¥ÀÌÅÍµéÀÌ ÀúÀåµÈ ÆÄÀÏ ÇÏ³ª¾¿ ÀĞ¾îµå¸®¸ç, º¹»ç½ÃÅ³ ÅØ½ºÆ® ÆÄÀÏ¿¡ ³ÖÀ¸¸ç
   * »èÁ¦¸¦ ½ÃÅ³ °ª(Ã¥ ÄÚµå)À» ÀÔ·ÂÇÏ¿© °°Àº°ªÀ» È®ÀÎÇÑ´Ù¸é, ±× °ª¸¸ »èÁ¦½ÃÅ°°í ´Ù º¹»ç ÇÏ¿© ±âÁ¸ ÅØ½ºÆ® ÆÄÀÏ¿¡ ÀúÀåÇÔ
   * 
   * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
   */
  public void deleteBook2() throws IOException{
      System.out.print("»èÁ¦ÇÒ Ã¥ ÄÚµå¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
      String bT = s.nextLine();
      for (int i=0; i<bv.size(); i++) {
         if (bv.get(i) == null) {
            //System.out.println("null°ªÀÔ´Ï´Ù.");
         }
         else if (bT.equals(bv.get(i).getBookCode())) {
            System.out.println(bv.get(i).getBookTitle() + " Ã¥ÀÌ »èÁ¦µÇ¾ú½À´Ï´Ù.");
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
          if(trimmedLine.contains("Ã¥ ÄÚµå: "+lineToRemove+"\t")) continue;
          writer.write(currentLine + System.getProperty("line.separator"));
      }
      System.out.println("ÇØ´ç µµ¼­ÀÇ Á¤º¸¸¦ ¸ğµÎ »èÁ¦Çß½À´Ï´Ù.");
      writer.close(); 
      reader.close(); 
      
      if(inputFile.exists() && tempFile.exists()) {  //ÆÄÀÏ »èÁ¦¹× ÀÌ¸§¹Ù²Ù±â             
         inputFile.delete();                      
           tempFile.renameTo(new File("stockBook.txt"));                             
       } else {
           System.out.println("ÆÄÀÏÀÌ Á¸ÀçÇÏÁö ¾Ê½À´Ï´Ù.");
       }
   }
   
 /**
  * µµ¼­ ´ëÃâ¿ë ¸Ş¼Òµå
  * 
  * u ÀÇ overdueÀÇ °ªÀ» ÅëÇØ ¿¬Ã¼µÇ¾îÀÖ´Â »ç¿ëÀÚÀÎÁö ÆÇ´ÜÇÔ
  * ¿¬Ã¼µÇ¾îÀÖÁö¾Ê´Ù¸é ¿À´ÃÀÇ ³¯Â¥¸¦ yyyyMMddÇü½ÄÀ¸·Î ÀÔ·Â¹Ş¾Æ ±× Ã¥ÀÇ borrow¿¡ ÀúÀå
  * 
  * @return ¿¬Ã¼ÀÌ·Â ÀÖÀ»½Ã ´ë¿© ºÒ°¡´É
  * @param u ·Î±×ÀÎ ÇÏ¿© µµ¼­¸¦ ´ëÃâÇÒ À¯Àú
  * <p>{@link User#getOverdue()} ÂüÁ¶</p>
  *
  */
  public void borrowBook(User u)
   {
      
      System.out.println("À¯Àú È®ÀÎ");
        String ID = s.nextLine();
        
        if(ID.equals(u.getID())) 
        {
           if (u.getOverdue() > MenuNum.num0)//¿¬Ã¼ ÀÌ·ÂÀÌ ÀÖ´ÂÁö È®ÀÎ
           {
              System.out.println("¿¬Ã¼ ÀÌ·ÂÀÌ ÀÖ±â¿¡"+u.getOverdue()+"ÀÏ µ¿¾È ´ë¿© ºÒ°¡´É");
              return;
           }
        }
      
        System.out.print("ºô¸± Ã¥ÀÇ Á¦¸ñ¸¦ ¸»ÇØÁÖ¼¼¿ä : ");
        String bName = s.nextLine();
        for(int i = 0; i<bv.size();i++)
        {
           if(bv.get(i)!=null )
           {
              if(bName.equals(bv.get(i).getBookTitle())) 
              {
                      
                 if(bv.get(i).getBorrow() != MenuNum.num0 )//borrow¿¡´Â ´ëÃâ½Ã¿¡ ´ëÃâÀÏÀÌ yyyyMMdd Çü½ÄÀ¸·Î ÀúÀåµÇ¾îÀÕÀ½
                 {
                    System.out.println("ÀÌ¹Ì ´ëÃâ");break;
                 }
                 else 
                 {
                    System.out.println("¿À´Ã ³¯Â¥¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä(yyyyMMdd 8ÀÚ¸® Çü½ÄÀ¸·Î) : ");
                    int today = s.nextInt();
                    s.nextLine();
                    bv.get(i).setBorrow(today);//´ëÃâ³¯Â¥¸¦ borrow¿¡ ÀúÀå
                    break;
                 }
              }   
         
           }
        }
   }
   
   /**
    *µµ¼­ ¹İ³³¿ë ¸Ş¼Òµå  
    *
    *¹İ³³½ÃÀÇ ³¯Â¥¸¦ ÀÔ·Â¹Ş¾Æ ´ë¿© ±â°£ 2ÁÖ¿¡¼­ ¾ó¸¶³ª ¿¬Ã¼µÇ¾ú´ÂÁö °è»êÈÄ
    *¿¬Ã¼³¯¸¸Å­ uÀÇ overdue °ªÀ» ´õÇØ ¿¬Ã¼ ÀÏ¼ö¸¦ ´Ã¸²
    *
    *@param u ·Î±×ÀÎ ÇÏ¿© µµ¼­¸¦ ¹İ³³ÇÒ À¯Àú
    */
  public  void returnBook(User u) 
   {   
       System.out.print("¹İ³³ÇÒ Ã¥ÀÌ Á¦¸ñÀ» ¸»ÇØÁÖ¼¼¿ä : ");
       String bName = s.nextLine();

      for(int i = 0; i<bv.size();i++)
      {
         if(bv.get(i)!=null )
         {
            if( bName.equals(bv.get(i).getBookTitle())) 
            {
               if(bv.get(i).getBorrow() == MenuNum.num0)
               {
                  System.out.println("ÀÌ¹Ì ¹İ³³");
                  break;
               }
               else 
               {
                  long overdue; //¿¬Ã¼ÀÏ¼ö¸¦ ÀúÀåÇÏ´Â º¯¼ö
                  SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");//³¯Â¥¸¦ ÀÔ·Â¹Ş´Â Çü½Ä ÁöÁ¤           
                  Date rt = new Date(); //¹İ³³ ³¯Â¥¸¦ ÀúÀåÇÏ´Â º¯¼ö
                  Date br = new Date(); //´ëÃâ ³¯Â¥¸¦ ÀúÀåÇÏ´Â º¯¼ö
                  String temp;
              
                  temp = "" + bv.get(i).getBorrow();
                  System.out.println("¿À´Ã ³¯Â¥¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä (yyyyMMdd 8ÀÚ¸®·ÎÀÔ·ÂÇØÁÖ¼¼¿ä) : ");
                  //rt = sdf.parse(s.nextLine());
                  //br = sdf.parse(temp);//parse¸¦ ÅëÇØ stringÀ» date·Î º¯È¯
                  try//StringÀ» date Çü½ÄÀ¸·Î º¯È¯ÇÒ½Ã ÀÌÅ¬¸³¿¡¼­ parseexception ¿¡·¯°¡³ª¿À±â¶§¹®¿¡ try catch¹® ¾È¿¡ ²À ³Ö¾î¾ßÇÔ
                  {
                     rt = sdf.parse(s.nextLine());
                     br = sdf.parse(temp);
                  }
                  catch(Exception e)
                  {
                     //TODO: handle exception
                  }
                  overdue = TimeUnit.DAYS.convert(Math.abs(rt.getTime() - br.getTime()), TimeUnit.MILLISECONDS);//´ë¿©±â°£À» ±¸ÇÔ
                  if (overdue > 14)//´ë¿©ÃÖ´ë ±â°£Àº 2ÁÖ
                  {
                     System.out.println(overdue + "ÀÏ ¸¸Å­ ¿¬Ã¼µÇ¾ú½À´Ï´Ù. ¿¬Ã¼µÈ ÀÏ¼ö ¸¸Å­ ´ë¿©°¡ ºÒ°¡´ÉÇÕ´Ï´Ù.");
                     bv.get(i).setBorrow(MenuNum.num0);//¹İ³³Àº µÇ¾úÀ¸´Ï borrow´Â MenuNum.num0À¸·Î ¼³Á¤
                     u.setOverdue((int)(overdue));//¿¬Ã¼µÈ À¯Àú¸¦ ±¸ºĞÇÏ±â À§ÇØ ¿¬Ã¼ÀÏ¼ö ¸¸Å­ overdue¸¦ Àç¼³Á¤
                     break;
                  }
                  System.out.println("¹İ³³ ¼º°ø");
                  bv.get(i).setBorrow(MenuNum.num0) ;
                  break;
               }
            }
         }
         
      }
   }

}