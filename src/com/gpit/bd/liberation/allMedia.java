package com.gpit.bd.liberation;

//@Author: Tanjin Ahsan; Developed for GPIT

import java.io.FileInputStream;
//import java.io.FileOutputStream;

//import com.gpit.liberation.coverflow.CoverFlow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.graphics.PorterDuffXfermode;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import android.widget.Toast;

public class allMedia extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		CoverFlow coverFlow;
		coverFlow = new CoverFlow(this);

		coverFlow.setAdapter(new ImageAdapter(this));

		ImageAdapter coverImageAdapter = new ImageAdapter(this);

		coverImageAdapter.createReflectedImages();

		coverFlow.setAdapter(coverImageAdapter);

		coverFlow.setSpacing(-50);
		coverFlow.setSelection(4, true);
		coverFlow.setAnimationDuration(1000);
		// coverFlow.setBackgroundColor(Color.argb(0,0,0,0));
		coverFlow.setBackgroundColor(Color.BLACK);
		coverFlow.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView arg0, View arg1, int arg2,
					long arg3) {
				// Do something }

				if (arg2 == 0) {
					startActivityForResult(new Intent(getApplicationContext(),
							media.class), 0);
					Toast.makeText(getBaseContext(), "1971 Initiation",
							Toast.LENGTH_LONG).show();

				} else if (arg2 == 1) {
					startActivityForResult(new Intent(getApplicationContext(),
							media5.class), 0);
					Toast.makeText(getBaseContext(), "Yahya's Speech in Radio",
							Toast.LENGTH_LONG).show();
					
					
				} else if (arg2 == 2) {
					startActivityForResult(new Intent(getApplicationContext(),
							media3.class), 0);
					Toast.makeText(getBaseContext(),
							"Bangladesh - Recognized by India",
							Toast.LENGTH_LONG).show();
				} else if (arg2 == 3) {
					startActivityForResult(new Intent(getApplicationContext(),
							media4.class), 0);
					Toast.makeText(getBaseContext(), "NBC News Footage",
							Toast.LENGTH_LONG).show();
				} else if (arg2 == 4) {
					//
					startActivityForResult(new Intent(getApplicationContext(),
							media2.class), 0);
					Toast.makeText(getBaseContext(), "The War Documentary",
							Toast.LENGTH_LONG).show();
				} else if (arg2 == 5) {
					startActivityForResult(new Intent(getApplicationContext(),
							media6.class), 0);
					Toast.makeText(getBaseContext(), "Riot in Karachi",
							Toast.LENGTH_LONG).show();
				} else if (arg2 == 6) {
					startActivityForResult(new Intent(getApplicationContext(),
							media.class), 0);
					Toast.makeText(getBaseContext(), "The War Documentary",
							Toast.LENGTH_LONG).show();
				} else if (arg2 == 7) {
					startActivityForResult(new Intent(getApplicationContext(),
							media2.class), 0);
					Toast.makeText(getBaseContext(),
							"Bangladesh - Recognized by India",
							Toast.LENGTH_LONG).show();
				} else if (arg2 == 8) {
					startActivityForResult(new Intent(getApplicationContext(),
							media3.class), 0);
					Toast.makeText(getBaseContext(), "NBC News Footage",
							Toast.LENGTH_LONG).show();
				}

				// media4.java
			}
		});

		setContentView(coverFlow);

		// Use this if you want to use XML layout file
		// setContentView(R.layout.coverflow);
		// coverFlow = (CoverFlow) findViewById(R.id.coverflow);
	}

	public class ImageAdapter extends BaseAdapter {
		int mGalleryItemBackground;
		private Context mContext;

		private FileInputStream fis;

		private Integer[] mImageIds = { R.drawable.p1, R.drawable.p5,
				R.drawable.p3, R.drawable.p4, R.drawable.p2, R.drawable.p6,
				R.drawable.p1, R.drawable.p2, R.drawable.p3 };

		private ImageView[] mImages;

		public ImageAdapter(Context c) {
			mContext = c;
			mImages = new ImageView[mImageIds.length];
		}

		public boolean createReflectedImages() {
			// The gap we want between the reflection and the original image
			final int reflectionGap = 1;

			int index = 0;
			for (int imageId : mImageIds) {
				Bitmap originalImage = BitmapFactory.decodeResource(
						getResources(), imageId);
				int width = originalImage.getWidth();
				int height = originalImage.getHeight();

				// This will not scale but will flip on the Y axis
				Matrix matrix = new Matrix();
				matrix.preScale(1, -1);

				// Create a Bitmap with the flip matrix applied to it.
				// We only want the bottom half of the image
				Bitmap reflectionImage = Bitmap.createBitmap(originalImage, 0,
						height / 2, width, height / 2, matrix, false);

				// Create a new bitmap with same width but taller to fit
				// reflection
				Bitmap bitmapWithReflection = Bitmap.createBitmap(width,
						(height + height / 2), Config.ARGB_8888);

				// Create a new Canvas with the bitmap that's big enough for
				// the image plus gap plus reflection
				Canvas canvas = new Canvas(bitmapWithReflection);
				// Draw in the original image
				canvas.drawBitmap(originalImage, 0, 0, null);
				// Draw in the gap
				Paint deafaultPaint = new Paint();
				canvas.drawRect(0, height, width, height + reflectionGap,
						deafaultPaint);
				// Draw in the reflection
				canvas.drawBitmap(reflectionImage, 0, height + reflectionGap,
						null);

				// Create a shader that is a linear gradient that covers the
				// reflection
				Paint paint = new Paint();
				LinearGradient shader = new LinearGradient(0,
						originalImage.getHeight(), 0,
						bitmapWithReflection.getHeight() + reflectionGap,
						0x70ffffff, 0x00ffffff, TileMode.CLAMP);
				// Set the paint to use this shader (linear gradient)
				paint.setShader(shader);
				// Set the Transfer mode to be porter duff and destination in
				paint.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
				// Draw a rectangle using the paint with our linear gradient
				canvas.drawRect(0, height, width,
						bitmapWithReflection.getHeight() + reflectionGap, paint);

				ImageView imageView = new ImageView(mContext);
				imageView.setImageBitmap(bitmapWithReflection);
				Display display = getWindowManager().getDefaultDisplay();
				// imageView.setLayoutParams(new CoverFlow.LayoutParams(310,
				// 350));

				// Display getOrient = getWindowManager().getDefaultDisplay();
				
				//display.
				if (display.getWidth() < display.getHeight()) {
					imageView.setLayoutParams(new CoverFlow.LayoutParams(
							(display.getWidth() / 2) + display.getWidth() / 8,
							display.getHeight() / 2));
				} else {
					imageView.setLayoutParams(new CoverFlow.LayoutParams(
							(display.getWidth() / 3), (display.getHeight() / 2)
									+ display.getHeight() / 8));
				}

				imageView.setScaleType(ScaleType.MATRIX);
				// imageView.setBackgroundColor(0x00000000);
				imageView.setBackgroundColor(Color.BLACK);
				// Make sure we set anti-aliasing otherwise we get jaggies
				BitmapDrawable drawable = (BitmapDrawable) imageView
						.getDrawable();
				drawable.setAntiAlias(true);

				mImages[index++] = imageView;

			}
			return true;
		}

		public int getCount() {
			return mImageIds.length;
		}

		public Object getItem(int position) {
			return position;
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent) {

			// Use this code if you want to load from resources
			// ImageView i = new ImageView(mContext);
			// i.setImageResource(mImageIds[position]);
			// i.setLayoutParams(new CoverFlow.LayoutParams(260, 260));
			// i.setScaleType(ImageView.ScaleType.CENTER_INSIDE);

			// Make sure we set anti-aliasing otherwise we get jaggies
			// BitmapDrawable drawable = (BitmapDrawable) i.getDrawable();
			// drawable.setAntiAlias(true);
			// return i;

			return mImages[position];
		}

		/**
		 * Returns the size (0.0f to 1.0f) of the views depending on the
		 * 'offset' to the center.
		 */
		public float getScale(boolean focused, int offset) {
			/* Formula: 1 / (2 ^ offset) */
			return Math.max(0, 1.0f / (float) Math.pow(2, Math.abs(offset)));
		}

	}
}
