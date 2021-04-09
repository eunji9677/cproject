//package cproject;
//import java.util.*;
//import java.util.regex.Pattern;
//import java.io.*;
//import java.text.SimpleDateFormat;
///**
// * AdminHandler´Â admin°ú user¸¦ ±â¹İÀ¸·Î ¸¸µç Controller class ÀÔ´Ï´Ù.
// * <br>Scanner¸¦ ÅëÇÏ¿© °¢°¢ÀÇ Á¤º¸¸¦ »ç¿ëÀÚ·Î ÀÔ·Â¹Ş½À´Ï´Ù.
// * @author SHY-702-04
// * @see User#User()
// * @see User#User(String, String, String, String)
// * @see ReadingRoom#ReadingRoom()
// * @see ReadingRoom#ReadingRoom(String, String, String, String, int)
// *
// */
//public class AdminHandler {
//	
//	
//	//Scanner¸¦ ÅëÇÏ¿© »ç¿ëÀÚ°¡ °ªÀ» ÀÔ·ÂÇÒ ¼ö ÀÖ°Ô µµ¿ÍÁİ´Ï´Ù.
//	Scanner s;
//	
//	//LoginCnt¸¦ ÅëÇØ ·Î±×ÀÎ ¿©ºÎ¸¦ È®ÀÎÇÕ´Ï´Ù.1ÀÌ¸é ·Î±×ÀÎ¼º°ø, 0ÀÌ¸é ·Î±×¾Æ¿ô
//	int LoginCnt = 0;
//	
//	//AdminCheck¸¦ ÅëÇØ °ü¸®ÀÚ ¿©ºÎ ÆÇ´ÜÇÕ´Ï´Ù. 0ÀÌ¸é °ü¸®ÀÚ ¾Æ´Ô, 1ÀÌ¸é °ü¸®ÀÚ
//	int AdminCheck;
//	
//	//User¸¦ »ı¼ºÇÏ¿© User class°¡ »ç¿ë °¡´ÉÇÏµµ·Ï ¸¸µé¾î Áİ´Ï´Ù.
//	User u = new User();
//	
//	//º¤ÅÍ¸¦ ÀÌ¿ëÇÏ¿© User¿Í User¿¡ »ó¼ÓµÈ °ªÀ»(Admin,Employee) »ç¿ë ÇÒ ¼ö ÀÖ°Ô ÇÕ´Ï´Ù. 
//	Vector<User> v = new Vector<User>();
//	
//	
//	ReadingRoom rent = new ReadingRoom(); 
//	
//	String adminID = "admin";
//	String adminPW = "admin";
//	String employeeID = "emp";
//	String employeePW = "emp";
//	static String timerBuffer;
//	static int oldTime;
//	Date date = new Date();
//	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	
//	/**
//	 * µğÆúÆ® »ı¼ºÀÚ 
//	 * <br>Scanner¸¦ »ı¼ºÇØ ÁÖ¾ú½À´Ï´Ù.  
//	 */
//	
//	public AdminHandler() {
//		s = new Scanner(System.in);
//	}
//	/**
//	 * CheckAD¸¦ ÅëÇØ °ü¸®ÀÚÀÎÁö ¾Æ´ÑÁö ÀÔ·Â°ªÀ» ÅëÇÏ¿© È®ÀÎÇÕ´Ï´Ù.
//	 * @return AdminCheck °ü¸®ÀÚ¿©ºÎ È®ÀÎ
//	 */
//	
//	int CheckAD() {
//		AdminCheck = Integer.parseInt(s.nextLine());
//		return AdminCheck;
//	}
//	/**
//	 * °ü¸®ÀÚ¿Í Á÷¿øÀÇ ·Î±×ÀÎÀ» µ½´Â ÇÔ¼öÀÔ´Ï´Ù.
//	 * {@link #v}User¸¦ º¤ÅÍ·Î ¹Ş¾Æ¿Í Admin°ú Employee¸¦ ÀÔÃô·ÂÇÏ´Â °ªÀÔ´Ï´Ù.
//	 * trueÀÎ µ¿¾È 
//	 * »ç¿ëÀÚ°¡ ID¿Í PW¸¦ ÀÔ·ÂÇÕ´Ï´Ù.
//	 * ¸¸¾à¿¡ ID°¡ adminID¿Í °°°Å³ª employeeID¿Í °°°í, 
//	 * PW°¡ adminPW¿Í °°°Å³ª employeePW¿Í °°Àº°æ¿ì¿¡ ·Î±×ÀÎ ¼º°ø ¸àÆ®¸¦ ¶ç¿î ÈÄ break¸¦ ÅëÇØ ¸ØÃä´Ï´Ù.
//	 * <br> ±×·¸Áö ¾ÊÀº °æ¿ì¿¡´Â ÀÔ·ÂÇÏ½Å ID¿Í PW°¡ ÀÏÄ¡ÇÏÁö ¾Ê½À´Ï´Ù.¶ó°í ¸àÆ®¸¦ ³¯¸° ÈÄ break¸¦ ·ÇØ ¸ØÃä´Ï´Ù.
//	 * break½ÇÇàÀÌ ³¡ÀÌ ³ª¸é  ·Î±×ÀÎÀ» ¶æÇÏ´Â LoginCnt¿¡ 1À» ´ëÀÔÇØ Áİ´Ï´Ù.
//	 * @param u UserÀÇ ¸ğµç ¸Å°³º¯¼ö¸¦ ¹Ş¾Æ¿Ã ¼ö ÀÖ½À´Ï´Ù.
//	 * @return 1 ·Î±×ÀÎ °ªÀÌ ÀúÀåµË´Ï´Ù.
//	 */
//	
//	int Login(User u) {
//
//		while(true)
//		{
//			System.out.print(" ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//			String ID = s.nextLine();
//			System.out.print(" PW¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//			String PW = s.nextLine();
//
//			if(ID.equals(adminID)&&PW.equals(adminPW)||ID.equals(employeeID)&&PW.equals(employeePW)) {
//				System.out.println("·Î±×ÀÎ ¼º°ø");break;
//			}else
//				System.out.println("ÀÔ·ÂÇÏ½Å ID¿Í PW°¡ ÀÏÄ¡ÇÏÁö ¾Ê½À´Ï´Ù.");		
//				}
//		LoginCnt = MenuNum.num1;
//		return LoginCnt;
//		
//	}
//
//	/**
//	 * À¯ÀúÀÇ ·Î±×ÀÎÀ» µ½´Â ÇÔ¼öÀÔ´Ï´Ù.
//	 * {@link #v}User¸¦ º¤ÅÍ·Î ¹Ş¾Æ¿É´Ï´Ù.
//	 *  »ç¿ëÀÚ°¡ ID¿Í PW¸¦ ÀÔ·ÂÇÕ´Ï´Ù.
//	 *  ¸¸¾à¿¡ ID¿ÍPW°¡ {@link #registerUser(User)}¿¡ ÀÔ·ÂÇß´ø
//	 *   ID¿ÍPW¶û µ¿ÀÏÇÏ´Ù¸é "·Î±×ÀÎ ¼º°ø"À» ÇÁ¸°Æ®ÇÑ ÈÄ LoginCnt¿¡ 1À» ´ëÀÔÇØ ÁÖ°í break·Î ¸ØÃç Áİ´Ï´Ù.   
//	 *   <br>±×·¸Áö ¾Ê´Â °æ¿ì¿¡´Â "µî·ÏµÇÁö ¾ÊÀº »ç¿ëÀÚÀÔ´Ï´Ù. È¸¿ø°¡ÀÔÀ» ½ÃÀÛÇÕ´Ï´Ù." ¸àÆ®¸¦ ÇÁ¸°Æ®ÇÑ ÈÄ
//	 *   LoginCnt¿¡ 0À» ´ëÀÔÇØ ÁÖ°í °¡ÀÔÇÔ¼öÀÎ {@link #registerUser(User)}¿¡ ³Ñ¾î°¡°í break·Î ¸ØÃç Áİ´Ï´Ù.
//	 * @param u
//	 */
//	void userLogin(User u) {
//		System.out.print("»ç¿ëÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//		String ID = s.nextLine();
//		System.out.print("»ç¿ëÀÚ PW¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//		String PW = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)!=null) {
//				if(ID.equals(v.get(i).getID())&&PW.equals(v.get(i).getPW())) {
//					System.out.println("·Î±×ÀÎ ¼º°ø");
//					LoginCnt = MenuNum.num1;
//					
//					break;
//				}			
//			}else
//			{
//				System.out.println("µî·ÏµÇÁö ¾ÊÀº »ç¿ëÀÚÀÔ´Ï´Ù. È¸¿ø°¡ÀÔÀ» ½ÃÀÛÇÕ´Ï´Ù.");
//				LoginCnt = MenuNum.num0;
//				registerUser(u);
//				break;
//			}
//		}
//		//return v.get(i).LoginCnt;
//	}
//	/**
//	 * ·Î±×¾Æ¿ôÀ» ¿øÇÒ ¶§ ·Î±×¾Æ¿ôÀÌ µÇ¸é¼­ LoginCnt°¡ 0À¸·Î º¯°æµË´Ï´Ù.
//	 */
//	
//	void Logout() {
//		System.out.println("·Î±×¾Æ¿ô µÇ¾ú½À´Ï´Ù.");
//		LoginCnt = MenuNum.num0;
//	}
//	
//	void registerUser(User u) {	
//		
//	      String sPattern = "^[a-zA-Z0-9°¡-ÆR\\s]*$";
//	      int retry = MenuNum.num0;
//	      boolean regex;
//	      
//	      do {
//				System.out.print("ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä : ");
//				String Name = s.nextLine();
//				 regex = Pattern.matches(sPattern, Name);
//		         if(regex != true) {
//		            System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
//		            break;
//		         }
//		         
//		         
//				System.out.print("ÀüÈ­¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
//				String Tel = s.nextLine();
//				regex = Pattern.matches(sPattern, Tel);
//		         if(regex != true) {
//		            System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
//		            break;
//		         }
//		         
//		         
//				System.out.print("ID¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
//				String ID = s.nextLine();
//				regex = Pattern.matches(sPattern, ID);
//		         if(regex != true) {
//		            System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
//		            break;
//		         }
//		         
//				System.out.print("PW¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
//				String PW = s.nextLine();
//				regex = Pattern.matches(sPattern, PW);
//		         if(regex != true) {
//		            System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
//		            break;
//		         }
//				
//				AdminCheck = MenuNum.num1;
//				
//				//User user = new User(Name, Tel, ID, PW);
//				u.setName(Name);
//				u.setTel(Tel);
//				u.setID(ID);
//				u.setPW(PW);
//				v.add(new User(Name,Tel,ID,PW));
//				//v.add(u);
//				//userCnt++;
//				System.out.println("È¸¿ø µî·ÏÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù.");
//				
//				
//				System.out.println("¶Ç ÀÔ·ÂÇÏ½Ã°Ú¾î¿ä? yes..1 no..0");
//		        retry = s.nextInt();
//		        s.nextLine();
//	      }while(retry!=MenuNum.num0);
//	}
//	
//	void showUser(User u) {
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)!=null )
//            {
//				v.get(i).showUser();;
//            }
//			//else 
//				//System.out.println("ÀÔ·ÂµÈ À¯Àú°¡ ¾ø½À´Ï´Ù. »ç¿ëÀÚ¸¦ Ãß°¡ÇØÁÖ¼¼¿ä.");
//		}
//	}
//	
//	
//	
//	void findID(User u) {
//		System.out.print("»ç¿ëÀÚ ÀÌ¸§À» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//		String Name = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)!=null) {
//				if(Name.equals(v.get(i).getName())) {
//					System.out.println(v.get(i).getName()+"ÀÇ ID´Â "+v.get(i).getID()+"ÀÔ´Ï´Ù.");
//				}
//			}
//		}
//	}
//	
//	void findPW(User u) {
//		System.out.print("»ç¿ëÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)!=null) {
//				if(ID.equals(v.get(i).getID())) {
//					System.out.println(v.get(i).getID()+"ÀÇ PW´Â "+v.get(i).getPW()+"ÀÔ´Ï´Ù.");
//				}
//			}
//		}
//	}
//	
//	void removeUser(User u){
//		System.out.println("Á¤¸»·Î Å»ÅğÇÏ½Ã°Ú½À´Ï±î? : Å»Åğ¸é ¾ÆÀÌµğ ÀÔ·Â");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)==null) {
//				System.out.println("null°ªÀÔ´Ï´Ù.");
//			}
//			else if(ID.equals(v.get(i).getID())) {
//				v.remove(i);
//				System.out.println(ID+"°¡ »èÁ¦µÇ¾ú½À´Ï´Ù.");
//				LoginCnt = MenuNum.num0;
//					
//			}//else 
//				//System.out.println("ÀÏÄ¡ ¾ÈÇÔ");
//		}
//	}
//	/**
//	 * »ç¿ëÀÚ°¡ °ü¸®ÀÚ·Î ·Î±×ÀÎÇßÀ» °æ¿ì¿¡ °ü¸®ÀÚ°¡ 
//	 * @param u
//	 */
//	
//	void searchUser(User u){
//		System.out.print("°Ë»öÇÒ »ç¿ëÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)!=null) {
//				if(ID.equals(v.get(i).getID())) {
//					System.out.println("Ã£À¸½Ã´Â »ç¿ëÀÚ Á¤º¸´Â ");
//					v.get(i).showUser();
//					System.out.print(" ÀÔ´Ï´Ù. ");
//				}
////				else 
////					System.out.println("¤Ç¤Ì¤Á");
//			}
//		}
//	}
//	
//	void deleteUser(User u) {
//		System.out.print("»èÁ¦ÇÒ »ç¿ëÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä :");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//			{
//				if(v.get(i)==null) {
//					//System.out.println("null°ªÀÔ´Ï´Ù.");
//				}
//				else if(ID.equals(v.get(i).getID())) {
//						v.remove(i);
//						System.out.println(ID+"°¡ »èÁ¦µÇ¾ú½À´Ï´Ù.");
//						//userCnt--;
//						LoginCnt = MenuNum.num0;
//				}//else 
//					//System.out.println("ÀÏÄ¡ ¾ÈÇÔ");
//			}
//		}
//	
//	void sortUser(User u) {
//		System.out.println("À¯Àú¸ñ·ÏÀ» Á¤·ÄÇÕ´Ï´Ù.");
//		 for(int i = 0; i<v.size();i++)
//         {
//         if(v.get(i)==null )
//            {
//               u.setName("a"+i);
//               u.setTel("010"+i);
//               u.setID("user"+(i+1));
//               u.setPW("user"+(i+1));
//               v.add(u);
//               System.out.println("»ı¼ºÀÚ¸¦ Ãß°¡ÇÏ¿´½À´Ï´Ù.");
//            } 
//         }
//		 
//		Collections.sort(v);
//		
//		for(int i = 0; i < v.size();i++)
//		{
//			v.get(i).showUser();	
//		}
//	}
//	
//	void readingRoomUse() {
//		System.out.println("¸î ¹ø ÁÂ¼®À» »ç¿ëÇÏ½Ã°Ú½À´Ï±î ?");
//		int num = s.nextInt();
//
//		
//		
//		for(int i = 0; i<rent.room.length;i++)
//		{
//			if(rent.room[i]==MenuNum.num0) {
//				System.out.println("ÇØ´ç ÁÂ¼®Àº »ç¿ë°¡´ÉÇÕ´Ï´Ù. ÇØ´ç ÁÂ¼®À» »ç¿ëÇÏ°Ú½À´Ï±î? yes..1, no..0");
//				num = s.nextInt();
//					if(num==MenuNum.num1) {
//						System.out.println("ÇØ´ç ÁÂ¼®À» »ç¿ëÇÏ½Ç ¼ö ÀÖ½À´Ï´Ù.");
//						rent.room[i] = MenuNum.num1;
//						secToHHMMSS();
//						break;
//						}
//					else if(num == MenuNum.num0) {
//						System.out.println("ÇØ´ç ÁÂ¼®À» »ç¿ëÇÏ½Ç ¼ö ¾ø½À´Ï´Ù."); break;
//						}else
//							System.out.println("Àß¸øµÈ ÀÔ·ÂÀÔ´Ï´Ù. ´Ù½Ã ¼±ÅÃÇØ ÁÖ¼¼¿ä"); break;
//			}else if(rent.room[i]==MenuNum.num1) {
//				System.out.println("ÇØ´ç ÁÂ¼®Àº »ç¿ëÁßÀÔ´Ï´Ù.");
//				secToHHMMSS();break;
//				
//			}else if(rent.room[i]==MenuNum.num2) {
//				System.out.println("ÇØ´ç ÁÂ¼®Àº ¹èÁ¤ÁßÀÔ´Ï´Ù.");break;
//			}else
//				System.out.println("Àß¸øµÈ ÀÔ·ÂÀÔ´Ï´Ù. ´Ù½Ã ¼±ÅÃÇØ ÁÖ¼¼¿ä");break;
//			
//		}
//		
//	}
//	
//	void secToHHMMSS() {
//		int hour,min,sec;
//		int secs = 7200;
////		oldTime = (int)System.currentTimeMillis()/1000;
////		sec = oldTime;
////		min = oldTime*60;
////		hour = oldTime*3600;
//		String nowTime2 = dateFormat.format(date);
//
//		System.out.println("3 : nowTime2 == "+nowTime2);
//		
//		//timerBuffer = String.format("%02d:%02d:%02d", hour,min,sec);
//		System.out.format("³²Àº ½Ã°£ : "+timerBuffer+"\n");
//	}
//	
//
//}