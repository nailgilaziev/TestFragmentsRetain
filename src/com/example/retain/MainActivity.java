package com.example.retain;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.example.retain.fragments.A;
import com.example.retain.fragments.B;
import com.example.retain.fragments.C;
import com.example.retain.fragments.D;
import com.example.testfragmentsretain.R;

public class MainActivity extends FragmentActivity {

	private Fragment a;
	private Fragment b;
	private Fragment c;
	private Fragment d;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.w(this.toString(), "onCreate Activity");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	
		//at init state returned null
		a = getSupportFragmentManager().findFragmentById(R.id.a);			
		b = getSupportFragmentManager().findFragmentById(R.id.b);
		c = getSupportFragmentManager().findFragmentById(R.id.c);
		d = getSupportFragmentManager().findFragmentById(R.id.d);

		//if don't retained
		if (a == null) 
			a = new A();
		if (b == null) 
			b = new B();
		if (c == null) 
			c = new C();
		if (d == null) 
			d = new D();


		getSupportFragmentManager().beginTransaction()
		.replace(R.id.a, a)
		.replace(R.id.b, b)
		.replace(R.id.c, c)
		.replace(R.id.d, d)
		.commit();
		Log.i(this.toString(), "replaced");
	}
	@Override
	protected void onStart() {
		Log.w(this.toString(), "onStart Activity");
		super.onStart();
	}
	@Override
	protected void onResume() {
		Log.w(this.toString(), "onResume Activity");
		super.onResume();
	}
	@Override
	protected void onPause() {
		Log.w(this.toString(), "onPause Activity");
		super.onPause();
	}
	@Override
	protected void onStop() {
		Log.w(this.toString(), "onStop Activity");
		super.onStop();
	}

	@Override
	protected void onRestart() {
		Log.w(this.toString(), "onRestart Activity");
		super.onRestart();
	}

	@Override
	protected void onDestroy() {
		Log.w(this.toString(), "onDestroy Activity");
		super.onDestroy();
	}
}
