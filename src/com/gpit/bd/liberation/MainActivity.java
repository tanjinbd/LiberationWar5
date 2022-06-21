package com.gpit.bd.liberation;

import android.os.Bundle;

import com.markupartist.android.widget.ActionBar;
import com.markupartist.android.widget.ActionBar.Action;
import com.markupartist.android.widget.ActionBar.IntentAction;

import android.view.View;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.content.Context;
import android.content.Intent;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Initiate ActionBar Sherlock for Gingerbread
		ActionBar actionBar = (ActionBar) findViewById(R.id.actionbar);
		actionBar.setTitle("BD Liberation War");

		final Action otherAction = new IntentAction(this,
				search.createIntent(this), R.drawable.ic_action_search);
		actionBar.addAction(otherAction);
		actionBar.clearHomeAction();

		// Add ClickListener for the button
		View firstButton = findViewById(R.id.intro);
		firstButton.setOnClickListener(this);

		// Add ClickListener for the second button
		View secondButton = findViewById(R.id.right1);
		secondButton.setOnClickListener(this);

		// Add ClickListener for the button
		View thirdButton = findViewById(R.id.right2);
		thirdButton.setOnClickListener(this);
		View forthButton = findViewById(R.id.l21);
		forthButton.setOnClickListener(this);

		View fifthButton = findViewById(R.id.l22);
		fifthButton.setOnClickListener(this);

		View sixthButton = findViewById(R.id.lb1);
		sixthButton.setOnClickListener(this);

		/*
		 * View seventhButton = findViewById(R.id.rb1);
		 * seventhButton.setOnClickListener(this);
		 */

	}

	public void onClick(View v) {

		// startActivity(new Intent("com.gpit.bd.liberation.intro"));

		switch (v.getId()) {
		case R.id.intro:
			Intent i = new Intent(this, intro.class);
			startActivity(i);
			break;
		case R.id.right1:
			Intent i1 = new Intent(this, events.class);
			startActivity(i1);
			break;
		case R.id.right2:
			Intent i2 = new Intent(this, allMedia.class);
			startActivity(i2);
			break;
		case R.id.l21:
			Intent i21 = new Intent(this, intro.class);
			startActivity(i21);
			break;
		case R.id.l22:
			Intent i22 = new Intent(this, WarSector.class);
			startActivity(i22);
			break;
		case R.id.lb1:
			Intent lb1 = new Intent(this, CalendarView.class);
			startActivity(lb1);
			break;
		case R.id.rb1:
			Intent rb1 = new Intent(this, media.class);

			startActivity(rb1);
			break;

		}

	}

	public void onClick2(View view) {
		startActivity(new Intent("com.gpit.bd.liberation.events"));
	}

	public void onClick3(View view) {

		startActivity(new Intent("com.gpit.bd.railway.media"));

	}

	public void onClick4(View view) {

		startActivity(new Intent("com.gpit.bd.railway.media"));

	}

	public static Intent createIntent(Context context) {
		Intent i = new Intent(context, MainActivity.class);
		i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		return i;
	}

}