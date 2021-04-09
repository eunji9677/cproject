package cproject;
/**
 *  
 * 이 클래스는 도서 관리 시스템의 관리자 클레스입니다.
 * <br> 관리자 클래스는 유저를 상속받아 사용하는 클래스 입니다.
 * <br> 도서 관리 시스템의 Entity class에 속합니다.
 * 
 * @author SHY-702-04
 *
 */
public class Admin extends User{
	/**
	 * @param AdminCheck 관리자가 맞는지 아닌지 확인합니다.
	 */
	int AdminCheck;
	/**
	 * 디폴트 생성자
	 */
	public Admin() {}
	/**
	 * 생성자
	 * <br> 각 정보에 대한 변수를 입출력할 수 있게 해줍니다.
	 * @param Name 이름
	 * @param Tel 전화번호
	 * @param ID 아이디
	 * @param PW 패스워드
	 * @param AdminCheck 관리자확인
	 */
	private Admin(String Name, String Tel, String ID, String PW, int AdminCheck){
		super(Name, Tel, ID, PW);
		this.AdminCheck = AdminCheck;

	}
	/**
	 * {@link showUser}를 통하여 유저 정보를 출력할 수 있고 관리자 여부를 확인합니다.
	 */
	public void showAdmin() {
		super.showUser();
		System.out.println("관리자 여부 : "+this.AdminCheck);
		System.out.println();
	}
	/**
	 * 아이디의 값을 리턴해줍니다.
	 * @param ID 아이디
	 * @return ID 아이디
	 */
	public String getID(String ID) {
		return ID;
	}
	/**
	 * 패스워드 값을 리턴해줍니다.
	 * @param PW 패스워드
	 * @return PW 패스워드
	 */
	public String getPW(String PW) {
		return PW;
	}//정보은닉- 켑슐화
	
}
