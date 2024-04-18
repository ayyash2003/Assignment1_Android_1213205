package com.example.assignment1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Videoc extends AppCompatActivity {
    private char level ;
    VideoView videoc1 ;
    VideoView videoc2 ;
    VideoView videoc3 ;
    VideoView videoc4 ;
    VideoView videoc5 ;
    VideoView videoc6 ;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.videoc);
        EdgeToEdge.enable(this);
        set();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainVideoc), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setVideo1();
        setVideo2();
        setVideo3();
        setVideo4();
        setVideo5();
        setVideo6();


    }
    private void set(){
        videoc1 =findViewById(R.id.videoViewc1);
        videoc2 =findViewById(R.id.videoViewc2);
        videoc3 =findViewById(R.id.videoViewc3);
        videoc4 =findViewById(R.id.videoViewc4);
        videoc5 =findViewById(R.id.videoViewc5);
        videoc6 =findViewById(R.id.videoViewc6);

    }
    private void setVideo1(){
        MediaController mediaController1 =new MediaController(this);
        mediaController1.setMediaPlayer(videoc1);
        videoc1.setMediaController(mediaController1);
        videoc1.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v1_c));

    }
    private void setVideo2(){
        MediaController mediaController2 =new MediaController(this);
        mediaController2.setMediaPlayer(videoc2);
        videoc2.setMediaController(mediaController2);
        videoc2.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v2_c));
    }
    private void setVideo3(){
        MediaController mediaController3 =new MediaController(this);
        mediaController3.setMediaPlayer(videoc3);
        videoc3.setMediaController(mediaController3);
        videoc3.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v3_c));
    }
    private void setVideo4(){
        MediaController mediaController4 =new MediaController(this);
        mediaController4.setMediaPlayer(videoc4);
        videoc4.setMediaController(mediaController4);
        videoc4.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v4_c));
    }
    private void setVideo5(){
        MediaController mediaController5 =new MediaController(this);
        mediaController5.setMediaPlayer(videoc5);
        videoc5.setMediaController(mediaController5);
        videoc5.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v5_c));
    }
    private void setVideo6(){
        MediaController mediaController6 =new MediaController(this);
        mediaController6.setMediaPlayer(videoc6);
        videoc6.setMediaController(mediaController6);
        videoc6.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v6_c));
    }
}
