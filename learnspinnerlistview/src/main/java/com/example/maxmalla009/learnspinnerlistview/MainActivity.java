package com.example.maxmalla009.learnspinnerlistview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    Spinner spinDm;
    EditText editma,editten;
    Button btnNhap;
    ListView lvSp;
    ArrayList<Catalog> arraySpinner = new ArrayList<Catalog>();
    ArrayAdapter<Catalog> adapterSpinner = null;
    ArrayList<Product> arrayListview = new ArrayList<Product>();
    ArrayAdapter<Product>adapterListview = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWidgetsControl();
        fakeDataCatalog();
        addEventsForFormWidgets();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void getWidgetsControl(){
        spinDm=(Spinner) findViewById(R.id.spDanhmuc);
        editma=(EditText) findViewById(R.id.editId);
        editten=(EditText) findViewById(R.id.editName);
        btnNhap=(Button) findViewById(R.id.btnInput);
        lvSp=(ListView) findViewById(R.id.lvsanpham);

        adapterSpinner = new ArrayAdapter<Catalog>(this,android.R.layout.simple_spinner_item,arraySpinner);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinDm.setAdapter(adapterSpinner);

        adapterListview = new ArrayAdapter<Product>(this,android.R.layout.simple_list_item_1,arrayListview);
        lvSp.setAdapter(adapterListview);
    }
    private void fakeDataCatalog(){
        Catalog cat1 = new Catalog("1","SAMSUNG");
        Catalog cat2 = new Catalog("2","IPHONE");
        Catalog cat3 = new Catalog("3","IPAD");

        arraySpinner.add(cat1);
        arraySpinner.add(cat2);
        arraySpinner.add(cat3);

        adapterSpinner.notifyDataSetChanged();
    }
    private void addEventsForFormWidgets(){
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addProductForCatalog();
            }
        });
        spinDm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                loadListProductByCatalog(arraySpinner.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    private void addProductForCatalog(){
        Product p = new Product();
        p.setId(editma.getText() + "");
        p.setName(editten.getText() + "");
        Catalog c = (Catalog) spinDm.getSelectedItem();
        c.addProduct(p);
        loadListProductByCatalog(c);
    }
    private void loadListProductByCatalog(Catalog c){
        arrayListview.clear();
        arrayListview.addAll(c.getListProduct());
        adapterListview.notifyDataSetChanged();
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
