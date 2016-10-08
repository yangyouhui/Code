package com.yyh.account.inaccount;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.yyh.account.R;
import com.yyh.account.accountModel.InaccountModel;
import com.yyh.account.tools.InccountAdapter;

public class InaccountActivity extends Activity {
	private ListView lvshow;
	private InccountAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inaccount);
		lvshow=(ListView)findViewById(R.id.lvshow);
        adapter = new InccountAdapter(this,loadData());
        
        lvshow.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(InaccountActivity.this,loadData().get(arg2).getTime(),Toast.LENGTH_SHORT).show();
			}
		});
        lvshow.setAdapter(adapter);
    }
    
    private List<InaccountModel> loadData() {
    	List<InaccountModel> dataArray=new ArrayList<InaccountModel>();
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
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	dataArray.add(new InaccountModel(1,500.0,"2016_9_25","沃尔玛超市",1,"qq"));
    	return dataArray;
	}
}
