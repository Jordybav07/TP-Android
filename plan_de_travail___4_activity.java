
	 
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
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;

public class plan_de_travail___4_activity extends Activity {

	
	private View _bg__plan_de_travail___4_ek2;
	private View rectangle_17;
	private ImageView trac__3;
	private View rectangle_19;
	private View rectangle_20;
	private View _rectangle_24;
	private View rectangle_25;
	private View rectangle_21;
	private TextView _____________________personnalisation_;
	private TextView _mon_porte_monnaie_;
	private TextView _mes_ventes_et_achats;
	private TextView _________________________________________________________r_duction_sur_les_lots_______________;
	private TextView forum_;
	private TextView _a_propos_de_kuuza_;
	private TextView mon_profil;
	private ImageView _navicon_ek7;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.plan_de_travail___4);

		
		_bg__plan_de_travail___4_ek2 = (View) findViewById(R.id._bg__plan_de_travail___4_ek2);
		rectangle_17 = (View) findViewById(R.id.rectangle_17);
		trac__3 = (ImageView) findViewById(R.id.trac__3);
		rectangle_19 = (View) findViewById(R.id.rectangle_19);
		rectangle_20 = (View) findViewById(R.id.rectangle_20);
		_rectangle_24 = (View) findViewById(R.id._rectangle_24);
		rectangle_25 = (View) findViewById(R.id.rectangle_25);
		rectangle_21 = (View) findViewById(R.id.rectangle_21);
		_____________________personnalisation_ = (TextView) findViewById(R.id._____________________personnalisation_);
		_mon_porte_monnaie_ = (TextView) findViewById(R.id._mon_porte_monnaie_);
		_mes_ventes_et_achats = (TextView) findViewById(R.id._mes_ventes_et_achats);
		_________________________________________________________r_duction_sur_les_lots_______________ = (TextView) findViewById(R.id._________________________________________________________r_duction_sur_les_lots_______________);
		forum_ = (TextView) findViewById(R.id.forum_);
		_a_propos_de_kuuza_ = (TextView) findViewById(R.id._a_propos_de_kuuza_);
		mon_profil = (TextView) findViewById(R.id.mon_profil);
		_navicon_ek7 = (ImageView) findViewById(R.id._navicon_ek7);
	
		
		_rectangle_24.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), plan_de_travail___3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_mon_porte_monnaie_.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), plan_de_travail___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_mes_ventes_et_achats.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_x_xs_11_pro___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_a_propos_de_kuuza_.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), plan_de_travail___1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_navicon_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_x_xs_11_pro___5_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	