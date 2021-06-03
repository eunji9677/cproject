package com.myspring.MainPlan.MpsOS.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("mpsosVO")
public class MpsOSVO {
	private String ordersno;
	private int sequence;
	private Date orderdate;
	private Date okeydate;
	private String buyer;
	private String itemnumber;
	private String itemName;
	private String standard;
	private String unit;
	private int order_quantity;
	private int apply_quantity;
	private int order_Balance;
	private Date expected_Date;
	private String note;

public MpsOSVO() {}

public MpsOSVO(String ordersno,int sequence,Date orderdate, Date okeydate,String buyer,String itemnumber,
		String itemName,String standard,String unit,int order_quantity,int apply_quantity,int order_Balance,Date expected_Date,String note) 
{
	this.ordersno=ordersno;
	this.sequence=sequence;
	this.orderdate=orderdate;
	this.okeydate=okeydate;
	this.buyer=buyer;
	this.itemnumber=itemnumber;
	this.itemName=itemName;
	this.standard=standard;
	this.unit=unit;
	this.order_quantity=order_quantity;
	this.apply_quantity=apply_quantity;
	this.order_Balance=order_Balance;
	this.expected_Date=expected_Date;
	this.note=note;
	
}

public String getOrdersno() {return ordersno;}
public void setOrdersno(String ordersno) {this.ordersno=ordersno;}

public int getSequence() {return sequence;}
public void setSequence(int sequence) {this.sequence=sequence;}

public Date getOrderdate() {return orderdate;}
public void setOrderdate(Date orderdate) {this.orderdate=orderdate;}

public Date getOkeydate() {return okeydate;}
public void setOkeydate(Date okeydate) {this.okeydate=okeydate;}

public String getBuyer() {return buyer;}
public void setBuyer(String buyer) {this.buyer=buyer;}

public String getItemnumber() {return itemnumber;}
public void setItemnumber(String itemnumber) {this.itemnumber=itemnumber;}

public String getItemName() {return itemName;}
public void setItemName(String itemName) {this.itemName=itemName;}

public String getStandard() {return standard;}
public void setStandard(String standard) {this.standard=standard;}

public String getUnit() {return unit;}
public void setUnit(String unit) {this.unit=unit;}

public int getApply_quantity() {return apply_quantity;}
public void setApply_quantity(int apply_quantity) {this.apply_quantity=apply_quantity;}

public int getOrder_Balance() {return order_Balance;}
public void setOrder_Balance(int order_Balance) {this.order_Balance=order_Balance;}

public int getOrder_quantity() {return order_quantity;}
public void setOrder_quantity(int order_quantity) {this.order_quantity=order_quantity;}

public Date getExpected_Date() {return expected_Date;}
public void setExpected_Date(Date expected_Date) {this.expected_Date=expected_Date;}

public String getNote() {return note;}
public void setNote(String note) {this.note=note;}

}
