package com.example.mingchun_hsu.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    protected void showToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        showToast("onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        showToast("onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();

        showToast("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        showToast("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        showToast("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        showToast("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showToast("onDestroy");
    }

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);

        showToast("onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState (Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        showToast("onRestoreInstanceState");
    }
}
