package com.eswar.calculatemyage;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText inputValue;
    Button calculate;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputValue=findViewById(R.id.editTextInput);
        calculate=findViewById(R.id.calculate);
        result=findViewById(R.id.result);
        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int years = Calendar.getInstance().get(Calendar.YEAR);
                String dobyear = inputValue.getText().toString().trim();
                int dyear = Integer.parseInt(dobyear);
                int age = years - dyear;
                if (dobyear.isEmpty()) {
                    result.setText("Please Enter Input");
                } else if (age < 0) {
                    result.setText("Enter a valid Input");
                } else {
                    result.setText(String.valueOf(age));
                }
            }
        });
    }
}