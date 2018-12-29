package com.example.android.googleform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main22Activity extends AppCompatActivity {
    TextView et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        et=(TextView) findViewById(R.id.textView2);
        Intent intent=getIntent();
        et.setText("Your mob no. is: "+intent.getStringExtra("mob")+"\n"+"Your Blood group is: "+intent.getStringExtra("blood"));
    }

}
