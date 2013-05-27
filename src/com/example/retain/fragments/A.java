package com.example.retain.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.retain.LogFragment;

public class A extends LogFragment {

	TextView textView;	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,		Bundle savedInstanceState) {
		Log.w(this.toString(), "onCreateView");
		textView=new TextView(getActivity());
		textView.setText("A");
		textView.setGravity(Gravity.CENTER);
		textView.setBackgroundColor(Color.GREEN);
		return textView;
	}
}

