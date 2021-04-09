package cproject;
/**
 * 이 클래스는 도서 관리 시스템의 또 다른 관리자 클레스로 직원클래스를 뜻합니다.
 * <br> 각 직원정보를 받아와서 직원을 식별할 수 있게 해줍니다.
 * <br> 또한 직원과 유저 사이에 구분이 가능 하도록 되어있습니다.
 * <br> 직원 클래스는 유저를 상속받아 사용하는 클래스 입니다.
 * <br> 도서 관리 시스템의 Entity class에 속합니다.
 * @see User#User()
 * @author SHY-702-04
 *
 */
public class Employee extends User{
	/**
	 * @param EmployeeCheck 직원해당 유무 확인
	 */
	int EmployeeCheck;
	
	/**
	 * 디폴트 생성자
	 * @see User#User()
	 */
	
	public Employee() {}
	
	
	/**
	 * Employee class의 생성자
	 * <br> 각 직원 정보를 가지고 옵니다.
	 * <br> 정보를 받아 AdminHandler에서 입출력을 도와줍니다.
	 * @see User#User(String, String, String, String)
	 * @param Name 직원이름
	 * @param Tel 직원전화번호
	 * @param ID 직원아이디
	 * @param PW 직원패스워드
	 * @param EmployeeCheck 직원 해당 여부 확인.
	 * 
	 */
	
	
	Employee(String Name, String Tel, String ID, String PW, int EmployeeCheck){
		super(Name, Tel, ID, PW);
		this.EmployeeCheck = EmployeeCheck;
	}
	/**
	 * showEmployee는 {@link showUser}를 통하여 유저 정보를 출력할 수 있고 직원 여부를 확인합니다.
	 */
	void showEmployee() {
		super.showUser();
		System.out.println("관리자 여부 : "+this.EmployeeCheck);
		System.out.println();
	}
	/**
	 * getID는 매개변수로 아이디를 받아와 아이디 값을 리턴해 줍니다.
	 * @param ID 아이디 
	 * @return ID 아이디
	 */
	public String getID(String ID) {
		return ID;
	}
	/**
	 * getPW는 매개변수로 패스워드를 받아와 패스워드 값을 리턴해 줍니다.
	 * @param PW 패스워드
	 * @return PW 패스워드
	 */
	public String getPW(String PW) {
		return PW;
	}//정보은닉- 켑슐화
}

