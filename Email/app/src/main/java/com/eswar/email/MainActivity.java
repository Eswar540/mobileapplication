package com.eswar.email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText mEditText;
    EditText mEditTextMessage;
    EditText mEditTextSubject;
    Button send;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = (EditText) findViewById(R.id.to);
        mEditTextSubject=(EditText) findViewById(R.id.subject);
        mEditTextMessage=(EditText) findViewById(R.id.message);
        send = findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMail();

            }
        });




    }



    private void sendMail(){
        String recepients = mEditText.getText().toString();
        String[] recepientslist = recepients.split(",");
        String subject = mEditTextSubject.getText().toString();
        String message = mEditTextMessage.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(intent.EXTRA_EMAIL,recepientslist);
        intent.putExtra(intent.EXTRA_SUBJECT,subject);
        intent.putExtra(intent.EXTRA_TEXT,message);
        intent.setType("message/rfc822");
        startActivity(intent.createChooser(intent,"Choose the appropriate channel"));




    }



}