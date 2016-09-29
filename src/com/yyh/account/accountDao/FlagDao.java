package com.yyh.account.accountDao;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.yyh.account.accountModel.FlagModel;
import com.yyh.account.tools.DBHelper;

public class FlagDao {

	private DBHelper dbhelper;
	private SQLiteDatabase db;
	
	public FlagDao(Context context){
		dbhelper=new DBHelper(context);
	}
	
	/**
	 * 新增便签
	 * @param flagmodel
	 */
	public void AddFlag(FlagModel flagmodel){
		String Sql="insert into Flag(flag,time) values(?,?)";
		db=dbhelper.getReadableDatabase();
		db.execSQL(Sql,new Object[]{flagmodel.getFiag(),flagmodel.getTime()});
		db.close();
	}
	
	/**
	 * 编辑便签
	 * @param flagmodel
	 */
	public void EditFlag(FlagModel flagmodel){
		String Sql="update Flag set flag=? where _id=?";
		db=dbhelper.getReadableDatabase();
		db.execSQL(Sql,new Object[]{flagmodel.getFiag(),flagmodel.get_id()});
		db.close();
	}
	
	/**
	 * 删除便签
	 * @param flagmodel
	 */
	public void DelFlag(FlagModel flagmodel){
		String Sql="delete from Flag where _id=?";
		db=dbhelper.getReadableDatabase();
		db.execSQL(Sql,new Object[]{flagmodel.get_id()});
		db.close();
	}
	
	/**
	 * 获取所有便签
	 * @return
	 */
	public List<FlagModel> SelectFlagAll(){
		List<FlagModel> list=new ArrayList<FlagModel>();
		String Sql="select * from Flag";
		db=dbhelper.getReadableDatabase();
		Cursor c=db.rawQuery(Sql, null);
		while(c.moveToNext()){
			int _id=c.getInt(c.getColumnIndex("_id"));
			String flag=c.getString(c.getColumnIndex("flag"));
			String time=c.getString(c.getColumnIndex("time"));
			list.add(new FlagModel(_id,flag,time));
		}
		c.close();
		db.close();
		return list;
	}
	
	/**
	 * 获取最新便签
	 * @return
	 */
	public List<FlagModel> SelectFlagOne(){
		List<FlagModel> list=new ArrayList<FlagModel>();
		String Sql="select * from Flag limit 0,1";
		db=dbhelper.getReadableDatabase();
		Cursor c=db.rawQuery(Sql, null);
		while(c.moveToNext()){
			int _id=c.getInt(c.getColumnIndex("_id"));
			String flag=c.getString(c.getColumnIndex("flag"));
			String time=c.getString(c.getColumnIndex("time"));
			list.add(new FlagModel(_id,flag,time));
		}
		c.close();
		db.close();
		return list;
	}
}
