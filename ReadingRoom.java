/**
 * 	@author SHY-702-04
 * 	�� Ŭ������ ReadingRoom Ŭ�����̴�.
 *  ������ Ȯ���ϱ� ���� ��ӹ��� ������ Ȯ���� �� �־�� �Ѵ�.  
 * */
package cproject;

public class ReadingRoom extends User {
/**
 * 	@param room �������� �ڸ�
 * 	@param useCnt 
 * */
	int[] room = new int[200];
	int useCnt;
	/**
	 * ����Ʈ ������
	 */
	public ReadingRoom() {}
	/**
	 * ������ �����ڷ� ������ Ȯ���ϱ� ���� ��ӹ��� ������ Ȯ���� �� �־�� �Ѵ�.
	 * @param Name 		�����̸�
	 * @param Tel		������ȭ��ȣ
	 * @param ID		�������̵�
	 * @param PW		�����н�����
	 * @param useCnt 	����ī��Ʈ
	 */
	ReadingRoom(String Name, String Tel, String ID, String PW, int useCnt)
	{
		super(Name,Tel,ID,PW);
		this.useCnt = useCnt;
	}
	
	
}
 