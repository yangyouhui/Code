package com.yyh.account.inaccount;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.yyh.account.R;
import com.yyh.account.accountModel.InaccountModel;
import com.yyh.account.tools.InaccountAdapter;

public class InaccountActivity extends Activity {
	private ListView lvshow;
	private InaccountAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inaccount);
		lvshow=(ListView)findViewById(R.id.lvshow);
        adapter = new InaccountAdapter(this,loadData());
        
        lvshow.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.putExtra("id", ""+loadData().get(arg2).get_id());
				intent.setClass(InaccountActivity.this, EditinActivity.class);
				startActivity(intent);
			}
		});
        
        lvshow.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				AlertDialog alert=new AlertDialog.Builder(InaccountActivity.this).create();
				alert.setCancelable(false);
				alert.setMessage("是否删除该项数据？");
				alert.setButton(DialogInterface.BUTTON_NEGATIVE, "否",new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						Toast.makeText(InaccountActivity.this, "fanhui", 1).show();
					}
				});
				alert.setButton(DialogInterface.BUTTON_POSITIVE,"是", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						Toast.makeText(InaccountActivity.this, "shanchu", 1).show();
					}
				});
				alert.show();
				return true;
			}
		});
       
        lvshow.setAdapter(adapter);
    }
    
    private List<InaccountModel> loadData() {
    	List<InaccountModel> dataArray=new ArrayList<InaccountModel>();
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(2,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	return dataArray;
	}
}
