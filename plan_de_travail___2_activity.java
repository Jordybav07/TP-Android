
	 
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

public class plan_de_travail___2_activity extends Activity {

	
	private View _bg__plan_de_travail___2_ek2;
	private View rectangle_15;
	private TextView ____________mon_porte_monnaie__montant_en_attente________0_00fc;
	private TextView ___;
	private ImageView ligne_13;
	private TextView _________________________0_00fc______________________montant_disponible_;
	private View rectangle_14;
	private TextView transferer;
	private TextView _____solde_initial_______________________0_00fc_1_janv__2021__;
	private ImageView ligne_14;
	private TextView contr_le_tes_d_penses_et_revenus__sur_kuuza__apr_s_chaque_transaction__la_somme_d_bit_e_ou_cr_dit_e__apparaitra_ici;
	private ImageView _navicon_ek5;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.plan_de_travail___2);

		
		_bg__plan_de_travail___2_ek2 = (View) findViewById(R.id._bg__plan_de_travail___2_ek2);
		rectangle_15 = (View) findViewById(R.id.rectangle_15);
		____________mon_porte_monnaie__montant_en_attente________0_00fc = (TextView) findViewById(R.id.____________mon_porte_monnaie__montant_en_attente________0_00fc);
		___ = (TextView) findViewById(R.id.___);
		ligne_13 = (ImageView) findViewById(R.id.ligne_13);
		_________________________0_00fc______________________montant_disponible_ = (TextView) findViewById(R.id._________________________0_00fc______________________montant_disponible_);
		rectangle_14 = (View) findViewById(R.id.rectangle_14);
		transferer = (TextView) findViewById(R.id.transferer);
		_____solde_initial_______________________0_00fc_1_janv__2021__ = (TextView) findViewById(R.id._____solde_initial_______________________0_00fc_1_janv__2021__);
		ligne_14 = (ImageView) findViewById(R.id.ligne_14);
		contr_le_tes_d_penses_et_revenus__sur_kuuza__apr_s_chaque_transaction__la_somme_d_bit_e_ou_cr_dit_e__apparaitra_ici = (TextView) findViewById(R.id.contr_le_tes_d_penses_et_revenus__sur_kuuza__apr_s_chaque_transaction__la_somme_d_bit_e_ou_cr_dit_e__apparaitra_ici);
		_navicon_ek5 = (ImageView) findViewById(R.id._navicon_ek5);
	
		
		_navicon_ek5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_x_xs_11_pro___5_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	