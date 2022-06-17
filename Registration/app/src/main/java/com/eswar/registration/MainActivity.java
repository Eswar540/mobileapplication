package com.eswar.registration;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String eo="abcd@gmail.com";
        String po="12345";
        EditText email=(EditText)findViewById(R.id.email);
        EditText pass=(EditText) findViewById(R.id.pass);
        Button b=(Button)findViewById(R.id.login);
        Button reg=(Button) findViewById(R.id.reg);
        TextView t=(TextView) findViewById(R.id.attempts);
        final int[] n = {3};
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Editable e=email.getText();
                Editable p=pass.getText();
                if(!String.valueOf(p).equals(po))
                {
                    n[0]--;
                    if(n[0]==0)
                    {
                        b.setVisibility(View.GONE);
                    }
                    t.setText(String.valueOf(n[0])+" More attempts left...");
                    t.setVisibility(View.VISIBLE);
                }

                else
                {
                    Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);

                }

            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regent=new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(regent);
            }
        });


    }

}