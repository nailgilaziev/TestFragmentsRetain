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
		Log.v(this.toString(), "onCreate");
		super.onCreate(savedInstanceState);		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		Log.v(this.toString(), "onCreateView");
		return super.onCreateView(inflater, container, savedInstanceState);
	}
	
	@Override
	public void onDestroyView() {
		Log.v(this.toString(), "onDestroyview");
		super.onDestroyView();
	}
	@Override
	public void onDestroy() {
		Log.v(this.toString(), "onDestroy");
		super.onDestroy();
	}
}
