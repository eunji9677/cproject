//package cproject;
//import java.util.*;
//
//public class UserHandler{
//	Scanner s = new Scanner(System.in);
//	AdminHandler adminHandler = new AdminHandler();
//	User userList[] =  new User[5];
//	Admin adminList[];
//	
//	int userCnt;
//	int adminCnt;
//	int AdminCheck;
//	int loginCnt = 0;
	
//	void CheckAD() {
//		System.out.print("관리자라면 1을 입력하고 사용자라면 2fmf 입력하세요 :");
//		AdminCheck = Integer.parseInt(s.nextLine());
//	}

	
//	void joinUser() {		
//		System.out.print("이름을 입력하세요 : ");
//		String Name = s.nextLine();
//		System.out.print("전화번호를 입력하세요 : ");
//		String Tel = s.nextLine();
//		System.out.print("ID를 입력하세요 : ");
//		String ID = s.nextLine();
//		System.out.print("PW를 입력하세요 : ");
//		String PW = s.nextLine();
//		
//		User user = new User(Name, Tel, ID, PW);
//		userList[userCnt] = user;
//		userCnt++;
//
//		
//	}
//	
//	int userLogin() {
//		System.out.print("사용자 ID를 입력해주세요 : ");
//		String ID = s.nextLine();
//		System.out.print("사용자 PW를 입력해주세요 : ");
//		String PW = s.nextLine();
//		
//		for(int i = 0; i<userList.length;i++)
//		{
//			if(userList[i]!=null) {
//				if(ID.equals(userList[i].ID)&&PW.equals(userList[i].PW)) {
//					System.out.println("로그인 성공");break;
//				}//else
//					//System.out.println("입력하신 ID와 PW가 일치하지 않습니다.");				
//			}else
//			{
//				System.out.println("등록되지 않은 사용자입니다. 회원가입을 시작합니다.");
//				joinUser();break;
//			}
//		}
//		loginCnt = 1;
//		return loginCnt;
//	}
//	
//	void userLogout() {
//		System.out.println("로그아웃 되었습니다.");
//		loginCnt = 0;
//	}
	
//	void showUser() {
//		for(int i = 0; i<userList.length;i++)
//		{
//			if(userList[i]!=null )
//            {
//				userList[i].showUser();
//            }
//			//else 
//				//System.out.println("입력된 유저가 없습니다. 사용자를 추가해주세요.");
//		}
//	}
//	
//	void findID() {
//		System.out.print("사용자 이름을 입력해주세요 : ");
//		String Name = s.nextLine();
//		
//		for(int i = 0; i<userList.length;i++)
//		{
//			if(userList[i]!=null) {
//				if(Name.equals(userList[i].Name)) {
//					System.out.println(userList[i].Name+"의 ID는 "+userList[i].ID+"입니다.");
//				}
//			}
//		}
//	}
//	
//	void findPW() {
//		System.out.print("사용자 ID를 입력해주세요 : ");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<userList.length;i++)
//		{
//			if(userList[i]!=null) {
//				if(ID.equals(userList[i].ID)) {
//					System.out.println(userList[i].ID+"의 PW는 "+userList[i].PW+"입니다.");
//				}
//			}
//		}
//	}
//	
//	void removeUser(){
//		System.out.println("정말로 탈퇴하시겠습니까? : 탈퇴면 아이디 입력");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<userList.length;i++)
//		{
//			if(userList[i]==null) {
//				//System.out.println("null값입니다.");
//			}
//			else if(ID.equals(userList[i].ID)) {
//				userList[i]= null;
//					System.out.println(ID+"가 삭제되었습니다.");
//					loginCnt = 0;
//			}//else 
//				//System.out.println("일치 안함");
//		}
//	}
//	
//}
