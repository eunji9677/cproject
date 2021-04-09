package cproject;

import java.util.*;
import java.util.regex.Pattern;
import java.io.*;
import java.text.SimpleDateFormat;
/**
 * AdminHandler´Â admin°ú user¸¦ ±â¹İÀ¸·Î ¸¸µç Controller class ÀÔ´Ï´Ù.
 * <br>Scanner¸¦ ÅëÇÏ¿© °¢°¢ÀÇ Á¤º¸¸¦ »ç¿ëÀÚ·Î ÀÔ·Â¹Ş½À´Ï´Ù.
 * <br>ÀÌ Å¬·¡½º´Â Controller class·Î ´ÙÀ½°ú °°Àº ÇÔ¼ö¸¦ »ç¿ë ÇÒ ¼ö ÀÖ´Ù.
 * CheckAD¸¦ ÅëÇØ °ü¸®ÀÚÀÎÁö ¾Æ´ÑÁö ÀÔ·Â°ªÀ» ÅëÇÏ¿© È®ÀÎÇÕ´Ï´Ù.
 * adminID¿ÍadminPW¸¦ ÅëÇØ °ü¸®ÀÚ°¡ ¸Â´ÂÁö È®ÀÎÇÏ±â À§ÇØ ¾ÆÀÌµğ¿Í ºñ¹Ğ¹øÈ£¸¦ ÀÓÀÇ·Î ¼³Á¤ÇØ Áİ´Ï´Ù.
 * employeeID¿Í employeePW¸¦ ÅëÇØ Á÷¿øÀÌ ¸Â´ÂÁö È®ÀÎÇÏ±â À§ÇØ ¾ÆÀÌµğ¿Í ºñ¹Ğ¹øÈ£¸¦ ÀÓÀÇ·Î ¼³Á¤ÇØ Áİ´Ï´Ù.
 * timerBuffer¸¦ ÅëÇØ ½Ã°£À» °ü¸®ÇÏ´Â ÇÁ·Î±×·¥À» ¸¸µé¾î Áİ´Ï´Ù.
 * <br>{@link #Login(User)}Àº °ü¸®ÀÚ¿Í Á÷¿øÀÇ ·Î±×ÀÎÀ» µ½´Â ÇÔ¼öÀÔ´Ï´Ù.
 * <br>{@link #userLogin(User)}Àº À¯ÀúÀÇ ·Î±×ÀÎÀ» µ½´Â ÇÔ¼öÀÔ´Ï´Ù.
 * <br>{@link #Logout()}Àº ·Î±×¾Æ¿ôÀ» µ½´Â ÇÔ¼öÀÔ´Ï´Ù.
 * <br>{@link #registerUser(User)}´Â È¸¿ø°¡ÀÔÀ» À§ÇÑ ÇÔ¼ö·Î »ç¿ëµË´Ï´Ù.
 * <br>{@link #showUser(User)}´Â »ç¿ëÀÚ°¡ °ü¸®ÀÚ·Î ·Î±×ÀÎÇßÀ» °æ¿ì¿¡ °ü¸®ÀÚ°¡ À¯ÀúÅ¬·¹½ºÀÇ ¸ğµç Á¤º¸¸¦ °¡Áö°í ¿Ã ¼öÀÖ°Ô ÇÏ±âÀ§ÇØ ¸¸µç ÇÔ¼öÀÔ´Ï´Ù.
 * <br>{@link #findID(User)}´Â »ç¿ëÀÚ°¡ ÀÌ¸§À» ÀÔ·ÂÇÏ¿© ¾ÆÀÌµğ¸¦ Ã£´Â ÇÔ¼öÀÔ´Ï´Ù.
 * <br>{@link #findPW(User)}´Â »ç¿ëÀÚ°¡ ¾ÆÀÌµğ¸¦ ÀÔ·ÂÇÏ¿© ÆĞ½º¿öµå¸¦ Ã£´Â ÇÔ¼öÀÔ´Ï´Ù.
 * <br>{@link #removeUser(User)}´Â À¯Àú°¡ Å»ÅğÇÒ ¼ö ÀÖµµ·Ï ¸¸µé¾î ÁØ ÇÔ¼öÀÔ´Ï´Ù.
 * <br>{@link #searchUser(User)}´Â »ç¿ëÀÚ°¡ °ü¸®ÀÚ·Î ·Î±×ÀÎÇßÀ» °æ¿ì¿¡ °ü¸®ÀÚ°¡  À¯Àú¸¦ °Ë»öÇÒ ¼ö ÀÖ°Ô ÇÏ±â À§ÇØ ¸¸µç ÇÔ¼öÀÔ´Ï´Ù.
 * <br>{@link #deleteUser(User)}´Â »ç¿ëÀÚ°¡ °ü¸®ÀÚ·Î ·Î±×ÀÎÇßÀ» °æ¿ì¿¡ °ü¸®ÀÚ°¡ À¯Àú¸¦ »èÁ¦ÇÏ´Â ÇÔ¼öÀÔ´Ï´Ù.
 * <br>{@link #sortUser(User)}´Â »ç¿ëÀÚ°¡ °ü¸®ÀÚ·Î ·Î±×ÀÎÇßÀ» °æ¿ì¿¡ °ü¸®ÀÚ°¡ À¯Àú¸ñ·ÏÀ» Á¤·ÄÇÒ¶§ »ç¿ëÇÏ´Â ÇÔ¼ö ÀÔ´Ï´Ù.
 * <br>{@link #readingRoomUse()}´Â µ¶¼­½ÇÀ» ´ë¿©ÇÒ ¼ö ÀÖ´Â ÇÔ¼öÀÔ´Ï´Ù.
 * <br>{@link #secToHHMMSS()}´Â µ¶¼­½ÇÀÇ Å¸ÀÌ¸Ó¸¦ À§ÇÑ ½Ã½ºÅÛ ÇÔ¼öÀÔ´Ï´Ù.
 * @see User#User()
 * @see User#User(String, String, String, String)
 * @see ReadingRoom#ReadingRoom()
 * @see ReadingRoom#ReadingRoom(String, String, String, String, int)
 * @see ReadingRoom#ReadingRoom()
 * @author SHY-702-04
 * 
 *
 */



public class AdminHandler {
	
	//Scanner¸¦ ÅëÇÏ¿© »ç¿ëÀÚ°¡ °ªÀ» ÀÔ·ÂÇÒ ¼ö ÀÖ°Ô µµ¿ÍÁİ´Ï´Ù.
	Scanner s;
	
	//LoginCnt¸¦ ÅëÇØ ·Î±×ÀÎ ¿©ºÎ¸¦ È®ÀÎÇÕ´Ï´Ù.1ÀÌ¸é ·Î±×ÀÎ¼º°ø, 0ÀÌ¸é ·Î±×¾Æ¿ô
	public int LoginCnt = 0;
	
	//AdminCheck¸¦ ÅëÇØ °ü¸®ÀÚ ¿©ºÎ ÆÇ´ÜÇÕ´Ï´Ù. 0ÀÌ¸é °ü¸®ÀÚ ¾Æ´Ô, 1ÀÌ¸é °ü¸®ÀÚ
	public int AdminCheck;
	
	//User¸¦ »ı¼ºÇÏ¿© User class°¡ »ç¿ë °¡´ÉÇÏµµ·Ï ¸¸µé¾î Áİ´Ï´Ù.
	User u = new User();
	
	//º¤ÅÍ¸¦ ÀÌ¿ëÇÏ¿© User¿Í User¿¡ »ó¼ÓµÈ °ªÀ»(Admin,Employee) »ç¿ë ÇÒ ¼ö ÀÖ°Ô ÇÕ´Ï´Ù. 
	Vector<User> v = new Vector<User>();
	

	
	ReadingRoom rent = new ReadingRoom(); 
	ReadingRoom[] r1 = new ReadingRoom[200];
	
	public String adminID = "admin";
	public String adminPW = "admin";
	public String employeeID = "emp";
	public String employeePW = "emp";
	public static String timerBuffer;
	Date date = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static int count;
    Timer timer = new Timer();
    Calendar cal = Calendar.getInstance();
    /**
	 * µğÆúÆ® »ı¼ºÀÚ 
	 * <br>Scanner¸¦ »ı¼ºÇØ ÁÖ¾ú½À´Ï´Ù.
	 */
	
	public AdminHandler() {
		s = new Scanner(System.in);
	}
	/**
	 * CheckAD¸¦ ÅëÇØ °ü¸®ÀÚÀÎÁö ¾Æ´ÑÁö ÀÔ·Â°ªÀ» ÅëÇÏ¿© È®ÀÎÇÕ´Ï´Ù.
	 * @return AdminCheck °ü¸®ÀÚ¿©ºÎ È®ÀÎ
	 */
	
	public int CheckAD() {
		AdminCheck = Integer.parseInt(s.nextLine());
		return AdminCheck;
	}
	/**
	 * LoginÀº °ü¸®ÀÚ¿Í Á÷¿øÀÇ ·Î±×ÀÎÀ» µ½´Â ÇÔ¼öÀÔ´Ï´Ù.
	 * {@link #v}User¸¦ º¤ÅÍ·Î ¹Ş¾Æ¿Í Admin°ú Employee¸¦ ÀÔÃô·ÂÇÏ´Â °ªÀÔ´Ï´Ù.
	 * trueÀÎ µ¿¾È 
	 * »ç¿ëÀÚ°¡ ID¿Í PW¸¦ ÀÔ·ÂÇÕ´Ï´Ù.
	 * ¸¸¾à¿¡ ID°¡ adminID¿Í °°°Å³ª employeeID¿Í °°°í, 
	 * PW°¡ adminPW¿Í °°°Å³ª employeePW¿Í °°Àº°æ¿ì¿¡ ·Î±×ÀÎ ¼º°ø ¸àÆ®¸¦ ¶ç¿î ÈÄ break¸¦ ÅëÇØ ¸ØÃä´Ï´Ù.
	 * <br> ±×·¸Áö ¾ÊÀº °æ¿ì¿¡´Â ÀÔ·ÂÇÏ½Å ID¿Í PW°¡ ÀÏÄ¡ÇÏÁö ¾Ê½À´Ï´Ù.¶ó°í ¸àÆ®¸¦ ³¯¸° ÈÄ break¸¦ ·ÇØ ¸ØÃä´Ï´Ù.
	 * break½ÇÇàÀÌ ³¡ÀÌ ³ª¸é  ·Î±×ÀÎÀ» ¶æÇÏ´Â LoginCnt¿¡ 1À» ´ëÀÔÇØ Áİ´Ï´Ù.
	 * @param u User À¯ÀúÅ¬·¡½º¿Í À¯ÀúÅ¬·¡½º¸¦ »ó¼Ó¹ŞÀº Admin Å¬·¡½º¿Í EmployeeÅ¬·¡½ºÀÇ ¸ğµç ¸Å°³º¯¼ö
	 * @return 1 ·Î±×ÀÎ °ªÀÌ ÀúÀåµË´Ï´Ù.
	 */
	
	public int Login(User u) {

		while(true)
		{
			System.out.print(" ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
			String ID = s.nextLine();
			System.out.print(" PW¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
			String PW = s.nextLine();

			if(ID.equals(adminID)&&PW.equals(adminPW)||ID.equals(employeeID)&&PW.equals(employeePW)) {
				System.out.println("·Î±×ÀÎ ¼º°ø");break;
			}else
				System.out.println("ÀÔ·ÂÇÏ½Å ID¿Í PW°¡ ÀÏÄ¡ÇÏÁö ¾Ê½À´Ï´Ù.");		
				}
		LoginCnt = MenuNum.num1;
		return LoginCnt;
		
	}

	/**
	 * userLogin´Â À¯ÀúÀÇ ·Î±×ÀÎÀ» µ½´Â ÇÔ¼öÀÔ´Ï´Ù.
	 * {@link #v}User¸¦ º¤ÅÍ·Î ¹Ş¾Æ¿É´Ï´Ù.
	 *  »ç¿ëÀÚ°¡ ID¿Í PW¸¦ ÀÔ·ÂÇÕ´Ï´Ù.
	 *  ¸¸¾à¿¡ ID¿ÍPW°¡ {@link #registerUser(User)}¿¡ ÀÔ·ÂÇß´ø
	 *   ID¿ÍPW¶û µ¿ÀÏÇÏ´Ù¸é "·Î±×ÀÎ ¼º°ø"À» ÇÁ¸°Æ®ÇÑ ÈÄ LoginCnt¿¡ 1À» ´ëÀÔÇØ ÁÖ°í break·Î ¸ØÃç Áİ´Ï´Ù.   
	 *   <br>±×·¸Áö ¾Ê´Â °æ¿ì¿¡´Â "µî·ÏµÇÁö ¾ÊÀº »ç¿ëÀÚÀÔ´Ï´Ù. È¸¿ø°¡ÀÔÀ» ½ÃÀÛÇÕ´Ï´Ù." ¸àÆ®¸¦ ÇÁ¸°Æ®ÇÑ ÈÄ
	 *   LoginCnt¿¡ 0À» ´ëÀÔÇØ ÁÖ°í °¡ÀÔÇÔ¼öÀÎ {@link #registerUser(User)}¿¡ ³Ñ¾î°¡°í break·Î ¸ØÃç Áİ´Ï´Ù.
	 *   <br>ÇÏ³ªÀÇ ÄÄÇ»ÅÍ´ç ÇÏ³ªÀÇ ·Î±×ÀÎ¸¸ °¡´ÉÇÏ±â ¶§¹®¿¡ ÇÑ¹øÀÇ ·Î±×ÀÎ¸¸ Çã¿ëÇÏ°Ô ¸¸µé¾ú°í ÇÑ¹ø ·Î±×ÀÎ ÇÏ¸é °è¼Ó ±× ¾ÆÀÌµğ¸¦ ÅëÇÏ¿© »ç¿ëÇÏ°Ô µË´Ï´Ù.
	 * @param u User À¯ÀúÅ¬·¡½º¿Í À¯ÀúÅ¬·¡½º¸¦ »ó¼Ó¹ŞÀº Admin Å¬·¡½º¿Í EmployeeÅ¬·¡½ºÀÇ ¸ğµç ¸Å°³º¯¼ö
	 */
	public void userLogin(User u) {
		System.out.print("»ç¿ëÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
		String ID = s.nextLine();
		System.out.print("»ç¿ëÀÚ PW¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
		String PW = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)!=null) {
				if(ID.equals(v.get(i).getID())&&PW.equals(v.get(i).getPW())) {
					System.out.println("·Î±×ÀÎ ¼º°ø");
					LoginCnt = MenuNum.num1;
					
					break;
				}			
			}else
			{
				System.out.println("µî·ÏµÇÁö ¾ÊÀº »ç¿ëÀÚÀÔ´Ï´Ù. È¸¿ø°¡ÀÔÀ» ½ÃÀÛÇÕ´Ï´Ù.");
				LoginCnt = MenuNum.num0;
				registerUser(u);
				break;
			}
		}
		//return v.get(i).LoginCnt;
	}
	/**
	 * LogoutÀº ·Î±×¾Æ¿ôÀ» µ½´Â ÇÔ¼öÀÔ´Ï´Ù.
	 * ·Î±×¾Æ¿ôÀ» ¿øÇÒ ¶§ ·Î±×¾Æ¿ôÀÌ µÇ¸é¼­ LoginCnt°¡ 0À¸·Î º¯°æµË´Ï´Ù.
	 * <br>·Î±×ÀÎ¿¡¼­ÀÇ ¿ä±¸ »çÇ×À¸·Î ÀÎÇØ ·Î±×¾Æ¿ô ¶ÇÇÑ ´Ü¼øÈ÷ ·Î±×¾Æ¿ôÀÌ µÇ°í Ä«¿îÅÍ°¡ ³»·Á°¡´Â ¹æ½ÄÀ¸·Î ±¸¼ºÇß½À´Ï´Ù.
	 * 
	 */
	
	public void Logout() {
		System.out.println("·Î±×¾Æ¿ô µÇ¾ú½À´Ï´Ù.");
		LoginCnt = MenuNum.num0;
	}
	/**
	 * registerUser´Â È¸¿ø°¡ÀÔÀ» À§ÇÑ ÇÔ¼ö·Î »ç¿ëµË´Ï´Ù.
	 * <br>sPattern¿¡ ¿µ¹®°ú ¼ıÀÚ¸¸ ÀÔ·Â°¡´ÉÇÑ Á¤±ÔÇ¥Çö½ÄÀ» ÀÔ·ÂÇÏ¿© È£ÃâÇÒ ¼ö ÀÖµµ·Ï Á¤ÀÇÇÏ°í Á¤±ÔÇ¥Çö½ÄÀÌ ¸ÂÁö ¾ÊÀ¸¸é ½ÇÇàÀ» ¸ØÃç 
	 * "¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä "¸¦ ÇÁ¸°Æ®ÇØ¼­ ¾î¶² ¿À·ùÀÎÁö Ç¥ÇöÇØ ÁÖ¾ú½À´Ï´Ù.
	 * <br>do-whlie¹®À» ÅëÇÏ¿© retry°¡ 0ÀÌ ¾Æ´Ñ°æ¿ì¿¡¸¸ ¹İº¹ÇÏµµ·Ï ¸¸µé¾î ÁÖ±â À§ÇØ ¸¶Áö¸· ¹®Àå¿¡ retry¸¦ Scanner·Î ¹Ş¾Æ¿É´Ï´Ù.
	 * "¶Ç ÀÔ·ÂÇÏ½Ã°Ú¾î¿ä? yes..1 no..0"¶ó´Â ¸¶Áö¸· ¹®±¸¿¡ 0ÀÌ ¾Æ´Ï¸é °è¼Ó ¹İº¹ÇÒ ¼ö ÀÖ°Ô ÇÏ±â À§ÇÔÀÔ´Ï´Ù.
	 * <br>"ÀÌ¸§À» ÀÔ·Â ÇÏ¼¼¿ä :" ¶ó´Â Ã¢ÀÌ ¶ß¸é Name¿¡ »ç¿ëÀÚ°¡ ÀÌ¸§À» ÀÔ·ÂÇÒ ¼ö ÀÖ°í  ±× ÀÌ¸§ÀÌ Á¤±ÔÇ¥Çö½Ä¿¡ ¸ÂÁö ¾ÊÀ¸¸é À§¿¡¼­ Ç¥ÇöÇÑ °Í°ú °°Àº
	 *  ¹®±¸¸¦ ÇÁ¸°Æ®ÇØ¼­ ¾î¶² ¿À·ùÀÎÁö Ç¥ÇöÇØ ÁØ ÈÄ break¸¦ ÅëÇÏ¿© ¸ØÃä´Ï´Ù.
	 *  <br>"ÀüÈ­¹øÈ£¸¦ ÀÔ·Â ÇÏ¼¼¿ä :" ¶ó´Â Ã¢ÀÌ ¶ß¸é Tel¿¡ »ç¿ëÀÚ°¡ ÀüÈ­¹øÈ£¸¦ ÀÔ·ÂÇÒ ¼ö ÀÖ°í  ±× ÀüÈ­¹øÈ£°¡ ¼ıÀÚ Á¤±ÔÇ¥Çö½Ä¿¡ ¸ÂÁö ¾ÊÀ¸¸é À§¿¡¼­ Ç¥ÇöÇÑ °Í°ú °°Àº
	 *  ¹®±¸¸¦ ÇÁ¸°Æ®ÇØ¼­ ¾î¶² ¿À·ùÀÎÁö Ç¥ÇöÇØ ÁØ ÈÄ break¸¦ ÅëÇÏ¿© ¸ØÃß´Â °ÍÀ» Ç¥ÇöÇÏ·Á ÇßÀ¸³ª °úÁ¦ Á¦Ãâ¿ë ÇÁ·Î±×·¥ÀÌ±â ¶§¹®¿¡ °£´ÜÈ÷ ÇÏ±â À§ÇØ À§¿Í °°Àº Ç¥Çö½ÄÀ» ÇÔ²² »ç¿ëÇÏ¿´½À´Ï´Ù..
	 *  <br>"¾ÆÀÌµğ¸¦ ÀÔ·Â ÇÏ¼¼¿ä :" ¶ó´Â Ã¢ÀÌ ¶ß¸é ID¿¡ »ç¿ëÀÚ°¡ ¾ÆÀÌµğ¸¦ ÀÔ·ÂÇÒ ¼ö ÀÖ°í  ±× ¾ÆÀÌµğ°¡ Á¤±ÔÇ¥Çö½Ä¿¡ ¸ÂÁö ¾ÊÀ¸¸é À§¿¡¼­ Ç¥ÇöÇÑ °Í°ú °°Àº
	 *  ¹®±¸¸¦ ÇÁ¸°Æ®ÇØ¼­ ¾î¶² ¿À·ùÀÎÁö Ç¥ÇöÇØ ÁØ ÈÄ break¸¦ ÅëÇÏ¿© ¸ØÃä´Ï´Ù.
	 *  <br>"ÆĞ½º¿öµå¸¦ ÀÔ·Â ÇÏ¼¼¿ä :" ¶ó´Â Ã¢ÀÌ ¶ß¸é PW¿¡ »ç¿ëÀÚ°¡ ÆĞ½º¿öµå¸¦ ÀÔ·ÂÇÒ ¼ö ÀÖ°í  ±× ÆĞ½º¿öµå°¡ Á¤±ÔÇ¥Çö½Ä¿¡ ¸ÂÁö ¾ÊÀ¸¸é À§¿¡¼­ Ç¥ÇöÇÑ °Í°ú °°Àº
	 *  ¹®±¸¸¦ ÇÁ¸°Æ®ÇØ¼­ ¾î¶² ¿À·ùÀÎÁö Ç¥ÇöÇØ ÁØ ÈÄ break¸¦ ÅëÇÏ¿© ¸ØÃä´Ï´Ù.
	 *  <br>¸ğµÎ ÀÔ·ÂÀ» ¸¶Ä¡¸é AdminCheck¸¦ ÅëÇÏ¿© °ü¸®ÀÚ°¡ ¾Æ´ÔÀ» Ç¥ÇöÇÏ±â À§ÇØ 1À» ´ëÀÔÇØ Áİ´Ï´Ù.
	 *  <br>°¢ User class¿¡¼­ ¸¸µé¾ú´ø setÇÔ¼ö¿¡ ¸ğµç Á¤º¸¸¦ ÀúÀåÇÏ°í º¤ÅÍ¿¡ ÀúÀåÇØ Áİ´Ï´Ù.
	 *  <br>¸¶Áö¸·À¸·Î "È¸¿ø µî·ÏÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù."¶ó´Â ¹®±¸¿Í ÇÕ²² "¶Ç ÀÔ·ÂÇÏ½Ã°Ú¾î¿ä? yes..1 no..0"¶ó´Â ¹®±¸°¡ ÇÁ¸°Æ®µÇ°í 0ÀÌ ¾Æ´Ï¸é ´Ù¸¥ ÇÔ¼ö·Î ³Ñ¾î°©´Ï´Ù.
	 * @param u User À¯ÀúÅ¬·¡½º¿Í À¯ÀúÅ¬·¡½º¸¦ »ó¼Ó¹ŞÀº Admin Å¬·¡½º¿Í EmployeeÅ¬·¡½ºÀÇ ¸ğµç ¸Å°³º¯¼öÀÇ ¸ğµç ¸Å°³º¯¼ö
	 */
	public void registerUser(User u) {	
		
	      String sPattern = "^[a-zA-Z0-9°¡-ÆR\\s]*$";
	      int retry = MenuNum.num0;
	      boolean regex;
	      
	      do {
				System.out.print("ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä : ");
				String Name = s.nextLine();
				 regex = Pattern.matches(sPattern, Name);
		         if(regex != true) {
		            System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
		            break;
		         }
		         
		         
				System.out.print("ÀüÈ­¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
				String Tel = s.nextLine();
				regex = Pattern.matches(sPattern, Tel);
		         if(regex != true) {
		            System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
		            break;
		         }
		         
		         
				System.out.print("ID¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
				String ID = s.nextLine();
				regex = Pattern.matches(sPattern, ID);
		         if(regex != true) {
		            System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
		            break;
		         }
		         
				System.out.print("PW¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
				String PW = s.nextLine();
				regex = Pattern.matches(sPattern, PW);
		         if(regex != true) {
		            System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
		            break;
		         }
				
				AdminCheck = MenuNum.num1;

				u.setName(Name);
				u.setTel(Tel);
				u.setID(ID);
				u.setPW(PW);
				v.add(new User(Name,Tel,ID,PW));

				System.out.println("È¸¿ø µî·ÏÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù.");
				
				
				System.out.println("¶Ç ÀÔ·ÂÇÏ½Ã°Ú¾î¿ä? yes..1 no..0");
		        retry = s.nextInt();
		        s.nextLine();
	      }while(retry!=MenuNum.num0);
	}
	
	/**
	 * showUser´Â »ç¿ëÀÚ°¡ °ü¸®ÀÚ·Î ·Î±×ÀÎÇßÀ» °æ¿ì¿¡ °ü¸®ÀÚ°¡ À¯ÀúÅ¬·¹½ºÀÇ ¸ğµç Á¤º¸¸¦ °¡Áö°í ¿Ã ¼öÀÖ°Ô ÇÏ±âÀ§ÇØ ¸¸µç ÇÔ¼öÀÔ´Ï´Ù.
	 * i°¡ º¤ÅÍÀ¯Àú»çÀÌÁî¿Í ÀÏÄ¡ÇÒ¶§ ±îÁö ¹İº¹µÇ°í 
	 * À¯ÀúÅ¬·¡½º°¡ nullÀÌ ¾Æ´Ò °æ¿ì ¸ğµç À¯ÀúÀÇ Á¤º¸¸¦ Ãâ·ÂÇÕ´Ï´Ù.
	 * @param u User À¯ÀúÅ¬·¡½º¿Í À¯ÀúÅ¬·¡½º¸¦ »ó¼Ó¹ŞÀº Admin Å¬·¡½º¿Í EmployeeÅ¬·¡½ºÀÇ ¸ğµç ¸Å°³º¯¼ö
	 */
	
	public void showUser(User u) {
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)!=null )
            {
				v.get(i).showUser();;
            }

		}
	}
	
	/**
	 * findID´Â »ç¿ëÀÚ°¡ ÀÌ¸§À» ÀÔ·ÂÇÏ¿© ¾ÆÀÌµğ¸¦ Ã£´Â ÇÔ¼öÀÔ´Ï´Ù.
	 * <br>¸¸¾à À¯ÀúÅ¬·¡½ºÀÇ i°¡ º¤ÅÍÀ¯Àú»çÀÌÁî¿Í ÀÏÄ¡ÇÒ¶§ ±îÁö ¹İº¹µÇ°í À¯Àú°¡ nullÀÌ ¾Æ´Ñ °æ¿ì 
	 * <br>¸¸¾à¿¡ »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ NameÀÌ º¤ÅÍÀ¯Àú¿¡ ÀúÀåµÇ¾îÀÖ´Â NameÀÇ °ª°ú ÀÏÄ¡ÇÑ °ÍÀÌ ÀÖÀ¸¸é 
	 * <br>ÀúÀåµÇ¾î ÀÖ´ø ÀÌ¸§°ú ÇÔ²² ¾ÆÀÌµğ¸¦ Ãâ·ÂÇÕ´Ï´Ù.
	 * @param u User À¯ÀúÅ¬·¡½º¿Í À¯ÀúÅ¬·¡½º¸¦ »ó¼Ó¹ŞÀº Admin Å¬·¡½º¿Í EmployeeÅ¬·¡½ºÀÇ ¸ğµç ¸Å°³º¯¼ö
	 */
	
	public void findID(User u) {
		System.out.print("»ç¿ëÀÚ ÀÌ¸§À» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
		String Name = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)!=null) {
				if(Name.equals(v.get(i).getName())) {
					System.out.println(v.get(i).getName()+"ÀÇ ID´Â "+v.get(i).getID()+"ÀÔ´Ï´Ù.");
				}
			}
		}
	}
	/**
	 * findPW´Â »ç¿ëÀÚ°¡ ¾ÆÀÌµğ¸¦ ÀÔ·ÂÇÏ¿© ÆĞ½º¿öµå¸¦ Ã£´Â ÇÔ¼öÀÔ´Ï´Ù.
	 * <br>À¯ÀúÅ¬·¡½ºÀÇ i°¡ º¤ÅÍÀ¯Àú»çÀÌÁî¿Í ÀÏÄ¡ÇÒ¶§ ±îÁö ¹İº¹µÇ°í À¯Àú°¡ nullÀÌ ¾Æ´Ñ °æ¿ì 
	 * <br>¸¸¾à¿¡ »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ID°¡ º¤ÅÍÀ¯Àú¿¡ ÀúÀåµÇ¾îÀÖ´Â IDÀÇ °ª°ú ÀÏÄ¡ÇÑ °ÍÀÌ ÀÖÀ¸¸é 
	 * <br>ÀúÀåµÇ¾î ÀÖ´ø ¾ÆÀÌµğ¿Í ÇÔ²² ÆĞ½º¿öµå¸¦ Ãâ·ÂÇÕ´Ï´Ù.
	 * @param u User À¯ÀúÅ¬·¡½º¿Í À¯ÀúÅ¬·¡½º¸¦ »ó¼Ó¹ŞÀº Admin Å¬·¡½º¿Í EmployeeÅ¬·¡½ºÀÇ ¸ğµç ¸Å°³º¯¼ö
	 */
	public void findPW(User u) {
		System.out.print("»ç¿ëÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
		String ID = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)!=null) {
				if(ID.equals(v.get(i).getID())) {
					System.out.println(v.get(i).getID()+"ÀÇ PW´Â "+v.get(i).getPW()+"ÀÔ´Ï´Ù.");
				}
			}
		}
	}
	/**
	 * removeUser´Â À¯Àú°¡ Å»ÅğÇÒ ¼ö ÀÖµµ·Ï ¸¸µé¾î ÁØ ÇÔ¼öÀÔ´Ï´Ù.
	 * "Á¤¸»·Î Å»ÅğÇÏ½Ã°Ú½À´Ï±î? : Å»Åğ¸é ¾ÆÀÌµğ ÀÔ·Â"¶ó´Â ¹®±¸¸¦ ÇÁ¸°Æ®ÇØ Å»ÅğÇÏ°Ú´Ù°í ÇÏ¸é »ç¿ëÀÚ·Î ºÎÅÍ ¾ÆÀÌµğ¸¦ ÀÔ·Â¹Ş°í
	 * <br>À¯ÀúÅ¬·¡½ºÀÇ i°¡ º¤ÅÍÀ¯Àú»çÀÌÁî¿Í ÀÏÄ¡ÇÒ¶§ ±îÁö ¹İº¹µÇ°í À¯Àú°¡ nullÀÌ ¾Æ´Ñ °æ¿ì 
	 * <br>¸¸¾à¿¡ »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ID°¡ º¤ÅÍÀ¯Àú¿¡ ÀúÀåµÇ¾îÀÖ´Â IDÀÇ °ª°ú ÀÏÄ¡ÇÑ °ÍÀÌ ÀÖÀ¸¸é 
	 * <br>ÀúÀåµÇ¾î ÀÖ´ø ¾ÆÀÌµğ¿Í °ü·ÃµÈ ¸ğµç Á¤º¸¸¦ ¹éÅÍ¸¦ ÅëÇØ Áö¿öÁİ´Ï´Ù.
	 * ±×¿Í µ¿½Ã¿¡ LOginCnt¿¡ 0À» ´ëÀÔÇÏ¿© ·Î±×ÀÎÀÌ µÇ¾îÀÖ´ø °ÍÀÌ ·Î±×¾Æ¿ôÀÌ µË´Ï´Ù.
	 * @param u User À¯ÀúÅ¬·¡½º¿Í À¯ÀúÅ¬·¡½º¸¦ »ó¼Ó¹ŞÀº Admin Å¬·¡½º¿Í EmployeeÅ¬·¡½ºÀÇ ¸ğµç ¸Å°³º¯¼ö
	 */
	
	public void removeUser(User u){
		System.out.println("Á¤¸»·Î Å»ÅğÇÏ½Ã°Ú½À´Ï±î? : Å»Åğ¸é ¾ÆÀÌµğ ÀÔ·Â");
		String ID = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)==null) {
				System.out.println("null°ªÀÔ´Ï´Ù.");
			}
			else if(ID.equals(v.get(i).getID())) {
				v.remove(i);
				System.out.println(ID+"°¡ »èÁ¦µÇ¾ú½À´Ï´Ù.");
				LoginCnt = MenuNum.num0;
					
			}//else 
				//System.out.println("ÀÏÄ¡ ¾ÈÇÔ");
		}
	}
	/**
	 * searchUser´Â »ç¿ëÀÚ°¡ °ü¸®ÀÚ·Î ·Î±×ÀÎÇßÀ» °æ¿ì¿¡ °ü¸®ÀÚ°¡  À¯Àú¸¦ °Ë»öÇÒ ¼ö ÀÖ°Ô ÇÏ±â À§ÇØ ¸¸µç ÇÔ¼öÀÔ´Ï´Ù.
	 * <br>"°Ë»öÇÒ »ç¿ëÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä"¶ó´Â ¹®±¸°¡ ÇÁ¸°Æ® µÇ¸é »ç¿ëÀÚ°¡ À¯ÀúÀÇ ¾ÆÀÌµğ¸¦ ÀÔ·ÂÇØ Áİ´Ï´Ù.
	 * <br>À¯ÀúÅ¬·¡½ºÀÇ i°¡ º¤ÅÍÀ¯Àú»çÀÌÁî¿Í ÀÏÄ¡ÇÒ¶§ ±îÁö ¹İº¹µÇ°í À¯Àú°¡ nullÀÌ ¾Æ´Ñ °æ¿ì 
	 * <br>¸¸¾à¿¡ »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ID°¡ º¤ÅÍÀ¯Àú¿¡ ÀúÀåµÇ¾îÀÖ´Â IDÀÇ °ª°ú ÀÏÄ¡ÇÑ °ÍÀÌ ÀÖÀ¸¸é 
	 * <br>"Ã£À¸½Ã´Â »ç¿ëÀÚ Á¤º¸´Â "°ú" ÀÔ´Ï´Ù. "¶ó´Â ¹®±¸ »çÀÌ¿¡ ÀúÀåµÇ¾î ÀÖ´ø ¾ÆÀÌµğ¿Í °ü·ÃµÈ ¸ğµç Á¤º¸¸¦
	 *  {@link #showUser(User)}¸¦ ÅëÇØ º¸¿©Áİ´Ï´Ù.
	 * @param u User À¯ÀúÅ¬·¡½º¿Í À¯ÀúÅ¬·¡½º¸¦ »ó¼Ó¹ŞÀº Admin Å¬·¡½º¿Í EmployeeÅ¬·¡½ºÀÇ ¸ğµç ¸Å°³º¯¼ö
	 */
	
	public void searchUser(User u){
		System.out.print("°Ë»öÇÒ »ç¿ëÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä");
		String ID = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)!=null) {
				if(ID.equals(v.get(i).getID())) {
					System.out.println("Ã£À¸½Ã´Â »ç¿ëÀÚ Á¤º¸´Â ");
					v.get(i).showUser();
					System.out.print(" ÀÔ´Ï´Ù. ");
				}
//				else 
//					System.out.println("¤Ç¤Ì¤Á");
			}
		}
	}
	/**
	 * deleteUser´Â »ç¿ëÀÚ°¡ °ü¸®ÀÚ·Î ·Î±×ÀÎÇßÀ» °æ¿ì¿¡ °ü¸®ÀÚ°¡ À¯Àú¸¦ »èÁ¦ÇÏ´Â ÇÔ¼öÀÔ´Ï´Ù.
	 * <br>"»èÁ¦ÇÒ »ç¿ëÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä :"¶ó´Â ¹®±¸°¡ ÇÁ¸°Æ® µÇ¸é »ç¿ëÀÚ°¡ À¯ÀúÀÇ ¾ÆÀÌµğ¸¦ ÀÔ·ÂÇØ Áİ´Ï´Ù.
	 * <br> i°¡ º¤ÅÍÀ¯Àú»çÀÌÁî¿Í ÀÏÄ¡ÇÒ¶§ ±îÁö ¹İº¹µÇ°í À¯Àú°¡ nullÀÌ ¾Æ´Ñ °æ¿ì 
	 * <br>¸¸¾à¿¡ »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ID°¡ º¤ÅÍÀ¯Àú¿¡ ÀúÀåµÇ¾îÀÖ´Â IDÀÇ °ª°ú ÀÏÄ¡ÇÑ °ÍÀÌ ÀÖÀ¸¸é 
	 * <br>ÀúÀåµÇ¾î ÀÖ´ø ¾ÆÀÌµğ¿Í °ü·ÃµÈ ¸ğµç Á¤º¸¸¦ ¹éÅÍ¸¦ ÅëÇØ Áö¿öÁİ´Ï´Ù.
	 * @param u User À¯ÀúÅ¬·¡½º¿Í À¯ÀúÅ¬·¡½º¸¦ »ó¼Ó¹ŞÀº Admin Å¬·¡½º¿Í EmployeeÅ¬·¡½ºÀÇ ¸ğµç ¸Å°³º¯¼ö
	 */
	
	public void deleteUser(User u) {
		System.out.print("»èÁ¦ÇÒ »ç¿ëÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä :");
		String ID = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
			{
				if(v.get(i)==null) {
					//System.out.println("null°ªÀÔ´Ï´Ù.");
				}
				else if(ID.equals(v.get(i).getID())) {
						v.remove(i);
						System.out.println(ID+"°¡ »èÁ¦µÇ¾ú½À´Ï´Ù.");
						//userCnt--;
						//LoginCnt = MenuNum.num0;
				}//else 
					//System.out.println("ÀÏÄ¡ ¾ÈÇÔ");
			}
		}
	/**
	 * sortUser´Â »ç¿ëÀÚ°¡ °ü¸®ÀÚ·Î ·Î±×ÀÎÇßÀ» °æ¿ì¿¡ °ü¸®ÀÚ°¡ À¯Àú¸ñ·ÏÀ» Á¤·ÄÇÒ¶§ »ç¿ëÇÏ´Â ÇÔ¼ö ÀÔ´Ï´Ù.
	 * <br>º¤Å×¹è¿­ÀÇ sort¸¦ ÅëÇÏ¿© ¹è¿­À» Á¤·ÄÇØÁİ´Ï´Ù.
	 * <br>i°¡ º¤ÅÍÀ¯Àú»çÀÌÁî¿Í ÀÏÄ¡ÇÒ¶§ ±îÁö ¹İº¹µÇ°í {@link #showUser(User)}¸¦ ÅëÇÏ¿© 
	 * @param u User À¯ÀúÅ¬·¡½º¿Í À¯ÀúÅ¬·¡½º¸¦ »ó¼Ó¹ŞÀº Admin Å¬·¡½º¿Í EmployeeÅ¬·¡½ºÀÇ ¸ğµç ¸Å°³º¯¼ö
	 */
	
	public void sortUser(User u) {
		System.out.println("À¯Àú¸ñ·ÏÀ» Á¤·ÄÇÕ´Ï´Ù.");
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
		Collections.sort(v);
		
		for(int i = 0; i < v.size();i++)
		{
			v.get(i).showUser();	
		}
	}
	
	/**
	 * readingRoomUse´Â µ¶¼­½ÇÀ» ´ë¿©ÇÒ ¼ö ÀÖ´Â ÇÔ¼öÀÔ´Ï´Ù.
	 * "¸î ¹ø ÁÂ¼®À» »ç¿ëÇÏ½Ã°Ú½À´Ï±î ?"°¡ ÇÁ¸°Æ®µÇ¸é numÀ» ÅëÇØ ÁÂ¼®À» ¼±ÅÃÇÏ°í 
	 * ¸¸¾à ÀÔ·ÂÇÑ °ªÀÌ room¾È¿¡ ÀÖ´Â °ªÀÌ°í 0ÀÏ¶§ "ÇØ´ç ÁÂ¼®Àº »ç¿ë°¡´ÉÇÕ´Ï´Ù. "ÇØ´ç ÁÂ¼®À» »ç¿ëÇÏ°Ú½À´Ï±î? yes..1, no..0"¸¦ ÇÁ¸°Æ®ÇÕ´Ï´Ù.
	 * ¶Ç´Â ÀÔ·ÂÇÑ °ªÀÇ roomÀÌ 1ÀÌ¸é "ÇØ´ç ÁÂ¼®Àº »ç¿ëÁßÀÔ´Ï´Ù."¶ó°í ÇÁ¸°Æ® µË´Ï´Ù.
	 * µÑ´Ù ¾Æ´Ï¸é "Àß¸øµÈ ÀÔ·ÂÀÔ´Ï´Ù. ´Ù½Ã ¼±ÅÃÇØ ÁÖ¼¼¿ä"¶ó°í ÇÁ¸°Æ® µË´Ï´Ù.
	 * ÇÁ¸°Æ® ÈÄ checkNumÀÌ 1ÀÌ¸é "ÇØ´ç ÁÂ¼®À» »ç¿ëÇÏ½Ç ¼ö ÀÖ½À´Ï´Ù."ÀÇ ¸àÆ®¸¦ ÇÁ¸°Æ®ÇÏ°í ¼±ÅÃÇÑ ÁÂ¼®À» 1·Î º¯°æÇØ »ç¿ëÁßÀ¸·Î ¸¸µç ÈÄ 
	 * {@link #secToHHMMSS()}ÇÔ¼ö¸¦ È£ÃâÇØ Å¸ÀÌ¸Ó¸¦ ½ÃÀÛÇÕ´Ï´Ù. 
	 * <br> ¸¸¾à checkNumÀÌ 0ÀÏ °æ¿ì "ÇØ´ç ÁÂ¼®À» »ç¿ëÇÏ½Ç ¼ö ¾ø½À´Ï´Ù. ´Ù¸¥ ÁÂ¼®À» ¼±ÅÃÇØÁÖ¼¼¿ä."¶ó°í ÇÁ¸°Æ®ÇÕ´Ï´Ù.
	 * 
	 * User À¯ÀúÅ¬·¡½º¿Í À¯ÀúÅ¬·¡½º¸¦ »ó¼Ó¹ŞÀº Admin Å¬·¡½º¿Í EmployeeÅ¬·¡½ºÀÇ ¸ğµç ¸Å°³º¯¼ö
	 */
	
	public void readingRoomUse() {
	      System.out.println("¸î ¹ø ÁÂ¼®À» »ç¿ëÇÏ½Ã°Ú½À´Ï±î ?");
	      int num = s.nextInt();//ÁÂ¼®¼±ÅÃ
	   

	         if(rent.room[num-1]==0) {//¹è¿­Àº 0ºÎÅÍ ½ÃÀÛÀÌ¹Ç·Î ÀÔ·Â°ª-1À» ÇØÁà¾ß ±× ¹æÀ¸·Î µé¾î°¨
	            System.out.println("ÇØ´ç ÁÂ¼®Àº »ç¿ë°¡´ÉÇÕ´Ï´Ù. ÇØ´ç ÁÂ¼®À» »ç¿ëÇÏ°Ú½À´Ï±î? yes..1, no..0");
	            int checkNum = s.nextInt();
	               if(checkNum==1) {
	                  System.out.println("ÇØ´ç ÁÂ¼®À» »ç¿ëÇÏ½Ç ¼ö ÀÖ½À´Ï´Ù.");
	                  rent.room[num-1] = 1;
	                  //secToHHMMSS();//Å¸ÀÌ¸ÓÇÔ¼ö È£Ãâ
	                  
	                  }
	               else if(checkNum == 0) {
	                  System.out.println("ÇØ´ç ÁÂ¼®À» »ç¿ëÇÏ½Ç ¼ö ¾ø½À´Ï´Ù. ´Ù¸¥ ÁÂ¼®À» ¼±ÅÃÇØÁÖ¼¼¿ä."); 
	                  }else
	                     System.out.println("Àß¸øµÈ ÀÔ·ÂÀÔ´Ï´Ù. ´Ù½Ã ¼±ÅÃÇØ ÁÖ¼¼¿ä"); 
	         }else if(rent.room[num-1]==1) {
	            System.out.println("ÇØ´ç ÁÂ¼®Àº »ç¿ëÁßÀÔ´Ï´Ù.");
	         }else
	            System.out.println("Àß¸øµÈ ÀÔ·ÂÀÔ´Ï´Ù. ´Ù½Ã ¼±ÅÃÇØ ÁÖ¼¼¿ä");
	      
	   }

	/**
	 * secToHHMMSS()´Â µ¶¼­½ÇÀÇ Å¸ÀÌ¸Ó¸¦ À§ÇÑ ½Ã½ºÅÛ ÇÔ¼öÀÔ´Ï´Ù.
	 * cal.setTime(date)À¸·Î Date °´Ã¼¸¦ 1970 ³â 1 ¿ù 1 ÀÏ 00:00:00 UTCºÎÅÍ ¹Ğ¸® ÃÊ ´ÜÀ§·Î ³ªÅ¸³»´Â ½Ã°£À¸·Î ¼³Á¤ÇÕ´Ï´Ù.
	 * cal.add(Calendar.MINUTE, 120)À¸·Î cal °´Ã¼ÀÇ MINUTE¸¦ 120ºĞ Ãß°¡ÇÔ = 2½Ã°£ ´Ã·ÁÁİ´Ï´Ù.
	 * currentTime¿¡ formatÀ¸·Î ÇöÀç½Ã°¢À» ¹®ÀÚ¿­·Î ÃÊ±âÈ­ÇÏ°í 
	 * finishTime¿¡ cal.getTime()¸¦ ³Ö¾î 120ºĞ Ãß°¡ÇÑ cal °´Ã¼¸¦ ¹®ÀÚ¿­·Î ÃÊ±âÈ­ÇØÁİ´Ï´Ù.
	 * "ÇöÀç ½Ã°¢Àº " + currentTime+"ÀÔ´Ï´Ù."¶ó°í ÇÁ¸°Æ® ÇÏ¿© ÇöÀç ½Ã°¢À» º¸¿©ÁÖ°í
	 * "ÀÌ¿ë°¡´ÉÇÑ ½Ã°¢Àº " + finishTime+"±îÁö ÀÔ´Ï´Ù."¶ó°í ÇÁ¸°Æ®ÇÏ¿© »ç¿ë °¡´É ½Ã°¢À» º¸¿©Áİ´Ï´Ù.
	 * TimerTask¸¦ È£ÃâÇÏ¿© run()ÀÌ ½ÃÀÛµÇ´Â µ¿¾È count¸¦ 1¾¿ ´õÇØÁİ´Ï´Ù.
	 * i°¡ r1ÀÇ ±æÀÌ°¡ µÇ´Â µ¿¾È±îÁö timer.schedule(timerTask, 0, 1800000)¸¦ ¶æÇÏ´Â ¹®ÀåÀÌ 30ºĞÀ» ÀÇ¹ÌÇÏ±â ¶§¹®¿¡
	 *  count°¡ 4¹ø ½ÇÇàµÇµµ·ÏÇÏ¿© 120ºĞÀ» ¼³Á¤ÇÏ°í ½ÇÇàÀÌ ³¡³ª¸é rent.room[i]°¡ 0ÀÌ µÇ¸é¼­ Å¸ÀÌ¸Ó°¡ Á¾·áµË´Ï´Ù.
	 */
	public void secToHHMMSS() {
	      cal.setTime(date);//Date °´Ã¼¸¦ 1970 ³â 1 ¿ù 1 ÀÏ 00:00:00 UTCºÎÅÍ ¹Ğ¸® ÃÊ ´ÜÀ§·Î ³ªÅ¸³»´Â ½Ã°£À¸·Î ¼³Á¤ÇÕ´Ï´Ù.
	      cal.add(Calendar.MINUTE, 120);//cal °´Ã¼ÀÇ MINUTE¸¦ 120ºĞ Ãß°¡ÇÔ = 2½Ã°£ ´Ã¸²
	      String currentTime = dateFormat.format(new Date());//ÇöÀç½Ã°£À» ¹®ÀÚ¿­·Î ÃÊ±âÈ­
	      String finishTime = dateFormat.format(cal.getTime());//120ºĞ Ãß°¡ÇÑ cal °´Ã¼¸¦ ¹®ÀÚ¿­·Î ÃÊ±âÈ­
	      
	      System.out.println("ÇöÀç ½Ã°¢Àº " + currentTime+"ÀÔ´Ï´Ù.");
	      System.out.println("ÀÌ¿ë°¡´ÉÇÑ ½Ã°¢Àº " + finishTime+"±îÁö ÀÔ´Ï´Ù.");
	            
	      TimerTask timerTask = new TimerTask() {//Timer Å¬·¡½º°¡ ¼öÇàÇÒ ÀÛ¾÷À» ³ªÅ¸³½´Ù.
	         @Override
	         public void run() {
	            count++;
	            for(int i = 0; i<r1.length;i++)
	            {
	               if(count<4) {//4¹ø ½ÇÇà
	               }else {
	                  rent.room[i] = 0;//4¹ø ½ÇÇà³¡³ª¸é 0À¸·Î ÃÊ±âÈ­ÇÏ¿© Àç»ç¿ë°¡´É
	                  timer.cancel();//Å¸ÀÌ¸Ó Á¾·á
	               }
	               
	            }
	         }
	      
	      };
	      timer.schedule(timerTask, 0, 1800000);//30ºĞµ¿¾È Å¸ÀÌ¸Ó¸¦ ½ÇÇà
	                                   // 30*4 = 120ÀÌ¹Ç·Î 4¹ø ½ÇÇàÈÄ Å¸ÀÌ¸Ó¸¦ Á¾·á½ÃÅ²´Ù.
	   }
}
