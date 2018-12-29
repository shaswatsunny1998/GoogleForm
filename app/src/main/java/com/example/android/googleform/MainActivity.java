package com.example.android.googleform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText email, name, mob, blood;
    Button submit;
    String email1, name1, mo, blood1;

    public boolean isemail(String s) {
        if (s.equalsIgnoreCase(""))
            return false;
        else
            return true;
    }

    public boolean isname(String s) {
        if (s.equalsIgnoreCase(""))
            return false;
        else
            return true;
    }

    public boolean ismobile(String m) {
        if (m.length() == 10) {
            int c = 0;
            int i;
            for (i = 0; i < m.length(); ++i) {
                if (m.charAt(i) >= '0' && m.charAt(i) <= '9') {

                } else {
                    c = 1;
                    break;
                }
            }
            if (c == 0)
                return true;
            else
                return false;
        } else
            return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.editText10);
        name = (EditText) findViewById(R.id.editText13);
        mob = (EditText) findViewById(R.id.editText14);
        blood = (EditText) findViewById(R.id.editText15);
        submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                email1 = email.getText().toString().trim();
                name1 = name.getText().toString().trim();
                mo = mob.getText().toString().trim();
                blood1 = blood.getText().toString();
                if (isemail(email1) && isname(name1) && ismobile(mo))
                {
                    Toast.makeText(MainActivity.this, "Everything is correct", Toast.LENGTH_SHORT).show();
                }
                else
                    {
                        if (isemail(email1) != true)
                        {
                        Toast.makeText(MainActivity.this, "Email is wrong", Toast.LENGTH_SHORT).show();
                    }
                    else if (isname(name1) != true)
                    {
                        Toast.makeText(MainActivity.this, "Name is wrong", Toast.LENGTH_SHORT).show();
                    }
                    else
                        {
                        if (ismobile(mo) != true)
                        {
                            Toast.makeText(MainActivity.this, "Mobile is wrong", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                Intent intent=new Intent(MainActivity.this,com.example.android.googleform.Main2Activity.class);
                intent.putExtra("emailid",email1);
                intent.putExtra("name",name1);
                intent.putExtra("mob",mo);
                intent.putExtra("blood",blood1);
                startActivity(intent);
            }
        });
    }
}
