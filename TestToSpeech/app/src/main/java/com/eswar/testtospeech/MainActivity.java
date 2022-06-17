package com.eswar.testtospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText etInput;
    Button btConvert;
    TextToSpeech tts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInput = findViewById(R.id.message);
        btConvert = findViewById(R.id.speak);


        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS){
                    int lang = tts.setLanguage(Locale.ENGLISH);
                }



            }
        });



        btConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = etInput.getText().toString();
                int speech = tts.speak(message,TextToSpeech.QUEUE_FLUSH,null);
            }
        });




    }
}