package com.gpit.bd.liberation;

//import com.gpit.bd.railway.R;

import com.markupartist.android.widget.ActionBar;
import com.markupartist.android.widget.ActionBar.Action;
import com.markupartist.android.widget.ActionBar.IntentAction;

import android.app.Activity;
//import android.net.Uri;
import android.os.Bundle;
//import android.widget.MediaController;
//import android.widget.VideoView;

public class sector9 extends Activity {

	// String SrcPath =
	// "android.raw://com.gpit.bd.liberation.movievp8/sdcard/Video/Android in Spaaaaaace!_low.mp4";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sector9);
		
		ActionBar actionBar = (ActionBar) findViewById(R.id.actionbar);

		actionBar.setTitle("Liberation War - Sectors");

		final Action shareAction = new IntentAction(this,
				MainActivity.createIntent(this), R.drawable.home);
		actionBar.addAction(shareAction);
		final Action otherAction = new IntentAction(this,
				search.createIntent(this), R.drawable.ic_action_search);
		actionBar.addAction(otherAction);
		// VideoView myVideoView = (VideoView)findViewById(R.id.myvideoview);
		// // myVideoView.setVideoPath(SrcPath);
		// Uri uri = Uri.parse("android.resource://" + getPackageName() +
		// "/"+R.raw.dhaka1971);
		// myVideoView.setMediaController(new MediaController(this));
		// myVideoView.requestFocus();
		// myVideoView.setVideoURI(uri);
		//
		// myVideoView.start();
	}
}
