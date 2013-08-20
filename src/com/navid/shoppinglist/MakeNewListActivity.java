package com.navid.shoppinglist;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MakeNewListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_make_new_list);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_make_new_list, menu);
		return true;
	}

}
