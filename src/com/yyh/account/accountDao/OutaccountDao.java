package com.yyh.account.accountDao;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.yyh.account.accountModel.OutaccountModel;
import com.yyh.account.tools.DBHelper;

public class OutaccountDao {

	private DBHelper dbhelper;
	private SQLiteDatabase db;
	public OutaccountDao(Context context){
		dbhelper =new DBHelper(context);
	}
	
	/**
	 * 新增支出信息
	 * @param inaccountmodel
	 */
	public void AddOutaccount(OutaccountModel outaccountmodel){
		String Sql="insert into Outaccount(money,time,type,address,depict) values(?,?,?,?,?)";
		db=dbhelper.getReadableDatabase();
		db.execSQL(Sql, new Object[]{outaccountmodel.getMoney(),outaccountmodel.getTime(),
				outaccountmodel.getType(),outaccountmodel.getAddress(),outaccountmodel.getDepict()});
		db.close();
	}
	
	/**
	 * 编辑支出信息
	 * @param inaccountmodel
	 */
	public void EditOutaccount(OutaccountModel outaccountmodel){
		String Sql="update Outaccount set money=?,time=?,type=?,address=?,depict=? where _id=?";
		db=dbhelper.getReadableDatabase();
		db.execSQL(Sql, new Object[]{outaccountmodel.getMoney(),outaccountmodel.getTime(),
				outaccountmodel.getType(),outaccountmodel.getAddress(),outaccountmodel.getDepict(),
				outaccountmodel.get_id()});
		db.close();
	}
	
	/**
	 * 删除支出信息
	 * @param inaccountmodel
	 */
	public void DelOutaccount(OutaccountModel outaccountmodel){
		String Sql="delete from Outaccount where _id=?";
		db=dbhelper.getReadableDatabase();
		db.execSQL(Sql, new Object[]{outaccountmodel.get_id()});
		db.close();
	}
	
	/**
	 * 查询所有支出信息
	 * @return
	 */
	public List<OutaccountModel> SelectOutaccount(){
		List<OutaccountModel> list=new ArrayList<OutaccountModel>();
		String Sql="select * from Inaccount";
		db=dbhelper.getReadableDatabase();
		Cursor c=db.rawQuery(Sql, null);
		while(c.moveToNext()){
			int _id=c.getInt(c.getColumnIndex("_id"));
			String time=c.getString(c.getColumnIndex("time"));
			Double money=c.getDouble(c.getColumnIndex("money"));
			int type=c.getInt(c.getColumnIndex("type"));
			String address=c.getString(c.getColumnIndex("handler"));
			String depict=c.getString(c.getColumnIndex("depict"));
			list.add(new OutaccountModel(_id,money,time,address,type,depict));
		}
		c.close();
		db.close();
		return list;
	}
}
