package cproject;

import java.util.*;
/**
 * 도서 관리 시스템 중 도서에 해당하는 클래스 입니다.
 * <br> 관련 정보를 정렬하기 위하여 implements Comparable를 사용합니다.
 * @author SHY-702-04 
 * @see #Book()
 *@see #Book(String, String, String, String, int, int, int, int)
 */

public class Book implements Comparable {
/**
 * 각 변수를 사용자가 주도록 하기 위하여 Scanner를 사용합니다.
 * 
 */
	Scanner s = new Scanner(System.in);
	
	 String bookTitle;
	 String bookAuthor;
	 String bookPublisher;
	 String bookCode;
	 int bookPrice;
	 int bookSale;
	 int bookYear;
	 int borrow;
	/**
	 * 디폴트 생성자
	 * @see #Book(String, String, String, String, int, int, int, int)
	 */
	Book(){}
	/**
	 * 각 정보에 대한 입력과 출력을 받아 오기 위한 생성자 입니다.
	 * @param bookTitle 	책제목
	 * @param bookAuthor 	저자
	 * @param bookPublisher 출판사
	 * @param bookCode		코드
	 * @param bookPrice		소비자 가격
	 * @param bookSale		팔린 수량
	 * @param bookYear		출판년도
	 * @param borrow		대출 여부
	 */
	Book(String bookTitle, String bookAuthor, String bookPublisher, String bookCode, int bookPrice, int bookSale, int bookYear, int borrow)
	{
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.bookCode = bookCode;
		this.bookPrice = bookPrice;
		this.bookSale = bookSale;
		this.bookYear = bookYear;
		this.borrow = borrow;
	}
	
	/**
	 *getBookTitle을 통해  사용자로 부터 입력받았던 제목을 리턴해줍니다. 
	 * @return bookTitle 책제목
	 */	
	public String getBookTitle() {
		return bookTitle;
	}
	/**
	 * setBookTitle을 통해  사용자로 부터 입력받았던 제목의 입력값을 저장합니다.
	 * @param bookTitle
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	/**
	 *getBorrow를 통해 사용자로 부터 입력받았던 대출 여부를 리턴해줍니다. 
	 * @return borrow;
	 */	
	public int getBorrow() {
		return borrow;
	}
	/**
	 * setBorrow를 통하여  사용자로 부터 입력받았던 대출 여부의 입력값을 저장합니다.
	 *@param borrow		대출 여부
	 * 
	 */
	public void setBorrow(int borrow) {
		this.borrow = borrow;
	}
	/**
	 *getBookAuthor를 통해 사용자로 부터 입력받았던 저자를 리턴해줍니다. 
	 * @return bookAuthor 저자
	 */
	public String getBookAuthor() {
		return bookAuthor;
	}
	/**
	 * setBookAuthor를 통해  사용자로 부터 입력받았던 저자의 입력값을 저장합니다.
	 * @param bookAuthor 저자
	 */
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	/**
	 *getBookPublisher를 통해  사용자로 부터 입력받았던 출판사를 리턴해줍니다. 
	 * @return bookPublisher 출판사
	 */
	public String getBookPublisher() {
		return bookPublisher;
	}
	/**
	 * setBookPublisher를 통해  사용자로 부터 입력받았던 출판사의 입력값을 저장합니다.
	 * @param bookPublisher 출판사
	 */
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	/**
	 *getBookPrice를 통해 사용자로 부터 입력받았던 가격을 리턴해줍니다. 
	 * @return bookPrice 책가격
	 */
	public int getBookPrice() {
		return bookPrice;
	}
	/**
	 * setBookPrice를 통해  사용자로 부터 입력받았던 책가격의 입력값을 저장합니다.
	 * @param bookPrice
	 */
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	/**
	 *getBookSale를 통해 사용자로 부터 입력받았던 판매수량을 리턴해줍니다. 
	 * @return bookSale 판매수량
	 */
	public int getBookSale() {
		return bookSale;
	}
	/**
	 *setBookSale를 통해 사용자로 부터 입력받았던 판매수량의 입력값을 저장합니다. 
	 * @param bookSale 판매수량
	 */
	public void setBookSale(int bookSale) {
		this.bookSale = bookSale;
	}
	/**
	 *getBookYear를 통해 대출 여부를 리턴해줍니다. 
	 * @return
	 */
	public int getBookYear() {
		return bookYear;
	}

	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}
	/**
	 *getBorrow를 통해 대출 여부를 리턴해줍니다. 
	 * @return
	 */
	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	/**
	 * ArraysSort를 이용하기 위한 내장 합수이다.
	 */		
	@Override
	public int compareTo(Object o) {
		Book other = (Book)o;
		if(bookSale<other.bookSale)
			return -1;
		else if(bookSale>other.bookSale)
			return 1;
		else 
			return 0;
	}
	
	
}