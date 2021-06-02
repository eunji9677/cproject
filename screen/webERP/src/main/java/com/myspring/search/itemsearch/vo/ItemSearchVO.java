package com.myspring.search.itemsearch.vo;

import org.springframework.stereotype.Component;

@Component("itemSearchVO")
public class ItemSearchVO {

	private String Item_Code; //품번
	private String Item_Name; //품명
	private String Standard; //규격
	private String Inventory_Unit; //단위
	private String Inspection_Status; //검사여부
	
	public ItemSearchVO() {}
	
	public ItemSearchVO(String Item_Code, String Item_Name,	String Standard, String Inventory_Unit,	String Inspection_Status) {
		 this.Item_Code = Item_Code; //품번
		 this.Item_Name = Item_Name; //품명
		 this.Standard = Standard; //규격
		 this.Inventory_Unit = Inventory_Unit; //단위
		 this.Inspection_Status = Inspection_Status; //검사여부
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
	public String getInspection_Status() {
		return Inspection_Status;
	}
	public void setInspection_Status(String inspection_Status) {
		Inspection_Status = inspection_Status;
	}
}
