package com.example.maxmalla009.learneventbutton;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class InlineActivity extends ActionBarActivity {
    EditText txtNamDuong;
    TextView txtNamAm;
    Button btnChuyenDoi;
    String can,chi = "";
    String[] arrCan = new String[]{"Canh","Tân","Nhâm","Quý","Giáp","?t","Bính","?inh","M?u","K?"};
    String[] arrChi = new String[]{"Thân","D?u","Tu?t","H?i","Tí","S?u","D?n","M?o","Thìn","T?","Ng?","Mùi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inline);
        btnChuyenDoi = (Button) findViewById(R.id.btnChuyenDoi);
        txtNamDuong = (EditText)findViewById(R.id.editTextNamDuongLich);
        txtNamAm = (TextView) findViewById(R.id.txtNamAmLich);
        arrCan = new String[]{"Canh","Tân","Nhâm","Quý","Giáp","?t","Bính","?inh","M?u","K?"};
        btnChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int namduong = Integer.parseInt(txtNamDuong.getText().toString());
                txtNamAm.setText((arrCan[namduong%10])+" " +(arrChi[namduong%12])+"");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inline, menu);
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
}
