package com.yyh.account.tools;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

	public DBHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}
	
	public DBHelper(Context context) {
		super(context, "Account.db", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		String Sql="";
		//密码表
		Sql+="create table Users(_id integer primary key,pwd varchar(20)," +
				"qpwd varchar(50),apwd varchar(50)) go ";
		//便签表
		Sql+="create table Falg(_id integer primary key,flag varchar(200),time varchar(50)) go ";
		//收入信息表
		Sql+="create table Inaccount(_id integer primary key,money double,type int," +
				"handler varchar(100),time varchar(50),depict varchar(200)) go ";
		//支出信息表
		Sql+="create table Outaccount(_id integer primary key,money double,type int," +
				"address varchar(100),time varchar(50),depict varchar(200)) go";
		
		arg0.execSQL(Sql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
