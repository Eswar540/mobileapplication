package com.eswar.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    VideoView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        v=findViewById(R.id.video);
        String path="android.resource://"+getPackageName()+"/"+R.raw.trailer;
        Uri uri=Uri.parse(path);
        v.setVideoURI(uri);
        MediaController mc=new MediaController(this);
        v.setMediaController(mc);
        mc.setAnchorView(v);
    }
}
