package com.eswar.multimedia;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button cam,ap,vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cam=findViewById(R.id.camera);
        ap=findViewById(R.id.ap);
        vp=findViewById(R.id.vp);
        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,CameraActivity.class);
                startActivity(in);
            }
        });
        ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,AudioActivity.class);
                startActivity(in);
            }
        });
        vp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,VideoActivity.class);
                startActivity(in);
            }
        });

    }
}
