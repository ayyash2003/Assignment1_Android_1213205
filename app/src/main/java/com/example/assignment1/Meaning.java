package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Meaning extends AppCompatActivity {
    private char level ;
    private TextView txtM ;
    private TextView txtIntroduction ;
    private TextView txtlevelM;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.meaning);
        set();
        Intent intent =getIntent();
        level =intent.getCharExtra("level",'f');
        setTitle();
        setIntroduction();
        setContent();

      //  if(level =='A'){
          //  meaning.setText("@string/meaning_level_a");
      //  }
    }
    private void set(){
        txtM =findViewById(R.id.txtM);
        txtlevelM=findViewById(R.id.txtlevelM);
        txtIntroduction=findViewById(R.id.txtIntroduction);
    }
    private void setTitle(){
        if(level=='A'){
            txtlevelM.setText("Level "+ "A");
        } else if (level=='B') {
            txtlevelM.setText("Level "+"B");

        }else if(level=='C'){
            txtlevelM.setText("Level "+"C");

        }
        else {
            txtlevelM.setText("Level"+"F");
        }
    }
    private void setIntroduction(){
        if(level=='A'){
            txtIntroduction.setText(getResources().getString(R.string.explane_levela));
        }
        else if(level=='B'){
            txtIntroduction.setText(getResources().getString(R.string.explane_levelb));

        }
        else if(level =='C'){
            txtIntroduction.setText(getResources().getString(R.string.explane_levelc));

        }
    }
    private void setContent(){
        if(level=='A'){
            txtM.setText(getResources().getString(R.string.meaning_level_a));
        }
        else if(level=='B'){
            txtM.setText(getResources().getString(R.string.meaning_level_b));

        }
        else if(level =='C'){
            txtM.setText(getResources().getString(R.string.meaning_level_c));

        }
    }
}
