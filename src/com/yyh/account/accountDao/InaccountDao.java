package com.yyh.account.accountDao;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.yyh.account.accountModel.InaccountModel;
import com.yyh.account.tools.DBHelper;

public class InaccountDao {

	private DBHelper dbhelper;
	private SQLiteDatabase db;
	public InaccountDao(Context context){
		dbhelper =new DBHelper(context);
	}
	
	/**
	 * 新增收入信息
	 * @param inaccountmodel
	 */
	public void AddInaccount(InaccountModel inaccountmodel){
		String Sql="insert into Inaccount(money,time,type,handler,depict) values(?,?,?,?,?)";
		db=dbhelper.getReadableDatabase();
		db.execSQL(Sql, new Object[]{inaccountmodel.getMoney(),inaccountmodel.getTime(),
				inaccountmodel.getType(),inaccountmodel.getHandler(),inaccountmodel.getDepict()});
		db.close();
	}
	
	/**
	 * 编辑收入信息
	 * @param inaccountmodel
	 */
	public void EditInaccount(InaccountModel inaccountmodel){
		String Sql="update Inaccount set money=?,time=?,type=?,handler=?,depict=? where _id=?";
		db=dbhelper.getReadableDatabase();
		db.execSQL(Sql, new Object[]{inaccountmodel.getMoney(),inaccountmodel.getTime(),
				inaccountmodel.getType(),inaccountmodel.getHandler(),inaccountmodel.getDepict(),
				inaccountmodel.get_id()});
		db.close();
	}
	
	/**
	 * 删除收入信息
	 * @param inaccountmodel
	 */
	public void DelInaccount(InaccountModel inaccountmodel){
		String Sql="delete from Inaccount where _id=?";
		db=dbhelper.getReadableDatabase();
		db.execSQL(Sql, new Object[]{inaccountmodel.get_id()});
		db.close();
	}
	
	/**
	 * 查询所有收入信息
	 * @return
	 */
	public List<InaccountModel> SelectInaccount(){
		List<InaccountModel> list=new ArrayList<InaccountModel>();
		String Sql="select * from Inaccount";
		db=dbhelper.getReadableDatabase();
		Cursor c=db.rawQuery(Sql, null);
		while(c.moveToNext()){
			int _id=c.getInt(c.getColumnIndex("_id"));
			String time=c.getString(c.getColumnIndex("time"));
			Double money=c.getDouble(c.getColumnIndex("money"));
			int type=c.getInt(c.getColumnIndex("type"));
			String handler=c.getString(c.getColumnIndex("handler"));
			String depict=c.getString(c.getColumnIndex("depict"));
			list.add(new InaccountModel(_id,money,time,handler,type,depict));
		}
		c.close();
		db.close();
		return list;
	}

}
