<<<<<<< HEAD
/*
 * package com.myspring.commonProduction.commitOperationInstruction.vo;
 * 
 * import java.util.Date;
 * 
 * import org.springframework.stereotype.Component;
 * 
 * @Component("CommitOperationInstructionVO") public class
 * CommitOperationInstructionVO { private int NO; private String itemNumber;
 * private String itemName; private String standard; private String unit;
 * private int dailyProduction; private int sequence; private Date scheduled;
 * private int quantity; private String note;
 * 
 * public CommitOperationInstructionVO() {
 * 
 * }
 * 
 * public CommitOperationInstructionVO(int NO, String itemNumber, String
 * itemName, String standard, String unit, int dailyProduction, int sequence,
 * Date scheduled, int quantity, String note) { this.NO = NO; this.itemNumber =
 * itemNumber; this.itemName = itemName; this.standard = standard; this.unit =
 * unit; this.dailyProduction = dailyProduction; this.sequence = sequence;
 * this.scheduled = scheduled; this.quantity = quantity; this.note = note; }
 * 
 * public int getNO() { return NO; }
 * 
 * public void setNO(int nO) { NO = nO; }
 * 
 * public String getItemNumber() { return itemNumber; }
 * 
 * public void setItemNumber(String itemNumber) { this.itemNumber = itemNumber;
 * }
 * 
 * public String getItemName() { return itemName; }
 * 
 * public void setItemName(String itemName) { this.itemName = itemName; }
 * 
 * public String getStandard() { return standard; }
 * 
 * public void setStandard(String standard) { this.standard = standard; }
 * 
 * public String getUnit() { return unit; }
 * 
 * public void setUnit(String unit) { this.unit = unit; }
 * 
 * public int getDailyProduction() { return dailyProduction; }
 * 
 * public void setDailyProduction(int dailyProduction) { this.dailyProduction =
 * dailyProduction; }
 * 
 * public int getSequence() { return sequence; }
 * 
 * public void setSequence(int sequence) { this.sequence = sequence; }
 * 
 * public Date getScheduled() { return scheduled; }
 * 
 * public void setScheduled(Date scheduled) { this.scheduled = scheduled; }
 * 
 * public int getQuantity() { return quantity; }
 * 
 * public void setQuantity(int quantity) { this.quantity = quantity; }
 * 
 * public String getNote() { return note; }
 * 
 * public void setNote(String note) { this.note = note; }
 * 
 * 
 * }
 */
=======
package com.myspring.commonProduction.commitOperationInstruction.vo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("CommitOperationInstructionVO")
public class CommitOperationInstructionVO {
	private int NO;
	private String itemNumber;
	private String itemName;
	private String standard;
	private String unit;
	private int dailyProduction;
	private int sequence;
	private Date scheduled;
	private int quantity;
	private String note;
	
	public CommitOperationInstructionVO() {
		
	}
	
	public CommitOperationInstructionVO(int NO, String itemNumber, String itemName, String standard, String unit, int dailyProduction, int sequence, Date scheduled, int quantity, String note) {
		this.NO = NO;
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.standard = standard;
		this.unit = unit;
		this.dailyProduction = dailyProduction;
		this.sequence = sequence;
		this.scheduled = scheduled;
		this.quantity = quantity;
		this.note = note;
	}

	public int getNO() {
		return NO;
	}

	public void setNO(int nO) {
		NO = nO;
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

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getDailyProduction() {
		return dailyProduction;
	}

	public void setDailyProduction(int dailyProduction) {
		this.dailyProduction = dailyProduction;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public Date getScheduled() {
		return scheduled;
	}

	public void setScheduled(Date scheduled) {
		this.scheduled = scheduled;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
}
>>>>>>> parent of 53c4deb (생산파트 구현중)
