package com.eswar.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RatingBar rating;
        Button button;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rating = findViewById(R.id.rating_bar);

        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = String.valueOf(rating.getRating());
                Toast.makeText(getApplicationContext(),s+"stars",Toast.LENGTH_SHORT).show();
            }
        });





    }
}