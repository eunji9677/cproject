package com.myspring.Billing.List.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("listVO")
public class ListVO {
	private int sequence;
	private String itemNumber;
	private String itemName;
	private String standard;
	private Date requestdate;
	private String inventory_unit;
	private int inventory_qy;
	private String claim_unit;
	private int claim_quantity;
	private String buyer;


	public ListVO() {
	}

	public ListVO(int sequence, String itemNumber, String itemName, String standard, Date requestdate,
			String inventory_unit, int inventory_qy, String claim_unit, int claim_quantity, String buyer) {
		this.sequence = sequence;
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.standard = standard;
		this.requestdate = requestdate;
		this.inventory_unit = inventory_unit;
		this.inventory_qy = inventory_qy;
		this.claim_unit = claim_unit;
		this.claim_quantity=claim_quantity;
		this.buyer=buyer;
	}

	public int getSequence() {return sequence;}
	public void setSequence(int sequence) {this.sequence = sequence;}

	public String getItemNumber() {return itemNumber;}
	public void setItemNumber(String itemNumber) {this.itemNumber = itemNumber;}

	public String getItemName() {return itemName;}
	public void setItemName(String itemName) {this.itemName = itemName;}

	public String getStandard() {return standard;}
	public void setStandard(String standard) {this.standard = standard;}

	public Date getRequestdate() {return requestdate;}
	public void setRequestdate(Date requestdate) {this.requestdate = requestdate;}

	public String getInventory_unit() {return inventory_unit;}
	public void setInventory_unit(String inventory_unit) {this.inventory_unit = inventory_unit;}

	public int getInventory_qy() {return inventory_qy;}
	public void setInventory_qy(int inventory_qy) {this.inventory_qy = inventory_qy;}

	public String getClaim_unit() {return claim_unit;}
	public void setClaim_unit(String claim_unit) {this.claim_unit = claim_unit;}
	
	public int getClaim_quantity() {return claim_quantity;}
	public void setClaim_quantity(int claim_quantity) {this.claim_quantity = claim_quantity;}

	public String getBuyer() {return buyer;}
	public void setBuyer(String buyer) {this.buyer = buyer;}
}
