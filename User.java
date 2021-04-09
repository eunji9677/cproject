
package cproject;

/**
 * 
 * 이 클래스는 도서 관리 시스템을 사용하는 모든 유저 클래스 입니다.
 * <br>각 유저정보를 받아와서 유저를 식별할 수 있게 해줍니다.
 * <br> 도서 관리 시스템의 Entity class에 속합니다. 
 * @author SHY-702-04
 *
 */

public class User implements Comparable<User> {
	 
	//Name 이름
	private String Name;
	//Tel 전화번호  
	private String Tel;
	//ID 아이디
	private String ID;
	//PW 패스워드
	private String PW;
	//Overdue 
	private int Overdue;

	
	/**
	 * 디폴트 생성자
	 * @see #User(String, String, String, String)
	 * */
	public User(){}
	/**
	 * User class의 생성자 
	 * <br>각 유저 정보를 가지고 옵니다.
	 * <br>정보를 받아 AdminHandler에서 입출력을 도와줍니다.
	 * @param Name 이름
	 * @param Tel 전화번호
	 * @param ID 아이디
	 * @param PW 패스워드
	 * 
	 * */
	public User(String Name, String Tel, String ID, String PW){
		this.Name = Name;
		this.Tel = Tel;
		this.ID = ID;
		this.PW = PW;
		Overdue = 0;
	}
	/**
	 * 입력했던 유저정보를 출력해 보여주는 함수입니다.
	 * */
	public void showUser() {
		System.out.println("-------------------");
		System.out.println("이름 : "+this.Name);
		System.out.println("전화번호 : "+this.Tel);
		System.out.println("ID : "+ this.ID);
		System.out.println("PW : "+this.PW);
		System.out.println();
	}
/**
 * 
	 *  리턴을 하여 입력값의 이름과 비교합니다.
	 * @return Name 이름을 리턴해줍니다
	 
 */

	@Override
	public int compareTo(User o) {

		return Name.compareTo(((User)o).Name);
	}
	/**
	 *  입력했던 아이디를 리턴해 줍니다.
	 * @return Name 이름
	 */
	
	   public int getOverdue() {
		      return Overdue;
		   }

	public void setOverdue(int Overdue) {
		    this.Overdue = Overdue;
	}

	public String getName() {
		return Name;
	}
	/**
	 * 이름 입력했던 값을 저장합니다.
	 * @param Name 이름
	 */
	public void setName(String Name) {
		this.Name = Name;
	}
	/**
	 * 입력했던 전화번호를 리턴해 줍니다.
	 * @return Tel 전화번호 
	 */
	public String getTel() {
		return Tel;
	}
	/**
	 * 전화번호 입력했던 값을 저장합니다.
	 * @param Tel 전화번호
	 */
	
	public void setTel(String Tel) {
		this.Tel = Tel;
	}
	/**
	 * 입력했던 아이디를 반환해 줍니다.
	 * @return ID 아이디
	 */
	
	public String getID() {
		return ID;
	}
	/**
	 * 아이디의 입력했던 값을 저장합니다.
	 * @param ID 아이디
	 */
	public void setID(String ID) {
		this.ID = ID;
	}
	/**
	 * 입력했던 패스워드의 값을 반환합니다.
	 * @return PW 패스워드
	 */
	
	public String getPW() {
		return PW;
	}
	/**
	 * 입력했던 패스워드의 값을 저장합니다.
	 * @param PW 패스워드
	 */
	
	public void setPW(String PW) {
		this.PW = PW;
	}
	//정보은닉- 켑슐화
	//user.getID();//((User)v.get(0)).getID() 다운캐스팅
	//((User)v.get(0)).getID();

}
