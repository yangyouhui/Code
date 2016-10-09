package com.yyh.account.inaccount;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.yyh.account.R;

public class EditinActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_editin);
		
		Intent intent=getIntent();
		Toast.makeText(EditinActivity.this,intent.getStringExtra("id"),Toast.LENGTH_SHORT).show();
	}
}
