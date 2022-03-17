package com.eswar.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText password;
    TextView info;
    Button login;
    int counter=3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        password = (EditText) findViewById(R.id.password);
        info = (TextView) findViewById(R.id.attempts);
        login = (Button)findViewById(R.id.calculate);


        info.setText("No. of remaining attempts : 3");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(name.getText().toString(),password.getText().toString());
            }


        });

    }
    public void validate(String name,String password){
        if(name.equals("Admin") && password.equals("123#")){
            
            Intent intent = new Intent( MainActivity.this,SecondActivity.class);
            startActivity(intent);




        }
        else{
            counter--;
            info.setText("No of attempts remaining" + counter);
            if(counter==0){
                login.setEnabled(false);
            }

        }


    }
}