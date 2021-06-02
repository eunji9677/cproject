package com.myspring.Mainplan.MainplanOS.vo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("mainplanosVO")
public class MainPlanOSVO {
	private String ordersNum;
	private int sequence;
	private Date orderdate;
	private Date okeydate;
	private String Customer_Name;
	private String itemnumber;
	private String itemName;
	private String standard;
	private String unit;
	private int Order_quantity;
	private int apply_quantity;
	private int order_Balance;
	private Date expected_Date;
	private String note;

public MainPlanOSVO() {}

public MainPlanOSVO(String ordersNum,int sequence,Date orderdate, Date okeydate,String Customer_Name,String itemnumber,
		String itemName,String standard,String unit,int Order_quantity,int apply_quantity,int order_Balance,Date expected_Date,String note) 
{
	this.ordersNum=ordersNum;
	this.sequence=sequence;
	this.orderdate=orderdate;
	this.okeydate=okeydate;
	this.Customer_Name=Customer_Name;
	this.itemnumber=itemnumber;
	this.itemName=itemName;
	this.standard=standard;
	this.unit=unit;
	this.Order_quantity=Order_quantity;
	this.apply_quantity=apply_quantity;
	this.order_Balance=order_Balance;
	this.expected_Date=expected_Date;
	this.note=note;
	
}

public String getOrdersNum() {return ordersNum;}
public void setOrdersNum(String ordersNum) {this.ordersNum=ordersNum;}

public int getSequence() {return sequence;}
public void setSequence(int sequence) {this.sequence=sequence;}

public Date getOrderdate() {return orderdate;}
public void setOrderdate(Date orderdate) {this.orderdate=orderdate;}

public Date getOkeydate() {return okeydate;}
public void setOkeydate(Date okeydate) {this.okeydate=okeydate;}

public String getCustomer_Name() {return Customer_Name;}
public void setCustomer_Name(String Customer_Name) {this.Customer_Name=Customer_Name;}

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

public int getOrder_quantity() {return Order_quantity;}
public void setOrder_quantity(int Order_quantity) {this.Order_quantity=Order_quantity;}

public Date getExpected_Date() {return expected_Date;}
public void setExpected_Date(Date expected_Date) {this.expected_Date=expected_Date;}

public String getNote() {return note;}
public void setNote(String note) {this.note=note;}

}
