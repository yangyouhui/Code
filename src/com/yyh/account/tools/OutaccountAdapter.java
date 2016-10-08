package com.yyh.account.tools;

import java.util.List;

import com.yyh.account.R;
import com.yyh.account.accountModel.InaccountModel;
import com.yyh.account.accountModel.OutaccountModel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class OutaccountAdapter extends BaseAdapter {

	private LayoutInflater inflater;
	private List<OutaccountModel> Arraydata;
	
	public OutaccountAdapter(Context context,List<OutaccountModel> Arraydata){
		inflater = LayoutInflater.from(context);
		this.Arraydata= Arraydata;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return Arraydata.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if(arg1 == null){
			arg1 = inflater.inflate(R.layout.item,null);
			holder = new ViewHolder();
			holder.intvmoney= (TextView)arg1.findViewById(R.id.tvmoney);
			holder.intvtype=(TextView)arg1.findViewById(R.id.tvtype);
			holder.intvtime=(TextView)arg1.findViewById(R.id.tvtime);
			arg1.setTag(holder);
		}
		else{
			holder = (ViewHolder)arg1.getTag();
		}
		holder.intvmoney.setText(""+Arraydata.get(arg0).getMoney());
		holder.intvtype.setText(""+Arraydata.get(arg0).getType());
		holder.intvtime.setText(Arraydata.get(arg0).getTime());
		return arg1;
	}


}
