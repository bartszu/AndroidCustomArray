package com.example.rtre;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;

public class ListMobileActivity extends ListActivity {

	//String product = (String) getListAdapter().getItem(position);

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		
		setListAdapter(new MyAdapter(
        		this,  
				android.R.layout.simple_list_item_2 ,  
				R.id.textView1,
				getResources().getStringArray(R.array.countries)));
		
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		//get selected items
		String selectedValue = (String) getListAdapter().getItem(position);
		Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();
		// startActivity(new Intent(  ListMobileActivity.this,    Some.class));

		Intent i = new Intent(getApplicationContext(), Some.class);
         
 		i.putExtra("selectedValue",  selectedValue );
      	 startActivity(i);
		
		
	}

}