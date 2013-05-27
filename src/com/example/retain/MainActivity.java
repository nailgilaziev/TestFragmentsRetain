package com.example.retain;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
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
		FragmentManager fm = getSupportFragmentManager();
		if(savedInstanceState == null) {
			Log.i("savedInstanceState", "it is null");
		    fm.beginTransaction()
		            .replace(R.id.a, new A())
		            .replace(R.id.b, new B())
		            .replace(R.id.c, new C())
		            .replace(R.id.d, new D())
		            .commit();
		}
		else {
		    a = fm.findFragmentById(R.id.a);
		    b = fm.findFragmentById(R.id.b);
		    c = fm.findFragmentById(R.id.c);
		    d = fm.findFragmentById(R.id.d);
		}		
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
