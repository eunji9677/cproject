package com.myspring.Requiredamount.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("mrpVO")
public class RequiredamountVO {
private String itemnumber;
private String itemname;
private String standard;
private Date need_date;
private int sequence;
private Date expected_order;
private int expected_quantity;
private String unit;

public RequiredamountVO() {}

public RequiredamountVO(String itemnumber,String itemname,String standard,Date need_date,int sequence,Date expected_order,
		int expected_quantity,String unit)
{
	this.itemnumber=itemnumber;
	this.itemname=itemname;
	this.standard=standard;
	this.need_date=need_date;
	this.sequence=sequence;
	this.expected_order=expected_order;
	this.expected_quantity=expected_quantity;
	this.unit=unit;
}

public String getItemnumber() {return itemnumber;}
public void setItemnumber(String itemnumber) {this.itemnumber=itemnumber;}

public String getItemname() {return itemname;}
public void setItemname(String itemname) {this.itemname=itemname;}

public String getStandard() {return standard;}
public void setStandard(String standard) {this.standard=standard;}

public Date getNeed_date() {return need_date;}
public void setNeed_date(Date need_date) {this.need_date=need_date;}

public int getSequence() {return sequence;}
public void setSequence(int sequence) {this.sequence=sequence;}

public Date getExpected_order() {return expected_order;}
public void setExpected_order(Date expected_order) {this.expected_order=expected_order;}

public int getExpected_quantity() {return expected_quantity;}
public void setExpected_quantity(int expected_quantity) {this.expected_quantity=expected_quantity;}

public String getUnit() {return unit;}
public void setUnit(String unit) {this.unit=unit;}
}
