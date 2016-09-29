package com.yyh.account.accountModel;

public class FlagModel {

	private int _id;
	private String flag;
	private String time;
	
	
	public FlagModel(){
		
	}
	
	
	public FlagModel(int _id,String flag,String time){
		
		this._id=_id;
		this.flag=flag;
		this.time=time;
	}
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getFiag() {
		return flag;
	}
	public void setFiag(String fiag) {
		this.flag = fiag;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
