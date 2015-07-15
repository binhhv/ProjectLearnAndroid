package com.example.maxmalla009.learneventbutton;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class StartActivity extends ActionBarActivity implements View.OnClickListener {

    Button btnOnclick;
    Button btnInline;
    Button btnActivity;
    Button btnListener;
    Button btnExplicit;
    Button btnSubclassing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btnOnclick = (Button)findViewById(R.id.btnOnclick);
        btnInline = (Button)findViewById(R.id.btnInline);
        btnActivity = (Button)findViewById(R.id.btnActivity);
        btnListener = (Button)findViewById(R.id.btnListener);
        btnExplicit = (Button)findViewById(R.id.btnExplicit);
        btnSubclassing = (Button)findViewById(R.id.btnSubclassing);

        btnOnclick.setOnClickListener(this);
        btnInline.setOnClickListener(this);
        btnActivity.setOnClickListener(this);
        btnListener.setOnClickListener(this);
        btnExplicit.setOnClickListener(this);
        btnSubclassing.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start, menu);
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

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btnOnclick:
                Intent intentOnClick = new Intent(StartActivity.this,MainActivity.class);
                startActivity(intentOnClick);
                break;
            case R.id.btnInline:
                Intent intentInline = new Intent(StartActivity.this,InlineActivity.class);
                startActivity(intentInline);
                break;
            case R.id.btnActivity:
                Intent intentActivity = new Intent(StartActivity.this,ActivityListenerActivity.class);
                startActivity(intentActivity);
                break;
            case R.id.btnListener:
                Intent intentListener = new Intent(StartActivity.this,ListenerActivity.class);
                startActivity(intentListener);
                break;
            case R.id.btnExplicit:
                Intent intentExplicit = new Intent(StartActivity.this,ExplicitActivity.class);
                startActivity(intentExplicit);
                break;
            case R.id.btnSubclassing:
                Intent intentSubclassing = new Intent(StartActivity.this,SubclassingActivity.class);
                startActivity(intentSubclassing);
                break;
            default:
                break;
        }
    }
}
