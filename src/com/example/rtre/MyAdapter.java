package com.example.rtre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
	
	public class MyAdapter extends ArrayAdapter<String>{
		
		private final Context context;
		
		public MyAdapter (
				
				Context context, 
				int resource, 
				int textViewResourceId,												
				String [] ask 
				
				)				
		{
			super(context, resource, textViewResourceId, ask  );															
									
			this.context = context;
			}
				@Override
		    	public View getView(int position, View convertView, ViewGroup parent) {
					
		    	LayoutInflater infater  = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		    	View row = infater.inflate( R.layout.main_drugi  , parent  ,  false );
		    	String[] ask  = context.getResources().getStringArray (R.array.countries);
		    	ImageView iv =  (ImageView) row.findViewById(R.id.imageView1 ) ;
		    	
		    	TextView tv = (TextView) row.findViewById(R.id.textView1 ) ;
		    			//tv.setOnClickListener(this);
		    			
		    			tv.setText(ask[ position  ]);
		    			
		    			if( ask[ position ].equals("Grab")) {
		    				iv.setImageResource(R.drawable.a);
		    			}
		    			
		    			
		    			else if( ask[ position ].equals("System")) {
		    				iv.setImageResource(R.drawable.m);
		    			}
		    			
		    			else if( ask[ position ].equals("Computer")){
		    				iv.setImageResource(R.drawable.k);
		    			}
		    			
		    			else if( ask[ position ].equals("Linux")){
		    				iv.setImageResource(R.drawable.l);
		    			}
		    			
		    			else if( ask[ position ].equals("Android")){
		    				iv.setImageResource(R.drawable.e);
		    			}
		    				
		    			else if( ask[ position ].equals("USB")) {
		        				iv.setImageResource(R.drawable.f);
		        		}
		        			
		        		else if( ask[ position ].equals("NIC")){
		        				iv.setImageResource(R.drawable.a);
		        		}
		        			
		        		else if( ask[ position ].equals("Settings")){
		        				iv.setImageResource(R.drawable.h);
		        		}
		        			
		        		else if( ask[ position ].equals("Setup")){
		        				iv.setImageResource(R.drawable.i);
		        		}
		        				
		        				else if( ask[ position ].equals("Install")) {
		            				iv.setImageResource(R.drawable.j);
		            			}
		            			
		            			else if( ask[ position ].equals("Compres")){
		            				iv.setImageResource(R.drawable.n);
		            			}
		            			
		            			else if( ask[ position ].equals("Tivoize")){
		            				iv.setImageResource(R.drawable.b);
		            			}
		            			
		            			else if( ask[ position ].equals("Destroy")){
		            				iv.setImageResource(R.drawable.g);
		            			
		            			}
		    			
		            			else if( ask[ position ].equals("Run")){
		            				iv.setImageResource(R.drawable.c);
		    			
		    				
		    			}
		    	return row;		    	
	}
	
}