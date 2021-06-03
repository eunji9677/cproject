<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9e4a2abb0c9580e94ecd18b28f305eb1db64850c
package com.myspring.commonProduction.commitOperationInstruction.vo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("CommitOperationInstructionVO")
public class CommitOperationInstructionVO {
<<<<<<< HEAD
	private String itemNumber;
	private String itemName;
	private String standard;
	private String unit;
=======
	private String itemCode;
	private String itemName;
	private String standard;
	private String inventoryUnit;
>>>>>>> 9e4a2abb0c9580e94ecd18b28f305eb1db64850c
	private int dailyProduction;
	private int sequence;
	private Date scheduled;
	private int quantity;
	private String note;
	
	public CommitOperationInstructionVO() {
<<<<<<< HEAD
		
	}
	
	public CommitOperationInstructionVO(String itemNumber, String itemName, String standard, String unit, int dailyProduction, int sequence, Date scheduled, int quantity, String note) {
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


	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
=======
		super();
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
>>>>>>> 9e4a2abb0c9580e94ecd18b28f305eb1db64850c
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

<<<<<<< HEAD
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
=======
	public String getInventoryUnit() {
		return inventoryUnit;
	}

	public void setInventoryUnit(String inventoryUnit) {
		this.inventoryUnit = inventoryUnit;
>>>>>>> 9e4a2abb0c9580e94ecd18b28f305eb1db64850c
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
<<<<<<< HEAD
	
	
}
=======
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
>>>>>>> develop
=======


}
>>>>>>> 9e4a2abb0c9580e94ecd18b28f305eb1db64850c
