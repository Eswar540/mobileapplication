package com.eswar.pollstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar seekbar1,seekbar2,seekbar3;
    TextView tvOption1,tvOption2,tvOption3;
    TextView tvPercent1,tvPercent2,tvPercent3;
    int counter1=1,counter2=1,counter3=1;
    boolean flag1=true,flag2=true,flag3=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekbar1=findViewById(R.id.seek_bar1);
        seekbar2=findViewById(R.id.seek_bar2);
        seekbar3=findViewById(R.id.seek_bar3);
        tvOption1=findViewById(R.id.tv_option1);
        tvOption2=findViewById(R.id.tv_option2);
        tvOption3=findViewById(R.id.tv_option3);
        tvPercent1=findViewById(R.id.tv_percent1);
        tvPercent2=findViewById(R.id.tv_percent2);
        tvPercent3=findViewById(R.id.tv_percent3);

        seekbar1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        seekbar2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        seekbar3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        tvOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag1)
                {
                    counter1++;

                    flag1=false;
                    flag2=true;
                    flag3=true;
                    calculatePercentage();

                }
            }
        });
        tvOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag2)
                {

                    counter2++;

                    flag1=true;
                    flag2=false;
                    flag3=true;
                    calculatePercentage();

                }
            }
        });
        tvOption3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag3)
                {

                    counter3++;
                    flag1=true;
                    flag2=true;
                    flag3=false;
                    calculatePercentage();

                }
            }
        });
    }

    private void calculatePercentage() {
        double total=counter1+counter2+counter3;

        double percent1=(counter1/total)*100;
        double percent2=(counter2/total)*100;
        double percent3=(counter3/total)*100;

        tvPercent1.setText(String.format("%.0f%%",percent1));
        seekbar1.setProgress((int)percent1);
        tvPercent2.setText(String.format("%.0f%%",percent2));
        seekbar2.setProgress((int)percent2);
        tvPercent3.setText(String.format("%.0f%%",percent3));
        seekbar3.setProgress((int)percent3);
    }
}