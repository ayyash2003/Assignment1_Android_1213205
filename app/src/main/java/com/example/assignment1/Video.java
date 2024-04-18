package com.example.assignment1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Video extends AppCompatActivity {
    private char level ;
    VideoView video1 ;
    VideoView video2 ;
    VideoView video3 ;
    VideoView video4 ;
    VideoView video5 ;
    VideoView video6 ;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.video);
        EdgeToEdge.enable(this);
        set();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainVideo), (v, insets) -> {
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

        // video.start();
        //"android.res://"+getPackageName()+"/"+R.raw.video1
        Intent intent =getIntent();
        level =intent.getCharExtra("level",'f');

        //txtlevelM.setText(txtlevelM.getText()+" "+level);
        //  if(level =='A'){
        //  meaning.setText("@string/meaning_level_a");
        //  }
    }
    private void set(){
        video1 =findViewById(R.id.videoView1);
        video2 =findViewById(R.id.videoView2);
        video3 =findViewById(R.id.videoView3);
        video4 =findViewById(R.id.videoView4);
        video5 =findViewById(R.id.videoView5);
        video6 =findViewById(R.id.videoView6);

    }
    private void setVideo1(){
        MediaController mediaController1 =new MediaController(this);
        mediaController1.setMediaPlayer(video1);
        video1.setMediaController(mediaController1);
        video1.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v1_a));

    }
    private void setVideo2(){
        MediaController mediaController2 =new MediaController(this);
        mediaController2.setMediaPlayer(video2);
        video2.setMediaController(mediaController2);
        video2.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v2_a));
    }
    private void setVideo3(){
        MediaController mediaController3 =new MediaController(this);
        mediaController3.setMediaPlayer(video3);
        video3.setMediaController(mediaController3);
        video3.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v3_a));
    }
    private void setVideo4(){
        MediaController mediaController4 =new MediaController(this);
        mediaController4.setMediaPlayer(video4);
        video4.setMediaController(mediaController4);
        video4.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v4_a));
    }
    private void setVideo5(){
        MediaController mediaController5 =new MediaController(this);
        mediaController5.setMediaPlayer(video5);
        video5.setMediaController(mediaController5);
        video5.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v5_a));
    }
    private void setVideo6(){
        MediaController mediaController6 =new MediaController(this);
        mediaController6.setMediaPlayer(video6);
        video6.setMediaController(mediaController6);
        video6.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.v6_a));
    }

}
