package com.hly.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private Spinner spinner2;
    private ArrayList<String> list2;
    String arr[] = {"java", "kotlin", "android", "h5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        //创建ArrayAdapter对象
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, arr);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int postion, long id) {
               String value = arr[postion];
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        list2 = new ArrayList<>();
        list2.add("蓝天");
        list2.add("白云");
        list2.add("大海");
        list2.add("山川");
        list2.add("森林");
        list2.add("沙漠");
        ArrayAdapter<String> adapter1=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, list2);
        spinner2.setAdapter(adapter1);


    }
}
