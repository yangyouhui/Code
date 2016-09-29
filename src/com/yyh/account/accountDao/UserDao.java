package com.yyh.account.accountDao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.yyh.account.accountModel.UsersModel;
import com.yyh.account.tools.DBHelper;

public class UserDao {

	private DBHelper dbhelper;
	private SQLiteDatabase db;
	
	public UserDao(Context context){
		dbhelper=new DBHelper(context);
	}
	
	/**
	 * 设置密码
	 * @param usersmodel
	 */
	public void AddPwd(UsersModel usersmodel){
		String Sql="insert into Users (pwd,qpwd,apwd) values(?,?,?)";
		db=dbhelper.getReadableDatabase();
		db.execSQL(Sql, new Object[]{usersmodel.getPwd(),usersmodel.getQpwd(),usersmodel.getApwd()});
		db.close();
	}
	
	/**
	 * 修改密码 找回密码
	 * @param usersmodel
	 */
	public void EditPwd(UsersModel usersmodel){
		String Sql="update Users set pwd=? ";
		db=dbhelper.getReadableDatabase();
		db.execSQL(Sql, new Object[]{usersmodel.getPwd()});
		db.close();
	}
	
	/**
	 * 判断密码是否正确
	 * @param usersmodel
	 * @return
	 */
	public int countPwd(UsersModel usersmodel){
		String Sql="select * from  Users where pwd=?";
		int count=0;
		db=dbhelper.getReadableDatabase();
		Cursor c=db.rawQuery(Sql, null);
		while(c.moveToNext()){
			count=c.getCount();
		}
		c.close();
		db.close();
		return count;
	}
	
	/**
	 * 判断密码问题答案是否正确
	 * @param usersmodel
	 * @return
	 */
	public int countapwd(UsersModel usersmodel){
		String Sql="select * from  Users where apwd=?";
		int count=0;
		db=dbhelper.getReadableDatabase();
		Cursor c=db.rawQuery(Sql, null);
		while(c.moveToNext()){
			count=c.getCount();
		}
		c.close();
		db.close();
		return count;
	}
	/**
	 * 获取密码问题
	 * @return
	 */
	public String Select(){
		String str="";
		String Sql="select qpwd from Users";
		db=dbhelper.getReadableDatabase();
		Cursor c=db.rawQuery(Sql, null);
		while(c.moveToNext()){
			str=c.getString(c.getColumnIndex("qpwd"));
		}
		c.close();
		db.close();
		return str;
	}
}
