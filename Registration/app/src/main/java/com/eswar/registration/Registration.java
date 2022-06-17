package com.eswar.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterActivity extends AppCompatActivity {

    EditText email,p1,p2;
    Button reg,log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email=(EditText) findViewById(R.id.email);
        p1=(EditText) findViewById(R.id.p1);
        p2=(EditText) findViewById(R.id.p2);
        reg=(Button) findViewById(R.id.register);
        log=(Button) findViewById(R.id.rlogin);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass1,pass2;
                pass1=String.valueOf(p1.getText());
                pass2=String.valueOf(p2.getText());

                if(pass1.equals(pass2))
                {
                    Intent login=new Intent(RegisterActivity.this,SecondActivity.class);
                    System.out.println("Matched");
                    startActivity(login);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Password Mismatch...",Toast.LENGTH_LONG).show();
                    System.out.println("Not Matched");
                }
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(RegisterActivity.this,MainActivity.class);
                System.out.println("Login Page|RegisterActivity");
                startActivity(login);
            }
        });
    }


}