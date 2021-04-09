//package cproject;
//import java.util.*;
//import java.util.regex.Pattern;
//import java.io.*;
//import java.text.SimpleDateFormat;
///**
// * AdminHandler�� admin�� user�� ������� ���� Controller class �Դϴ�.
// * <br>Scanner�� ���Ͽ� ������ ������ ����ڷ� �Է¹޽��ϴ�.
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
//	//Scanner�� ���Ͽ� ����ڰ� ���� �Է��� �� �ְ� �����ݴϴ�.
//	Scanner s;
//	
//	//LoginCnt�� ���� �α��� ���θ� Ȯ���մϴ�.1�̸� �α��μ���, 0�̸� �α׾ƿ�
//	int LoginCnt = 0;
//	
//	//AdminCheck�� ���� ������ ���� �Ǵ��մϴ�. 0�̸� ������ �ƴ�, 1�̸� ������
//	int AdminCheck;
//	
//	//User�� �����Ͽ� User class�� ��� �����ϵ��� ����� �ݴϴ�.
//	User u = new User();
//	
//	//���͸� �̿��Ͽ� User�� User�� ��ӵ� ����(Admin,Employee) ��� �� �� �ְ� �մϴ�. 
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
//	 * ����Ʈ ������ 
//	 * <br>Scanner�� ������ �־����ϴ�.  
//	 */
//	
//	public AdminHandler() {
//		s = new Scanner(System.in);
//	}
//	/**
//	 * CheckAD�� ���� ���������� �ƴ��� �Է°��� ���Ͽ� Ȯ���մϴ�.
//	 * @return AdminCheck �����ڿ��� Ȯ��
//	 */
//	
//	int CheckAD() {
//		AdminCheck = Integer.parseInt(s.nextLine());
//		return AdminCheck;
//	}
//	/**
//	 * �����ڿ� ������ �α����� ���� �Լ��Դϴ�.
//	 * {@link #v}User�� ���ͷ� �޾ƿ� Admin�� Employee�� �������ϴ� ���Դϴ�.
//	 * true�� ���� 
//	 * ����ڰ� ID�� PW�� �Է��մϴ�.
//	 * ���࿡ ID�� adminID�� ���ų� employeeID�� ����, 
//	 * PW�� adminPW�� ���ų� employeePW�� ������쿡 �α��� ���� ��Ʈ�� ��� �� break�� ���� ����ϴ�.
//	 * <br> �׷��� ���� ��쿡�� �Է��Ͻ� ID�� PW�� ��ġ���� �ʽ��ϴ�.��� ��Ʈ�� ���� �� break�� ���� ����ϴ�.
//	 * break������ ���� ����  �α����� ���ϴ� LoginCnt�� 1�� ������ �ݴϴ�.
//	 * @param u User�� ��� �Ű������� �޾ƿ� �� �ֽ��ϴ�.
//	 * @return 1 �α��� ���� ����˴ϴ�.
//	 */
//	
//	int Login(User u) {
//
//		while(true)
//		{
//			System.out.print(" ID�� �Է����ּ��� : ");
//			String ID = s.nextLine();
//			System.out.print(" PW�� �Է����ּ��� : ");
//			String PW = s.nextLine();
//
//			if(ID.equals(adminID)&&PW.equals(adminPW)||ID.equals(employeeID)&&PW.equals(employeePW)) {
//				System.out.println("�α��� ����");break;
//			}else
//				System.out.println("�Է��Ͻ� ID�� PW�� ��ġ���� �ʽ��ϴ�.");		
//				}
//		LoginCnt = MenuNum.num1;
//		return LoginCnt;
//		
//	}
//
//	/**
//	 * ������ �α����� ���� �Լ��Դϴ�.
//	 * {@link #v}User�� ���ͷ� �޾ƿɴϴ�.
//	 *  ����ڰ� ID�� PW�� �Է��մϴ�.
//	 *  ���࿡ ID��PW�� {@link #registerUser(User)}�� �Է��ߴ�
//	 *   ID��PW�� �����ϴٸ� "�α��� ����"�� ����Ʈ�� �� LoginCnt�� 1�� ������ �ְ� break�� ���� �ݴϴ�.   
//	 *   <br>�׷��� �ʴ� ��쿡�� "��ϵ��� ���� ������Դϴ�. ȸ�������� �����մϴ�." ��Ʈ�� ����Ʈ�� ��
//	 *   LoginCnt�� 0�� ������ �ְ� �����Լ��� {@link #registerUser(User)}�� �Ѿ�� break�� ���� �ݴϴ�.
//	 * @param u
//	 */
//	void userLogin(User u) {
//		System.out.print("����� ID�� �Է����ּ��� : ");
//		String ID = s.nextLine();
//		System.out.print("����� PW�� �Է����ּ��� : ");
//		String PW = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)!=null) {
//				if(ID.equals(v.get(i).getID())&&PW.equals(v.get(i).getPW())) {
//					System.out.println("�α��� ����");
//					LoginCnt = MenuNum.num1;
//					
//					break;
//				}			
//			}else
//			{
//				System.out.println("��ϵ��� ���� ������Դϴ�. ȸ�������� �����մϴ�.");
//				LoginCnt = MenuNum.num0;
//				registerUser(u);
//				break;
//			}
//		}
//		//return v.get(i).LoginCnt;
//	}
//	/**
//	 * �α׾ƿ��� ���� �� �α׾ƿ��� �Ǹ鼭 LoginCnt�� 0���� ����˴ϴ�.
//	 */
//	
//	void Logout() {
//		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
//		LoginCnt = MenuNum.num0;
//	}
//	
//	void registerUser(User u) {	
//		
//	      String sPattern = "^[a-zA-Z0-9��-�R\\s]*$";
//	      int retry = MenuNum.num0;
//	      boolean regex;
//	      
//	      do {
//				System.out.print("�̸��� �Է��ϼ��� : ");
//				String Name = s.nextLine();
//				 regex = Pattern.matches(sPattern, Name);
//		         if(regex != true) {
//		            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
//		            break;
//		         }
//		         
//		         
//				System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
//				String Tel = s.nextLine();
//				regex = Pattern.matches(sPattern, Tel);
//		         if(regex != true) {
//		            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
//		            break;
//		         }
//		         
//		         
//				System.out.print("ID�� �Է��ϼ��� : ");
//				String ID = s.nextLine();
//				regex = Pattern.matches(sPattern, ID);
//		         if(regex != true) {
//		            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
//		            break;
//		         }
//		         
//				System.out.print("PW�� �Է��ϼ��� : ");
//				String PW = s.nextLine();
//				regex = Pattern.matches(sPattern, PW);
//		         if(regex != true) {
//		            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
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
//				System.out.println("ȸ�� ����� �Ϸ�Ǿ����ϴ�.");
//				
//				
//				System.out.println("�� �Է��Ͻðھ��? yes..1 no..0");
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
//				//System.out.println("�Էµ� ������ �����ϴ�. ����ڸ� �߰����ּ���.");
//		}
//	}
//	
//	
//	
//	void findID(User u) {
//		System.out.print("����� �̸��� �Է����ּ��� : ");
//		String Name = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)!=null) {
//				if(Name.equals(v.get(i).getName())) {
//					System.out.println(v.get(i).getName()+"�� ID�� "+v.get(i).getID()+"�Դϴ�.");
//				}
//			}
//		}
//	}
//	
//	void findPW(User u) {
//		System.out.print("����� ID�� �Է����ּ��� : ");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)!=null) {
//				if(ID.equals(v.get(i).getID())) {
//					System.out.println(v.get(i).getID()+"�� PW�� "+v.get(i).getPW()+"�Դϴ�.");
//				}
//			}
//		}
//	}
//	
//	void removeUser(User u){
//		System.out.println("������ Ż���Ͻðڽ��ϱ�? : Ż��� ���̵� �Է�");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)==null) {
//				System.out.println("null���Դϴ�.");
//			}
//			else if(ID.equals(v.get(i).getID())) {
//				v.remove(i);
//				System.out.println(ID+"�� �����Ǿ����ϴ�.");
//				LoginCnt = MenuNum.num0;
//					
//			}//else 
//				//System.out.println("��ġ ����");
//		}
//	}
//	/**
//	 * ����ڰ� �����ڷ� �α������� ��쿡 �����ڰ� 
//	 * @param u
//	 */
//	
//	void searchUser(User u){
//		System.out.print("�˻��� ����� ID�� �Է����ּ���");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//		{
//			if(v.get(i)!=null) {
//				if(ID.equals(v.get(i).getID())) {
//					System.out.println("ã���ô� ����� ������ ");
//					v.get(i).showUser();
//					System.out.print(" �Դϴ�. ");
//				}
////				else 
////					System.out.println("�Ǥ̤�");
//			}
//		}
//	}
//	
//	void deleteUser(User u) {
//		System.out.print("������ ����� ID�� �Է����ּ��� :");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<v.size();i++)
//			{
//				if(v.get(i)==null) {
//					//System.out.println("null���Դϴ�.");
//				}
//				else if(ID.equals(v.get(i).getID())) {
//						v.remove(i);
//						System.out.println(ID+"�� �����Ǿ����ϴ�.");
//						//userCnt--;
//						LoginCnt = MenuNum.num0;
//				}//else 
//					//System.out.println("��ġ ����");
//			}
//		}
//	
//	void sortUser(User u) {
//		System.out.println("��������� �����մϴ�.");
//		 for(int i = 0; i<v.size();i++)
//         {
//         if(v.get(i)==null )
//            {
//               u.setName("a"+i);
//               u.setTel("010"+i);
//               u.setID("user"+(i+1));
//               u.setPW("user"+(i+1));
//               v.add(u);
//               System.out.println("�����ڸ� �߰��Ͽ����ϴ�.");
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
//		System.out.println("�� �� �¼��� ����Ͻðڽ��ϱ� ?");
//		int num = s.nextInt();
//
//		
//		
//		for(int i = 0; i<rent.room.length;i++)
//		{
//			if(rent.room[i]==MenuNum.num0) {
//				System.out.println("�ش� �¼��� ��밡���մϴ�. �ش� �¼��� ����ϰڽ��ϱ�? yes..1, no..0");
//				num = s.nextInt();
//					if(num==MenuNum.num1) {
//						System.out.println("�ش� �¼��� ����Ͻ� �� �ֽ��ϴ�.");
//						rent.room[i] = MenuNum.num1;
//						secToHHMMSS();
//						break;
//						}
//					else if(num == MenuNum.num0) {
//						System.out.println("�ش� �¼��� ����Ͻ� �� �����ϴ�."); break;
//						}else
//							System.out.println("�߸��� �Է��Դϴ�. �ٽ� ������ �ּ���"); break;
//			}else if(rent.room[i]==MenuNum.num1) {
//				System.out.println("�ش� �¼��� ������Դϴ�.");
//				secToHHMMSS();break;
//				
//			}else if(rent.room[i]==MenuNum.num2) {
//				System.out.println("�ش� �¼��� �������Դϴ�.");break;
//			}else
//				System.out.println("�߸��� �Է��Դϴ�. �ٽ� ������ �ּ���");break;
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
//		System.out.format("���� �ð� : "+timerBuffer+"\n");
//	}
//	
//
//}