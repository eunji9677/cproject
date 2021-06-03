package com.myspring.weberp.salesmanage.salesplan.vo;

public class SalesplanVO {
	private String Plan_Item_Code;		//품번
	private String Plan_Item_Name;		//품명
	private String Plan_Item_Unit;		//단위
	private int Plan_Item_Quantity;		//판매계획 수량
	private int Plan_Uint_Price;		//판매계획 단가
	private int Newplan_Item_Quabtity;	//계획 수정 수량
	private int Newplan_Item_Unit_Price;//계획 수정 단가


	public SalesplanVO() {
		
	}
//	public SalesplanVO(String Plan_Item_Code, String Plan_Item_Name, String Plan_Item_Unit, int Plan_Item_Quantity,
//	int Plan_Uint_Price) {
//		this.Plan_Item_Code =  Plan_Item_Code;
//		this.Plan_Item_Name = Plan_Item_Name;
//		this.Plan_Item_Unit = Plan_Item_Unit;
//		this.Plan_Item_Quantity =  Plan_Item_Quantity;
//		this.Plan_Uint_Price = Plan_Uint_Price;
//	}
	public SalesplanVO(String Plan_Item_Code, String Plan_Item_Name, String Plan_Item_Unit, int Plan_Item_Quantity,
	int Plan_Uint_Price,int Newplan_Item_Quabtity,int Newplan_Item_Unit_Price) {
		this.Plan_Item_Code =  Plan_Item_Code;
		this.Plan_Item_Name = Plan_Item_Name;
		this.Plan_Item_Unit = Plan_Item_Unit;
		this.Plan_Item_Quantity =  Plan_Item_Quantity;
		this.Plan_Uint_Price = Plan_Uint_Price;
		this.Newplan_Item_Quabtity = Newplan_Item_Quabtity;
		this.Newplan_Item_Unit_Price = Newplan_Item_Unit_Price;

	}

	public String getPlan_Item_Code() {
		return Plan_Item_Code;
	}

	public void setPlan_Item_Code(String plan_Item_Code) {
		Plan_Item_Code = plan_Item_Code;
	}

	public String getPlan_Item_Name() {
		return Plan_Item_Name;
	}

	public void setPlan_Item_Name(String plan_Item_Name) {
		Plan_Item_Name = plan_Item_Name;
	}

	public String getPlan_Item_Unit() {
		return Plan_Item_Unit;
	}

	public void setPlan_Item_Unit(String plan_Item_Unit) {
		Plan_Item_Unit = plan_Item_Unit;
	}

	public int getPlan_Item_Quantity() {
		return Plan_Item_Quantity;
	}

	public void setPlan_Item_Quantity(int plan_Item_Quantity) {
		Plan_Item_Quantity = plan_Item_Quantity;
	}

	public int getPlan_Uint_Price() {
		return Plan_Uint_Price;
	}

	public void setPlan_Uint_Price(int plan_Uint_Price) {
		Plan_Uint_Price = plan_Uint_Price;
	}

	public int getNewplan_Item_Quabtity() {
		return Newplan_Item_Quabtity;
	}

	public void setNewplan_Item_Quabtity(int newplan_Item_Quabtity) {
		Newplan_Item_Quabtity = newplan_Item_Quabtity;
	}

	public int getNewplan_Item_Unit_Price() {
		return Newplan_Item_Unit_Price;
	}

	public void setNewplan_Item_Unit_Price(int newplan_Item_Unit_Price) {
		Newplan_Item_Unit_Price = newplan_Item_Unit_Price;
	}

}
