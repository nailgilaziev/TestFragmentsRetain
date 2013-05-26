package com.example.retain;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LogFragment extends Fragment{
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.w(this.toString(), "onCreate");
		super.onCreate(savedInstanceState);		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		Log.w(this.toString(), "onCreateView");
		return super.onCreateView(inflater, container, savedInstanceState);
	}
	@Override
	public void onStart() {
		Log.v(this.toString(), "onStart");
		super.onStart();
	}
	@Override
	public void onResume() {
		Log.v(this.toString(), "onResume");
		super.onResume();
	}
	
	@Override
	public void onPause() {
		Log.v(this.toString(), "onPause");
		super.onPause();
	}
	
	@Override
	public void onStop() {
		Log.v(this.toString(), "onStop");
		super.onStop();
	}
	
	@Override
	public void onDestroyView() {
		Log.w(this.toString(), "onDestroyview");
		super.onDestroyView();
	}
	@Override
	public void onDestroy() {
		Log.w(this.toString(), "onDestroy");
		super.onDestroy();
	}
}
