
	 
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

public class plan_de_travail___1_activity extends Activity {

	
	private View _bg__plan_de_travail___1_ek2;
	private TextView __________kuuza_est_une_plateforme_que_nous__mettons___la_disposition_de_tout__client_qui_d_sire_vendre_son_produit__ou_encore_d_acheter_un_produit_d_un__autre_client_en_ligne__notre_but_est_de_satisfaire_le_besoin_du_client_en_lui_offrant_une_opportunit__d;
	private TextView __a_propos_de_nous;
	private ImageView _navicon_ek4;
	private ImageView trac__8;
	private TextView pour_plus_de_details__contacter__nous_au_0994312466__0850220336;
	private TextView n_h_siter_surtout_pas_de_passer_a__nos_bureaux_av_kaseba__q_gambela_n_45;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.plan_de_travail___1);

		
		_bg__plan_de_travail___1_ek2 = (View) findViewById(R.id._bg__plan_de_travail___1_ek2);
		__________kuuza_est_une_plateforme_que_nous__mettons___la_disposition_de_tout__client_qui_d_sire_vendre_son_produit__ou_encore_d_acheter_un_produit_d_un__autre_client_en_ligne__notre_but_est_de_satisfaire_le_besoin_du_client_en_lui_offrant_une_opportunit__d = (TextView) findViewById(R.id.__________kuuza_est_une_plateforme_que_nous__mettons___la_disposition_de_tout__client_qui_d_sire_vendre_son_produit__ou_encore_d_acheter_un_produit_d_un__autre_client_en_ligne__notre_but_est_de_satisfaire_le_besoin_du_client_en_lui_offrant_une_opportunit__d);
		__a_propos_de_nous = (TextView) findViewById(R.id.__a_propos_de_nous);
		_navicon_ek4 = (ImageView) findViewById(R.id._navicon_ek4);
		trac__8 = (ImageView) findViewById(R.id.trac__8);
		pour_plus_de_details__contacter__nous_au_0994312466__0850220336 = (TextView) findViewById(R.id.pour_plus_de_details__contacter__nous_au_0994312466__0850220336);
		n_h_siter_surtout_pas_de_passer_a__nos_bureaux_av_kaseba__q_gambela_n_45 = (TextView) findViewById(R.id.n_h_siter_surtout_pas_de_passer_a__nos_bureaux_av_kaseba__q_gambela_n_45);
	
		
		_navicon_ek4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_x_xs_11_pro___5_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	