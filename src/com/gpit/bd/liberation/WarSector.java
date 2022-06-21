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
import android.view.View.OnClickListener;
import android.widget.Toast;

public class WarSector extends Activity implements OnClickListener {
	static Context context;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.warsector);
		
		ActionBar actionBar = (ActionBar) findViewById(R.id.actionbar);

		actionBar.setTitle("Liberation War - Sectors");

		final Action shareAction = new IntentAction(this,
				MainActivity.createIntent(this), R.drawable.home);
		actionBar.addAction(shareAction);
		final Action otherAction = new IntentAction(this,
				search.createIntent(this), R.drawable.ic_action_search);
		actionBar.addAction(otherAction);

		// Get application context for later use
		context = getApplicationContext();

		// Add ClickListener for the button
		View firstButton = findViewById(R.id.s1);
		firstButton.setOnClickListener(this);

		View secondButton = findViewById(R.id.s2);
		secondButton.setOnClickListener(this);

		View thirdButton = findViewById(R.id.s3);
		thirdButton.setOnClickListener(this);

		View forthButton = findViewById(R.id.s4);
		forthButton.setOnClickListener(this);

		View fifthButton = findViewById(R.id.s5);
		fifthButton.setOnClickListener(this);

		View sixthButton = findViewById(R.id.s6);
		sixthButton.setOnClickListener(this);

		View seventhButton = findViewById(R.id.s7);
		seventhButton.setOnClickListener(this);

		View eightButton = findViewById(R.id.s8);
		eightButton.setOnClickListener(this);

		View ninthButton = findViewById(R.id.s9);
		ninthButton.setOnClickListener(this);

		View tenthButton = findViewById(R.id.s10);
		tenthButton.setOnClickListener(this);

		View eleventhButton = findViewById(R.id.s11);
		eleventhButton.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.s1:
			Intent i = new Intent(this, sector1.class);
			startActivity(i);
			break;
		case R.id.s2:
			Intent i1 = new Intent(this, sector2.class);
			startActivity(i1);
			break;
		case R.id.s3:
			Intent i2 = new Intent(this, sector3.class);
			startActivity(i2);
			break;
		case R.id.s4:
			Intent i3 = new Intent(this, sector4.class);
			startActivity(i3);
			break;
		case R.id.s5:
			Intent i4 = new Intent(this, sector5.class);
			startActivity(i4);
			break;
		case R.id.s6:
			Intent i5 = new Intent(this, sector6.class);
			startActivity(i5);
			break;
		case R.id.s7:
			Intent i6 = new Intent(this, sector7.class);
			startActivity(i6);
			break;
		case R.id.s8:
			Intent i7 = new Intent(this, sector8.class);
			startActivity(i7);
			break;
		case R.id.s9:
			Intent i8 = new Intent(this, sector9.class);
			startActivity(i8);
			break;
		case R.id.s10:
			Intent i9 = new Intent(this, sector10.class);
			startActivity(i9);
			break;
		case R.id.s11:
			Intent i10 = new Intent(this, sector11.class);
			startActivity(i10);
			break;
		}
	}

	public static void showToast(String text) {
		Toast.makeText(context, text, Toast.LENGTH_LONG).show();
	}

}
