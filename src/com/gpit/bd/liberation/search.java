package com.gpit.bd.liberation;

/*Developed by GPIT Ltd. // Coded by Tanjin Ahsan*/

import com.markupartist.android.widget.ActionBar;
import com.markupartist.android.widget.ActionBar.Action;
import com.markupartist.android.widget.ActionBar.IntentAction;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class search extends Activity {
	static Context context;

	Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6,
			spinner7, spinner8, spinner9, spinner10, spinner11, spinner12;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search);

		ActionBar actionBar = (ActionBar) findViewById(R.id.actionbar);

		actionBar.setTitle("Liberation War - Search");

		// actionBar.setHomeAction(new IntentAction(this,
		// MapOverlayMain.createIntent(this), R.drawable.home));
		actionBar.setDisplayHomeAsUpEnabled(true);

		final Action shareAction = new IntentAction(this,
				MainActivity.createIntent(this), R.drawable.home);
		actionBar.addAction(shareAction);
		actionBar.clearHomeAction();
		// final Action otherAction = new IntentAction(this, new Intent(this,
		// routes.class), R.drawable.ic_action_search);
		// actionBar.addAction(otherAction);

		// Get application context for later use
		context = getApplicationContext();

	}
	
	public static Intent createIntent(Context context) {
		Intent i = new Intent(context, search.class);
		i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		return i;
	}

}