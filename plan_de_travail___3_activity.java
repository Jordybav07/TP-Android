
	 
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

public class plan_de_travail___3_activity extends Activity {

	
	private View _bg__plan_de_travail___3_ek2;
	private TextView _______________________________________________________reduction_sur_les_lots___________________________________________________________________choisis_tes_r_ductions;
	private TextView ___ek1;
	private View rectangle_16;
	private ImageView trac__2;
	private TextView _______________________________________________________________2_articles___________________________________________20_;
	private TextView ________;
	private TextView _3_articles;
	private TextView _______________________30_;
	private TextView _5_articles____________________________________________50_;
	private TextView ________________reduction_pour;
	private TextView ______________________________________________________tu_peux_accorder_des_r_ductions_croissante____________________________________________________________en_commen_ant_par_le_nombre_d_article_que_______________________________________________________plus_;
	private ImageView _navicon_ek6;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.plan_de_travail___3);

		
		_bg__plan_de_travail___3_ek2 = (View) findViewById(R.id._bg__plan_de_travail___3_ek2);
		_______________________________________________________reduction_sur_les_lots___________________________________________________________________choisis_tes_r_ductions = (TextView) findViewById(R.id._______________________________________________________reduction_sur_les_lots___________________________________________________________________choisis_tes_r_ductions);
		___ek1 = (TextView) findViewById(R.id.___ek1);
		rectangle_16 = (View) findViewById(R.id.rectangle_16);
		trac__2 = (ImageView) findViewById(R.id.trac__2);
		_______________________________________________________________2_articles___________________________________________20_ = (TextView) findViewById(R.id._______________________________________________________________2_articles___________________________________________20_);
		________ = (TextView) findViewById(R.id.________);
		_3_articles = (TextView) findViewById(R.id._3_articles);
		_______________________30_ = (TextView) findViewById(R.id._______________________30_);
		_5_articles____________________________________________50_ = (TextView) findViewById(R.id._5_articles____________________________________________50_);
		________________reduction_pour = (TextView) findViewById(R.id.________________reduction_pour);
		______________________________________________________tu_peux_accorder_des_r_ductions_croissante____________________________________________________________en_commen_ant_par_le_nombre_d_article_que_______________________________________________________plus_ = (TextView) findViewById(R.id.______________________________________________________tu_peux_accorder_des_r_ductions_croissante____________________________________________________________en_commen_ant_par_le_nombre_d_article_que_______________________________________________________plus_);
		_navicon_ek6 = (ImageView) findViewById(R.id._navicon_ek6);
	
		
		_navicon_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_x_xs_11_pro___5_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	