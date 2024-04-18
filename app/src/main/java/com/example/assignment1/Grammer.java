package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Grammer extends AppCompatActivity {
    private char level ;
    private Intent intent ;
    private TextView txtGrammer ;
    private TextView txtTitleG;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.grammer);
        set();
        getData();
        setTitle();
        setContent();


    }

    private void set(){
        txtGrammer =findViewById(R.id.txtGrammer);
        txtTitleG=findViewById(R.id.txtTitleG);
    }
    public void getData(){
        intent =getIntent();
        level =intent.getCharExtra("level",'f');
    }
    private void setTitle(){
        if(level=='A'){
            txtTitleG.setText("Level "+ "A");
        } else if (level=='B') {
            txtTitleG.setText("Level "+"B");

        }else if(level=='C'){
            txtTitleG.setText("Level "+"C");

        }
        else {
            txtTitleG.setText("Level"+"F");
        }
    }
    private void setContent(){
        if(level=='A'){
            txtGrammer.setText(getResources().getString(R.string.grammer_level_a));
        }
        else if(level=='B'){
            txtGrammer.setText(getResources().getString(R.string.grammer_level_b));

        }
        else if(level =='C'){
            txtGrammer.setText(getResources().getString(R.string.grammer_level_c));

        }
    }


}
