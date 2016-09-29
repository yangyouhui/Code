package com.yyh.account.accountModel;

public class UsersModel {

	private int _id;
	private String pwd;
	private String qpwd;//密码问题
	private String apwd;//问题答案
	
	public UsersModel(){
		
	}
	
	public UsersModel(int _id,String pwd,String qpwd,String apwd){
		this._id=_id;
		this.pwd=pwd;
		this.qpwd=qpwd;
		this.apwd=apwd;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getQpwd() {
		return qpwd;
	}

	public void setQpwd(String qpwd) {
		this.qpwd = qpwd;
	}

	public String getApwd() {
		return apwd;
	}

	public void setApwd(String apwd) {
		this.apwd = apwd;
	}

	
	
}
