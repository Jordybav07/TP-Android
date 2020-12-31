
	 
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

public class iphone_x_xs_11_pro___4_activity extends Activity {

	
	private View _bg__iphone_x_xs_11_pro___4_ek2;
	private TextView formulaire_d_inscription___nom_d_utilisateur___email___mot_de_passe;
	private ImageView ligne_3;
	private ImageView ligne_4;
	private ImageView ligne_5;
	private ImageView _trac__5;
	private TextView s_inscrire;
	private ImageView ios7_information_outline;
	private TextView _nous_contacter;
	private ImageView _navicon;
	private ImageView navicon_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_x_xs_11_pro___4);

		
		_bg__iphone_x_xs_11_pro___4_ek2 = (View) findViewById(R.id._bg__iphone_x_xs_11_pro___4_ek2);
		formulaire_d_inscription___nom_d_utilisateur___email___mot_de_passe = (TextView) findViewById(R.id.formulaire_d_inscription___nom_d_utilisateur___email___mot_de_passe);
		ligne_3 = (ImageView) findViewById(R.id.ligne_3);
		ligne_4 = (ImageView) findViewById(R.id.ligne_4);
		ligne_5 = (ImageView) findViewById(R.id.ligne_5);
		_trac__5 = (ImageView) findViewById(R.id._trac__5);
		s_inscrire = (TextView) findViewById(R.id.s_inscrire);
		ios7_information_outline = (ImageView) findViewById(R.id.ios7_information_outline);
		_nous_contacter = (TextView) findViewById(R.id._nous_contacter);
		_navicon = (ImageView) findViewById(R.id._navicon);
		navicon_ek1 = (ImageView) findViewById(R.id.navicon_ek1);
	
		
		_trac__5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), plan_de_travail___4_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_nous_contacter.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), plan_de_travail___1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_navicon.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_x_xs_11_pro___5_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	