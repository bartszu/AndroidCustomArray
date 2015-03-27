package com.example.rtre;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Some extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_some);
		
		DoOnButtonSec();
		 
	}
	
	private void DoOnButtonSec(){
		Button button1 = (Button)findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				Toast.makeText(Some.this, "Back To Main", Toast.LENGTH_SHORT).show();
			//startActivity(new Intent(MainActivity.this, Second.class));
				finish();
		}
		});
		
		
		 TextView txtProduct = (TextView) findViewById(R.id.textView1);
	     
		 
	        Intent i = getIntent();
	        // getting attached intent data
	        String selectedValue = i.getStringExtra("selectedValue");
	        // displaying selected product name
	        txtProduct.setText(selectedValue);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.some, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		//f (id == R.id.action_settings) {
			return true;
	//}
		//return super.onOptionsItemSelected(item);
	}
}
