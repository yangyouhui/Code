package com.yyh.account.accountModel;

public class InaccountModel {

	private int _id;
	private double money;
	private String time;
	private String handler;
	private int type;
	private String depict;
	
	public InaccountModel(){
		
	}
	
	
	public InaccountModel(int _id,double money,String time,String handler,int type,String depict){
		this._id=_id;
		this.type=type;
		this.time=time;
		this.money=money;
		this.handler=handler;
		this.depict=depict;
	}
	
	
	public int get_id() {
		return _id;
	}


	public void set_id(int _id) {
		this._id = _id;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getHandler() {
		return handler;
	}


	public void setHandler(String handler) {
		this.handler = handler;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public String getDepict() {
		return depict;
	}


	public void setDepict(String depict) {
		this.depict = depict;
	}


	
}
