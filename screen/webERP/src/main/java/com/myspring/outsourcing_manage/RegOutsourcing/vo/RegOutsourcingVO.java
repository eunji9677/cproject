package com.myspring.outsourcing_manage.RegOutsourcing.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("RegOutsourcingVO")
public class RegOutsourcingVO {
	private String workOrderNumber;
	private String MaterialForwardingStatus;
	private String Workplace_Code;
	private Date instructionDate;
	private Date dueDate;
	private String Item_Code;
	private String Item_Name;
	private String Standard;
	private String Inventory_Unit;
	private int indicatedQuantity;
	private int unitPrice;
	private int Price;
	private String status;
	private String inspection;
	private String note;

	public RegOutsourcingVO() {
		super();
	}
	
//	public RegOutsourcingVO(String workOrderNumber, String MaterialForwardingStatus,String Workplace_Code,Date instructionDate,Date dueDate, String Item_Code,String Item_Name,String Standard,String Inventory_Unit ,int indicatedQuantity,int unitPrice,int Price,String status,String inspection,String note) {
//		this.workOrderNumber = workOrderNumber;
//		this.MaterialForwardingStatus = MaterialForwardingStatus;
//		this.Workplace_Code = Workplace_Code;
//		this.instructionDate = instructionDate;
//		this.dueDate = dueDate;
//		this.Item_Code = Item_Code;
//		this.Item_Name = Item_Name;
//		this.Standard = Standard;
//		this.Inventory_Unit = Inventory_Unit;
//		this.indicatedQuantity = indicatedQuantity;
//		this.unitPrice = unitPrice;
//		this.Price = indicatedQuantity * unitPrice;
//		this.status = status;
//		this.inspection = inspection;
//		this.note = note;
//	}


	public String getWorkplace_Code() {
		return Workplace_Code;
	}

	public void setWorkplaceCode(String workplaceCode) {
		Workplace_Code = workplaceCode;
	}

	public Date getInstructionDate() {
		return instructionDate;
	}

	public void setInstructionDate(Date instructionDate) {
		this.instructionDate = instructionDate;
	}


	public int getIndicatedQuantity() {
		return indicatedQuantity;
	}

	public void setIndicatedQuantity(int indicatedQuantity) {
		this.indicatedQuantity = indicatedQuantity;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInspection() {
		return inspection;
	}

	public void setInspection(String inspection) {
		this.inspection = inspection;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getWorkOrderNumber() {
		return workOrderNumber;
	}

	public void setWorkOrderNumber(String workOrderNumber) {
		this.workOrderNumber = workOrderNumber;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int indicatedQuantity,int unitPrice) {
		Price = indicatedQuantity*unitPrice;
	}

	public String getMaterialForwardingStatus() {
		return MaterialForwardingStatus;
	}

	public void setMaterialForwardingStatus(String materialForwardingStatus) {
		MaterialForwardingStatus = materialForwardingStatus;
	}

	public String getItem_Code() {
		return Item_Code;
	}

	public void setItem_Code(String item_Code) {
		Item_Code = item_Code;
	}

	public String getItem_Name() {
		return Item_Name;
	}

	public void setItem_Name(String item_Name) {
		Item_Name = item_Name;
	}

	public String getStandard() {
		return Standard;
	}

	public void setStandard(String standard) {
		Standard = standard;
	}

	public String getInventory_Unit() {
		return Inventory_Unit;
	}

	public void setInventory_Unit(String inventory_Unit) {
		Inventory_Unit = inventory_Unit;
	}
	
	
	
}

