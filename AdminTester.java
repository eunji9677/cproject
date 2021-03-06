//package cproject;
//import java.util.*;
//import java.util.regex.Pattern;
//import java.io.*;
//import java.text.SimpleDateFormat;
///**
// * AdminHandler는 admin과 user를 기반으로 만든 Controller class 입니다.
// * <br>Scanner를 통하여 각각의 정보를 사용자로 입력받습니다.
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
//	//Scanner를 통하여 사용자가 값을 입력할 수 있게 도와줍니다.
//	Scanner s;
//	
//	//LoginCnt를 통해 로그인 여부를 확인합니다.1이면 로그인성공, 0이면 로그아웃
//	int LoginCnt = 0;
//	
//	//AdminCheck를 통해 관리자 여부 판단합니다. 0이면 관리자 아님, 1이면 관리자
//	int AdminCheck;
//	
//	//User를 생성하여 User class가 사용 가능하도록 만들어 줍니다.
//	User u = new User();
//	
//	//벡터를 이용하여 User와 User에 상속된 값을(Admin,Employee) 사용 할 수 있게 합니다. 
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
//	 * 디폴트 생성자 
//	 * <br>Scanner를 생성해 주었습니다.  
//	 */
//	
//	public AdminHandler() {
//		s = new Scanner(System.in);
//	}
//	/**
//	 * CheckAD를 통해 관리자인지 아닌지 입력값을 통하여 확인합니다.
//	 * @return AdminCheck 관리자여부 확인
//	 */
//	
//	int CheckAD() {
//		AdminCheck = Integer.parseInt(s.nextLine());
//		return AdminCheck;
//	}
//	/**
//	 * 관리자와 직원의 로그인을 돕는 함수입니다.
//	 * {@link #v}User를 벡터로 받아와 Admin과 Employee를 입츌력하는 값입니다.
//	 * true인 동안 
//	 * 사용자가 ID와 PW를 입력합니다.
//	 * 만약에 ID가 adminID와 같거나 employeeID와 같고, 
//	 * PW가 adminPW와 같거나 employeePW와 같은경우에 로그인 성공 멘트를 띄운 후 break를 통해 멈춥니다.
//	 * <br> 그렇지 않은 경우에는 입력하신 ID와 PW가 일치하지 않습니다.라고 멘트를 날린 후 break를 톻해 멈춥니다.
//	 * break실행이 끝이 나면  로그인을 뜻하는 LoginCnt에 1을 대입해 줍니다.
//	 * @param u User의 모든 매개변수를 받아올 수 있습니다.
//	 * @return 1 로그인 값이 저장됩니다.
//	 */
//	
//	int Login(User u) {
//
//		while(true)
//		{
//			System.out.print(" ID를 입력해주세요 : ");
//			String ID = s.nextLine();
//			System.out.print(" PW를 입력해주세요 : ");
//			String PW = s.nextLine();
//
//			if(ID.equals(adminID)&&PW.equals(adminPW)||ID.equals(employeeID)&&PW.equals(employeePW)) {
//				System.out.println("로그인 성공");break;
//			}else
//				System.out.println("입력하신 ID와 PW가 일치하지 않습니다.");		
//				}
//		LoginCnt = MenuNum.num1;
//		return LoginCnt;
//		
//	}
//
//	/**
//	 * 유저의 로그인을 돕는 함수입니다.
//	 * {@link #v}User를 벡터로 받아옵니다.
//	 *  사용자가 ID와 PW를 입력합니다.
//	 *  만약에 ID와PW가 {@link #registerUser(User)}에 입력했던
//	 *   ID와PW랑 동일하다면 "로그인 성공"을 프린트한 후 LoginCnt에 1을 대입해 주고 break로 멈춰 줍니다.   
//	 *   <br>그렇지 않는 경우에는 "등록되지 않은 사용자입니다. 회원가입을 시작합니다." 멘트를 프린트한 후
//	 *   LoginCnt에 0을 대입해 주고 가입함수인 {@link #registerUser(User)}에 넘어가고 break로 멈춰 줍니다.
//	 * @param u
//	 */
//	void userLogin(User u) {
//		System.out.print("사용자 ID를 입력해주세요 : ");
//		String ID = s.nextLine();
//		System.out.print("사용자 PW를 입력해주세요 : ");
//		String PW = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)!=null) {
//				if(ID.equals(v.get(i).getID())&&PW.equals(v.get(i).getPW())) {
//					System.out.println("로그인 성공");
//					LoginCnt = MenuNum.num1;
//					
//					break;
//				}			
//			}else
//			{
//				System.out.println("등록되지 않은 사용자입니다. 회원가입을 시작합니다.");
//				LoginCnt = MenuNum.num0;
//				registerUser(u);
//				break;
//			}
//		}
//		//return v.get(i).LoginCnt;
//	}
//	/**
//	 * 로그아웃을 원할 때 로그아웃이 되면서 LoginCnt가 0으로 변경됩니다.
//	 */
//	
//	void Logout() {
//		System.out.println("로그아웃 되었습니다.");
//		LoginCnt = MenuNum.num0;
//	}
//	
//	void registerUser(User u) {	
//		
//	      String sPattern = "^[a-zA-Z0-9가-힣\\s]*$";
//	      int retry = MenuNum.num0;
//	      boolean regex;
//	      
//	      do {
//				System.out.print("이름을 입력하세요 : ");
//				String Name = s.nextLine();
//				 regex = Pattern.matches(sPattern, Name);
//		         if(regex != true) {
//		            System.out.println("숫자를 포함한 문자열만 입력하세요 ");
//		            break;
//		         }
//		         
//		         
//				System.out.print("전화번호를 입력하세요 : ");
//				String Tel = s.nextLine();
//				regex = Pattern.matches(sPattern, Tel);
//		         if(regex != true) {
//		            System.out.println("숫자를 포함한 문자열만 입력하세요 ");
//		            break;
//		         }
//		         
//		         
//				System.out.print("ID를 입력하세요 : ");
//				String ID = s.nextLine();
//				regex = Pattern.matches(sPattern, ID);
//		         if(regex != true) {
//		            System.out.println("숫자를 포함한 문자열만 입력하세요 ");
//		            break;
//		         }
//		         
//				System.out.print("PW를 입력하세요 : ");
//				String PW = s.nextLine();
//				regex = Pattern.matches(sPattern, PW);
//		         if(regex != true) {
//		            System.out.println("숫자를 포함한 문자열만 입력하세요 ");
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
//				System.out.println("회원 등록이 완료되었습니다.");
//				
//				
//				System.out.println("또 입력하시겠어요? yes..1 no..0");
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
//				//System.out.println("입력된 유저가 없습니다. 사용자를 추가해주세요.");
//		}
//	}
//	
//	
//	
//	void findID(User u) {
//		System.out.print("사용자 이름을 입력해주세요 : ");
//		String Name = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)!=null) {
//				if(Name.equals(v.get(i).getName())) {
//					System.out.println(v.get(i).getName()+"의 ID는 "+v.get(i).getID()+"입니다.");
//				}
//			}
//		}
//	}
//	
//	void findPW(User u) {
//		System.out.print("사용자 ID를 입력해주세요 : ");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)!=null) {
//				if(ID.equals(v.get(i).getID())) {
//					System.out.println(v.get(i).getID()+"의 PW는 "+v.get(i).getPW()+"입니다.");
//				}
//			}
//		}
//	}
//	
//	void removeUser(User u){
//		System.out.println("정말로 탈퇴하시겠습니까? : 탈퇴면 아이디 입력");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)==null) {
//				System.out.println("null값입니다.");
//			}
//			else if(ID.equals(v.get(i).getID())) {
//				v.remove(i);
//				System.out.println(ID+"가 삭제되었습니다.");
//				LoginCnt = MenuNum.num0;
//					
//			}//else 
//				//System.out.println("일치 안함");
//		}
//	}
//	/**
//	 * 사용자가 관리자로 로그인했을 경우에 관리자가 
//	 * @param u
//	 */
//	
//	void searchUser(User u){
//		System.out.print("검색할 사용자 ID를 입력해주세요");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)!=null) {
//				if(ID.equals(v.get(i).getID())) {
//					System.out.println("찾으시는 사용자 정보는 ");
//					v.get(i).showUser();
//					System.out.print(" 입니다. ");
//				}
////				else 
////					System.out.println("ㅗㅜㅑ");
//			}
//		}
//	}
//	
//	void deleteUser(User u) {
//		System.out.print("삭제할 사용자 ID를 입력해주세요 :");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//			{
//				if(v.get(i)==null) {
//					//System.out.println("null값입니다.");
//				}
//				else if(ID.equals(v.get(i).getID())) {
//						v.remove(i);
//						System.out.println(ID+"가 삭제되었습니다.");
//						//userCnt--;
//						LoginCnt = MenuNum.num0;
//				}//else 
//					//System.out.println("일치 안함");
//			}
//		}
//	
//	void sortUser(User u) {
//		System.out.println("유저목록을 정렬합니다.");
//		 for(int i = 0; i<v.size();i++)
//         {
//         if(v.get(i)==null )
//            {
//               u.setName("a"+i);
//               u.setTel("010"+i);
//               u.setID("user"+(i+1));
//               u.setPW("user"+(i+1));
//               v.add(u);
//               System.out.println("생성자를 추가하였습니다.");
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
//		System.out.println("몇 번 좌석을 사용하시겠습니까 ?");
//		int num = s.nextInt();
//
//		
//		
//		for(int i = 0; i<rent.room.length;i++)
//		{
//			if(rent.room[i]==MenuNum.num0) {
//				System.out.println("해당 좌석은 사용가능합니다. 해당 좌석을 사용하겠습니까? yes..1, no..0");
//				num = s.nextInt();
//					if(num==MenuNum.num1) {
//						System.out.println("해당 좌석을 사용하실 수 있습니다.");
//						rent.room[i] = MenuNum.num1;
//						secToHHMMSS();
//						break;
//						}
//					else if(num == MenuNum.num0) {
//						System.out.println("해당 좌석을 사용하실 수 없습니다."); break;
//						}else
//							System.out.println("잘못된 입력입니다. 다시 선택해 주세요"); break;
//			}else if(rent.room[i]==MenuNum.num1) {
//				System.out.println("해당 좌석은 사용중입니다.");
//				secToHHMMSS();break;
//				
//			}else if(rent.room[i]==MenuNum.num2) {
//				System.out.println("해당 좌석은 배정중입니다.");break;
//			}else
//				System.out.println("잘못된 입력입니다. 다시 선택해 주세요");break;
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
//		System.out.format("남은 시간 : "+timerBuffer+"\n");
//	}
//	
//
//}