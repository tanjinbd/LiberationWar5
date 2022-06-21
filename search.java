package com.gpit.mapsbd;

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

		actionBar.setTitle("GPIT Railway - Search");

		// actionBar.setHomeAction(new IntentAction(this,
		// MapOverlayMain.createIntent(this), R.drawable.home));
		actionBar.setDisplayHomeAsUpEnabled(true);

		final Action shareAction = new IntentAction(this,
				MapOverlayMain.createIntent(this), R.drawable.home);
		actionBar.addAction(shareAction);
		actionBar.clearHomeAction();
		// final Action otherAction = new IntentAction(this, new Intent(this,
		// routes.class), R.drawable.ic_action_search);
		// actionBar.addAction(otherAction);

		// Get application context for later use
		context = getApplicationContext();
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner2 = (Spinner) findViewById(R.id.spinner2);

		spinner_fn();

	}

	private void spinner_fn() {

		/*
		 * Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
		 * spinner1.setOnItemSelectedListener(new SpinnerHandler());
		 */

		ArrayAdapter<CharSequence> dataAdapter1 = ArrayAdapter
				.createFromResource(this, R.array.spinner1_entries,
						android.R.layout.simple_spinner_item);

		dataAdapter1
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner1.setAdapter(dataAdapter1);

		final ArrayAdapter<CharSequence> dataAdapter2 = ArrayAdapter
				.createFromResource(this, R.array.dhaka_entries,
						android.R.layout.simple_spinner_item);

		final ArrayAdapter<CharSequence> dataAdapter3 = ArrayAdapter
				.createFromResource(this, R.array.rajshahi_entries,
						android.R.layout.simple_spinner_item);

		final ArrayAdapter<CharSequence> dataAdapter4 = ArrayAdapter
				.createFromResource(this, R.array.khulna_entries,
						android.R.layout.simple_spinner_item);

		final ArrayAdapter<CharSequence> dataAdapter5 = ArrayAdapter
				.createFromResource(this, R.array.mymen_entries,
						android.R.layout.simple_spinner_item);

		final ArrayAdapter<CharSequence> dataAdapter6 = ArrayAdapter
				.createFromResource(this, R.array.dinaj_entries,
						android.R.layout.simple_spinner_item);

		final ArrayAdapter<CharSequence> dataAdapter7 = ArrayAdapter
				.createFromResource(this, R.array.chitta_entries,
						android.R.layout.simple_spinner_item);
		final ArrayAdapter<CharSequence> dataAdapter8 = ArrayAdapter
				.createFromResource(this, R.array.sylhet_entries,
						android.R.layout.simple_spinner_item);
		final ArrayAdapter<CharSequence> dataAdapter9 = ArrayAdapter
				.createFromResource(this, R.array.kishore_entries,
						android.R.layout.simple_spinner_item);
		final ArrayAdapter<CharSequence> dataAdapter10 = ArrayAdapter
				.createFromResource(this, R.array.ddnbzr_entries,
						android.R.layout.simple_spinner_item);
		final ArrayAdapter<CharSequence> dataAdapter11 = ArrayAdapter
				.createFromResource(this, R.array.bbpurbo_entries,
						android.R.layout.simple_spinner_item);
		final ArrayAdapter<CharSequence> dataAdapter12 = ArrayAdapter
				.createFromResource(this, R.array.lal_entries,
						android.R.layout.simple_spinner_item);
		final ArrayAdapter<CharSequence> dataAdapter13 = ArrayAdapter
				.createFromResource(this, R.array.shan_entries,
						android.R.layout.simple_spinner_item);

		spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
			// @Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long id) {
				if (arg0.getItemAtPosition(position).toString().equals("Dhaka")) {
					dataAdapter2
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinner2.setAdapter(dataAdapter2);
					// spinner2.setSelection(position);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Rajshahi")) {
					dataAdapter3
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinner2.setAdapter(dataAdapter3);
					// spinner2.setSelection(position);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Khulna")) {
					spinner3 = (Spinner) findViewById(R.id.spinner2);
					spinner3.setOnItemSelectedListener(new OnItemSelectedListener() {

						// @Override
						public void onItemSelected(AdapterView<?> arg0,
								View arg1, int position, long arg3) {

							if (arg0.getItemAtPosition(position).toString()
									.equals("Dhaka")) {
								Intent i = new Intent(getApplicationContext(),
										khulnadhaka.class);
								startActivity(i);

							} else if (arg0.getItemAtPosition(position)
									.toString().equals("Rajshahi")) {
								Intent i = new Intent(getApplicationContext(),
										khulnaraj.class);
								startActivity(i);
							} else if (arg0.getItemAtPosition(position)
									.toString().equals("Saidpur")) {
								Intent i = new Intent(getApplicationContext(),
										khulnasp.class);
								startActivity(i);
							}

						}

						// @Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
						}
					});
					dataAdapter4
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinner3.setAdapter(dataAdapter4);
					// spinner2.setSelection(position);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Mymensingh")) {
					spinner4 = (Spinner) findViewById(R.id.spinner2);
					spinner4.setOnItemSelectedListener(new OnItemSelectedListener() {

						// @Override
						public void onItemSelected(AdapterView<?> arg0,
								View arg1, int position, long arg3) {

							if (arg0.getItemAtPosition(position).toString()
									.equals("Dhaka")) {
								Intent i = new Intent(getApplicationContext(),
										mymendhaka.class);
								startActivity(i);

							} else if (arg0.getItemAtPosition(position)
									.toString().equals("BBSetuEast")) {
								Intent i = new Intent(getApplicationContext(),
										mymensetu.class);
								startActivity(i);
							}

						}

						// @Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
						}
					});
					dataAdapter5
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinner4.setAdapter(dataAdapter5);
					// spinner2.setSelection(position);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Dinajpur")) {

					spinner5 = (Spinner) findViewById(R.id.spinner2);

					spinner5.setOnItemSelectedListener(new OnItemSelectedListener() {

						// @Override
						public void onItemSelected(AdapterView<?> arg0,
								View arg1, int position, long arg3) {

							if (arg0.getItemAtPosition(position).toString()
									.equals("Dhaka")) {
								Intent i = new Intent(getApplicationContext(),
										dinajdhaka.class);
								startActivity(i);

							} else if (arg0.getItemAtPosition(position)
									.toString().equals("Shantahar")) {
								Intent i = new Intent(getApplicationContext(),
										dinajshan.class);
								startActivity(i);
							}

						}

						// @Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
						}
					});
					dataAdapter6
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinner5.setAdapter(dataAdapter6);
					// spinner2.setSelection(position);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Chittagong")) {
					spinner6 = (Spinner) findViewById(R.id.spinner2);
					spinner6.setOnItemSelectedListener(new OnItemSelectedListener() {

						// @Override
						public void onItemSelected(AdapterView<?> arg0,
								View arg1, int position, long arg3) {

							if (arg0.getItemAtPosition(position).toString()
									.equals("Dhaka")) {
								Intent i = new Intent(getApplicationContext(),
										chittadhaka.class);
								startActivity(i);

							} else if (arg0.getItemAtPosition(position)
									.toString().equals("Sylhet")) {
								Intent i = new Intent(getApplicationContext(),
										chittasylhet.class);
								startActivity(i);
							} else if (arg0.getItemAtPosition(position)
									.toString().equals("Chandpur")) {
								Intent i = new Intent(getApplicationContext(),
										chittachandpur.class);
								startActivity(i);
							} else if (arg0.getItemAtPosition(position)
									.toString().equals("BBSetuPurbo")) {
								Intent i = new Intent(getApplicationContext(),
										chittapurbo.class);
								startActivity(i);
							}

						}

						// @Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
						}
					});
					dataAdapter7
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinner6.setAdapter(dataAdapter7);
					// spinner2.setSelection(position);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Sylhet")) {
					spinner7 = (Spinner) findViewById(R.id.spinner2);
					spinner7.setOnItemSelectedListener(new OnItemSelectedListener() {

						// @Override
						public void onItemSelected(AdapterView<?> arg0,
								View arg1, int position, long arg3) {

							if (arg0.getItemAtPosition(position).toString()
									.equals("Dhaka")) {
								Intent i = new Intent(getApplicationContext(),
										syldhaka.class);
								startActivity(i);

							} else if (arg0.getItemAtPosition(position)
									.toString().equals("Chittagong")) {
								Intent i = new Intent(getApplicationContext(),
										sylchitta.class);
								startActivity(i);
							}

						}

						// @Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
						}
					});
					dataAdapter8
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinner7.setAdapter(dataAdapter8);
					// spinner2.setSelection(position);
				}

				else if (arg0.getItemAtPosition(position).toString()
						.equals("Kishoreganj")) {
					spinner8 = (Spinner) findViewById(R.id.spinner2);
					spinner8.setOnItemSelectedListener(new OnItemSelectedListener() {

						// @Override
						public void onItemSelected(AdapterView<?> arg0,
								View arg1, int position, long arg3) {

							if (arg0.getItemAtPosition(position).toString()
									.equals("Dhaka")) {
								Intent i = new Intent(getApplicationContext(),
										kishoredhaka.class);
								startActivity(i);

							}

						}

						// @Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
						}
					});
					dataAdapter9
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinner8.setAdapter(dataAdapter9);
					// spinner2.setSelection(position);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("DawangongBazar")) {
					spinner9 = (Spinner) findViewById(R.id.spinner2);
					spinner9.setOnItemSelectedListener(new OnItemSelectedListener() {

						// @Override
						public void onItemSelected(AdapterView<?> arg0,
								View arg1, int position, long arg3) {

							if (arg0.getItemAtPosition(position).toString()
									.equals("Dhaka")) {
								Intent i = new Intent(getApplicationContext(),
										bbndhaka.class);
								startActivity(i);

							}

						}

						// @Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
						}
					});
					dataAdapter10
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinner9.setAdapter(dataAdapter10);
					// spinner2.setSelection(position);
				}

				else if (arg0.getItemAtPosition(position).toString()
						.equals("B.B.SetuPurbo")) {
					spinner10 = (Spinner) findViewById(R.id.spinner2);
					spinner10
							.setOnItemSelectedListener(new OnItemSelectedListener() {

								// @Override
								public void onItemSelected(AdapterView<?> arg0,
										View arg1, int position, long arg3) {

									if (arg0.getItemAtPosition(position)
											.toString().equals("Dhaka")) {
										Intent i = new Intent(
												getApplicationContext(),
												bbpdhaka.class);
										startActivity(i);

									}

								}

								// @Override
								public void onNothingSelected(
										AdapterView<?> arg0) {
									// TODO Auto-generated method stub
								}
							});
					dataAdapter11
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinner10.setAdapter(dataAdapter11);
					// spinner2.setSelection(position);
				}

				else if (arg0.getItemAtPosition(position).toString()
						.equals("Lalmonirhat")) {

					spinner11 = (Spinner) findViewById(R.id.spinner2);
					spinner11
							.setOnItemSelectedListener(new OnItemSelectedListener() {

								// @Override
								public void onItemSelected(AdapterView<?> arg0,
										View arg1, int position, long arg3) {

									if (arg0.getItemAtPosition(position)
											.toString().equals("Dhaka")) {
										Intent i = new Intent(
												getApplicationContext(),
												laldhaka.class);
										startActivity(i);

									}

								}

								// @Override
								public void onNothingSelected(
										AdapterView<?> arg0) {
									// TODO Auto-generated method stub
								}
							});
					dataAdapter12
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinner11.setAdapter(dataAdapter12);
					// spinner2.setSelection(position);
				}

				else if (arg0.getItemAtPosition(position).toString()
						.equals("Shantahar")) {
					spinner12 = (Spinner) findViewById(R.id.spinner2);
					spinner12
							.setOnItemSelectedListener(new OnItemSelectedListener() {

								// @Override
								public void onItemSelected(AdapterView<?> arg0, 
										View arg1, int position, long arg3) {

									if (arg0.getItemAtPosition(position)
											.toString().equals("Burimari")) {
										Intent i = new Intent(
												getApplicationContext(),
												shanburi.class);
										startActivity(i);

									} else if (arg0.getItemAtPosition(position)
											.toString().equals("Dinajpur")) {
										Intent i = new Intent(
												getApplicationContext(),
												shandinaj.class);
										startActivity(i);
									}

								}

								// @Override
								public void onNothingSelected(
										AdapterView<?> arg0) {
									// TODO Auto-generated method stub
								}
							});
					dataAdapter13
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinner12.setAdapter(dataAdapter13);

				}

			}

			// @Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
			}
		});

		spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {

			// @Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {

				if (arg0.getItemAtPosition(position).toString()
						.equals("Dinajpur")) {
					Intent i = new Intent(getApplicationContext(), dhkdnj.class);
					startActivity(i);

				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Dhaka")) {
					Intent i = new Intent(getApplicationContext(), rajdhk.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Nilphamari")) {
					Intent i = new Intent(getApplicationContext(), rajnp.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Khulna")) {
					Intent i = new Intent(getApplicationContext(), rajkh.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Chilahati")) {
					Intent i = new Intent(getApplicationContext(), rajch.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Goalonda")) {
					Intent i = new Intent(getApplicationContext(), rajg.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("DhakaCant.")) {
					Intent i = new Intent(getApplicationContext(),
							rajdhkct.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Chittagong")) {
					Intent i = new Intent(getApplicationContext(), dhkch.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("DawngongeBazar")) {
					Intent i = new Intent(getApplicationContext(), dhkbz.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Sylhet")) {
					Intent i = new Intent(getApplicationContext(), dhksl.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Noakhali")) {
					Intent i = new Intent(getApplicationContext(), dhknkh.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Tarakandi")) {
					Intent i = new Intent(getApplicationContext(), dhktr.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Kishoreganj")) {
					Intent i = new Intent(getApplicationContext(), dhkkrg.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("B.BSetuPurbo")) {
					Intent i = new Intent(getApplicationContext(),
							dhkspur.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("khulna")) {
					Intent i = new Intent(getApplicationContext(), dhkkh.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Lalmonirhat")) {
					Intent i = new Intent(getApplicationContext(), dhklal.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Rajshahi")) {
					Intent i = new Intent(getApplicationContext(), dhkraj.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("B.Baria")) {
					Intent i = new Intent(getApplicationContext(),
							dhkbria.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Akhaura")) {
					Intent i = new Intent(getApplicationContext(),
							dhkakha.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Mymensingh")) {
					Intent i = new Intent(getApplicationContext(),
							dhkmmen.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Mohanganj")) {
					Intent i = new Intent(getApplicationContext(), dhkmhn.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Joydebpur")) {
					Intent i = new Intent(getApplicationContext(), dhkjdp.class);
					startActivity(i);
				} else if (arg0.getItemAtPosition(position).toString()
						.equals("Narayanganj")) {
					Intent i = new Intent(getApplicationContext(),
							dhkngng.class);
					startActivity(i);
				}

			}

			// @Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), "Select Source First, before you select Destination",
						Toast.LENGTH_SHORT).show();
			}
		});

	}

	public static Intent createIntent(Context context) {
		Intent i = new Intent(context, search.class);
		i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		return i;
	}

}