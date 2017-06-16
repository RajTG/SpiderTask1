package com.example.android.spiderapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class secondActivity extends AppCompatActivity {
    TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle passedData = getIntent().getExtras();
        txt2 = (TextView)findViewById(R.id.txt2);
        String data = passedData.getString("Itemis");
        txt2.setText(data);
    }
}
