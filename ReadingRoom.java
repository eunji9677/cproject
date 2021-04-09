/**
 * 	@author SHY-702-04
 * 	이 클래스는 ReadingRoom 클래스이다.
 *  유저를 확인하기 위해 상속받은 유저를 확인할 수 있어야 한다.  
 * */
package cproject;

public class ReadingRoom extends User {
/**
 * 	@param room 독서실의 자리
 * 	@param useCnt 
 * */
	int[] room = new int[200];
	int useCnt;
	/**
	 * 디폴트 생성자
	 */
	public ReadingRoom() {}
	/**
	 * 독서실 생성자로 유저를 확인하기 위해 상속받은 유저를 확인할 수 있어야 한다.
	 * @param Name 		유저이름
	 * @param Tel		유저전화번호
	 * @param ID		유저아이디
	 * @param PW		유저패스워드
	 * @param useCnt 	유저카운트
	 */
	ReadingRoom(String Name, String Tel, String ID, String PW, int useCnt)
	{
		super(Name,Tel,ID,PW);
		this.useCnt = useCnt;
	}
	
	
}
 