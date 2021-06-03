package com.myspring.MainPlan.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("mainplanVO")
public class MainPlanVO {
	private Date plandate;
	private String itemnumber;
	private String itemName;
	private String standard;
	private String unit;
	private int sequence;
	private Date expected_date;
	private Date due_date;
	private int plan_quantity;
	private String buyer;
	private String note;
	
	public MainPlanVO() {}
	
	public MainPlanVO(Date plandate,String itemnumber,String itemName,String standard,String unit,int sequence,
			Date expected_date,Date due_date,int plan_quantity,String buyer,String note) 
	{
		this.plandate=plandate;
		this.itemnumber=itemnumber;
		this.itemName=itemName;
		this.standard=standard;
		this.unit=unit;
		this.sequence=sequence;
		this.expected_date=expected_date;
		this.due_date=due_date;
		this.plan_quantity=plan_quantity;
		this.buyer=buyer;
		this.note=note;
	}
	
	public Date getPlandate() {return plandate;}
	public void setPlandate(Date plandate) {this.plandate=plandate;}
	
	public String getItemnumber() {return itemnumber;}
	public void setItemnumber(String itemnumber) {this.itemnumber=itemnumber;}
	
	public String getItemName() {return itemName;}
	public void setItemName(String itemName) {this.itemName=itemName;}
	
	public String getStandard() {return standard;}
	public void setStandard(String standard) {this.standard=standard;}
	
	public String getUnit() {return unit;}
	public void setUnit(String unit) {this.unit=unit;}
	
	public int getSequence() {return sequence;}
	public void setSequence(int sequence) {this.sequence=sequence;}
	
	public Date getExpected_date() {return expected_date;}
	public void setExpected_date(Date expected_date) {this.expected_date=expected_date;}
	
	public Date getDue_date() {return due_date;}
	public void setDue_date(Date due_date) {this.due_date=due_date;}
	
	public int getPlan_quantity() {return plan_quantity;}
	public void setPlan_quantity(int plan_quantity) {this.plan_quantity=plan_quantity;}
	
	public String getBuyer() {return buyer;}
	public void setBuyer(String buyer) {this.buyer=buyer;}
	
	public String getNote() {return note;}
	public void setNote(String note) {this.note=note;}
	
}
