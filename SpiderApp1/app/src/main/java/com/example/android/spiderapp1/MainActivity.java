package com.example.android.spiderapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.view.View;
import java.util.ArrayList;
import java.lang.String;


public class MainActivity extends AppCompatActivity {

    EditText TxtOne;
    Button btOne;
    ListView lisOne;
    ArrayList aL;
    ArrayAdapter<String> adapt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtOne = (EditText) findViewById(R.id.TxtOne);
        btOne = (Button) findViewById(R.id.btOne);
        lisOne = (ListView) findViewById(R.id.lisOne);

        aL = new ArrayList<String>();
        adapt = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,aL);
        lisOne.setAdapter(adapt);
        onBClick();
        lisOne.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                Intent itemInfo = new Intent(MainActivity.this, secondActivity.class);
                itemInfo.putExtra("Itemis", (String)lisOne.getAdapter().getItem(position ));
                startActivity(itemInfo);

            }
        });
    }

    public void onBClick(){
        btOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String InpItem = TxtOne.getText().toString();
                aL.add(InpItem);
                adapt.notifyDataSetChanged();
            }

        });
    }
}
