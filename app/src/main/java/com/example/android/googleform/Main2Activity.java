package com.example.android.googleform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView showMessage;
    Button act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        showMessage=(TextView) findViewById(R.id.textView);
        Intent intent=getIntent();
        showMessage.setText("Your email id is: "+intent.getStringExtra("emailid")+"\n"+"Your name is: "+intent.getStringExtra("name"));
        act=(Button) findViewById(R.id.btn2);
        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=getIntent();
                Intent intent1=new Intent(Main2Activity.this,com.example.android.googleform.Main22Activity.class);
                String mob=intent.getStringExtra("mob");
                intent1.putExtra("mob",mob);
                String blood=intent.getStringExtra("blood");
                intent1.putExtra("blood",blood);
                startActivity(intent1);
            }
        });


    }
}
