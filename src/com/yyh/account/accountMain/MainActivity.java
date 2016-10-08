package com.yyh.account.accountMain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yyh.account.R;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void InaccountClick(View v){
    	
    	Intent intent =new Intent();
    	intent.setClass(MainActivity.this,com.yyh.account.inaccount.InaccountActivity.class);
    	startActivity(intent);
    	
    }
    
    public void OutaccountClick(View v){
    	
    	Intent intent =new Intent();
    	intent.setClass(MainActivity.this,com.yyh.account.accountout.OutaccountActivity.class);
    	startActivity(intent);
    	
    }
    
    public void FlagClick(View v){
    	
    	Intent intent =new Intent();
    	intent.setClass(MainActivity.this,com.yyh.account.flag.FlagActivity.class);
    	startActivity(intent);
    	
    }
}
