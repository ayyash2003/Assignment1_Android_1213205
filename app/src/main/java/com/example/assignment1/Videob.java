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

public class Videob extends AppCompatActivity {
    private char level ;
    VideoView videob1 ;
    VideoView videob2 ;
    VideoView videob3 ;
    VideoView videob4 ;
    VideoView videob5 ;
    VideoView videob6 ;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.videob);
        EdgeToEdge.enable(this);
        set();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainVideob), (v, insets) -> {
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
        videob1 =findViewById(R.id.videoViewb1);
        videob2 =findViewById(R.id.videoViewb2);
        videob3 =findViewById(R.id.videoViewb3);
        videob4 =findViewById(R.id.videoViewb4);
        videob5 =findViewById(R.id.videoViewb5);
        videob6 =findViewById(R.id.videoViewb6);

    }
    private void setVideo1(){
        MediaController mediaController1 =new MediaController(this);
        mediaController1.setMediaPlayer(videob1);
        videob1.setMediaController(mediaController1);
        videob1.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v1_b));

    }
    private void setVideo2(){
        MediaController mediaController2 =new MediaController(this);
        mediaController2.setMediaPlayer(videob2);
        videob2.setMediaController(mediaController2);
        videob2.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v2_b));
    }
    private void setVideo3(){
        MediaController mediaController3 =new MediaController(this);
        mediaController3.setMediaPlayer(videob3);
        videob3.setMediaController(mediaController3);
        videob3.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v3_b));
    }
    private void setVideo4(){
        MediaController mediaController4 =new MediaController(this);
        mediaController4.setMediaPlayer(videob4);
        videob4.setMediaController(mediaController4);
        videob4.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v4_b));
    }
    private void setVideo5(){
        MediaController mediaController5 =new MediaController(this);
        mediaController5.setMediaPlayer(videob5);
        videob5.setMediaController(mediaController5);
        videob5.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v5_b));
    }
    private void setVideo6(){
        MediaController mediaController6 =new MediaController(this);
        mediaController6.setMediaPlayer(videob6);
        videob6.setMediaController(mediaController6);
        videob6.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v6_b));
    }
}
