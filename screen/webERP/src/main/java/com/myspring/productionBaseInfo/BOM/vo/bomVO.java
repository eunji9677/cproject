package com.myspring.productionBaseInfo.BOM.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("bomVO")
public class bomVO {
	private int no;
	private String itemNumber;
	private String itemName;
	private String standard;
	private String unit;
	private int precisionQuantity;
	private int loss;
	private int actualCost;
	private int outSourcingUnitPrice;
	private Date startDate;
	private Date endDate;
	private String note;
	public bomVO() {
		super();
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getPrecisionQuantity() {
		return precisionQuantity;
	}
	public void setPrecisionQuantity(int precisionQuantity) {
		this.precisionQuantity = precisionQuantity;
	}
	public int getLoss() {
		return loss;
	}
	public void setLoss(int loss) {
		this.loss = loss;
	}
	public int getActualCost() {
		return actualCost;
	}
	public void setActualCost(int actualCost) {
		this.actualCost = actualCost;
	}
	public int getOutSourcingUnitPrice() {
		return outSourcingUnitPrice;
	}
	public void setOutSourcingUnitPrice(int outSourcingUnitPrice) {
		this.outSourcingUnitPrice = outSourcingUnitPrice;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
}
