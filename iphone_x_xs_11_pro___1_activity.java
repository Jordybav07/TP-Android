
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_x_xs_11_pro___1
	 *	@date 		0
	 *	@title 		iPhone X/XS/11 Pro  1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.xd
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class iphone_x_xs_11_pro___1_activity extends Activity {

	
	private View _bg__iphone_x_xs_11_pro___1_ek2;
	private TextView bienvenue_sur_;
	private TextView kuuza;
	private ImageView _trac__4;
	private TextView transformer_votre_valise;
	private ImageView ios7_c74art;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_x_xs_11_pro___1);

		
		_bg__iphone_x_xs_11_pro___1_ek2 = (View) findViewById(R.id._bg__iphone_x_xs_11_pro___1_ek2);
		bienvenue_sur_ = (TextView) findViewById(R.id.bienvenue_sur_);
		kuuza = (TextView) findViewById(R.id.kuuza);
		_trac__4 = (ImageView) findViewById(R.id._trac__4);
		transformer_votre_valise = (TextView) findViewById(R.id.transformer_votre_valise);
		ios7_c74art = (ImageView) findViewById(R.id.ios7_c74art);
	
		
		_trac__4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_x_xs_11_pro___5_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	