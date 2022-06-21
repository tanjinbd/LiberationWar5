package com.gpit.bd.liberation;

//import com.gpit.bd.railway.R;

import com.markupartist.android.widget.ActionBar;
import com.markupartist.android.widget.ActionBar.Action;
import com.markupartist.android.widget.ActionBar.IntentAction;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.app.Activity;

import android.view.Menu;

public class events extends Activity {
	CharSequence[] items = { "Early 1971", "Vasha Andolon", "Post 1971", "After War Condition",
			"16th December" };
	boolean[] itemsChecked = new boolean[items.length];

	ProgressDialog progressDialog;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.events);
		ActionBar actionBar = (ActionBar) findViewById(R.id.actionbar);

		actionBar.setTitle("Liberation War - Events");

		final Action shareAction = new IntentAction(this,
				MainActivity.createIntent(this), R.drawable.home);
		actionBar.addAction(shareAction);
		final Action otherAction = new IntentAction(this,
				search.createIntent(this), R.drawable.ic_action_search);
		actionBar.addAction(otherAction);
		
	}

	public void onClick(View v) {
		showDialog(0);
	}

	public void onClick2(View v) {
		// Show the dialog
		final ProgressDialog dialog = ProgressDialog.show(this,
				"Checking for Updated Data", "Please Wait...", true);
		new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(5000);
					dialog.dismiss();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}).start();
	}

	public void onClick3(View v) {
		showDialog(1);
		progressDialog.setProgress(0);
		new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 15; i++) {
					try {
						Thread.sleep(1000);
						progressDialog.incrementProgressBy((int) (100 / 15));

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				progressDialog.dismiss();
			}

		}).start();
	}

	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case 0:
			return new AlertDialog.Builder(this)
					.setIcon(R.drawable.ic_launcher)
					.setTitle("Where do you want to go today?...")
					.setPositiveButton("OK",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int whichButton) {

									Toast.makeText(
											getBaseContext(),
											"Thanks for your selection!",
											Toast.LENGTH_SHORT).show();
								}
							})

					.setNegativeButton("Cancel",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int whichButton) {
									Toast.makeText(getBaseContext(),
											"Cancel clicked!",
											Toast.LENGTH_SHORT).show();
								}
							})
					.setMultiChoiceItems(items, itemsChecked,
							new DialogInterface.OnMultiChoiceClickListener() {
								public void onClick(DialogInterface dialog,
										int which, boolean isChecked) {
									Toast.makeText(
											getBaseContext(),
											items[which]
													+ (isChecked ? " checked!"
															: " unchecked!"),
											Toast.LENGTH_SHORT).show();

								}
							}).create();
		case 1:
			progressDialog = new ProgressDialog(this);
			progressDialog.setIcon(R.drawable.ic_launcher);
			progressDialog.setTitle("Downloading Updated Data...");
			progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			progressDialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK",
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,
								int whichButton) {
							Toast.makeText(getBaseContext(), "OK clicked",
									Toast.LENGTH_SHORT).show();

						}
					});

			progressDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel",
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,
								int whichButton) {
							Toast.makeText(getBaseContext(), "Cancel clicked!",
									Toast.LENGTH_SHORT).show();
						}
					});
			return progressDialog;
		}
		return null;
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}*/
}
