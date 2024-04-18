package com.example.assignment1;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.location.GnssAntennaInfo;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Level1 extends AppCompatActivity {
    private TextView txtTitle ;
    private TextView txtExplain ;
    private ListView list ;
    private TextView userName ;
    ArrayAdapter<String> adapter;
    private String user;
    private char level ;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.first);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.levelA), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        set();
        Intent intent = getIntent();

        level =intent.getCharExtra("level",'b');
        user=intent.getStringExtra("user");
        userName.setText(user);
        setTitle();
        setExplain();
        final ArrayList<String> data;
        data =new ArrayList<>();


        data.add("Meaning");
        data.add(("Grammer"));
        data.add("Lectures");
        data.add("Book");
        data.add("Contact us as Instegram");
        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                data);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Log.d(TAG,"onItemClick: name: "+data.get(position));
                    Toast.makeText(Level1.this,"You clicked on "+data.get(position),Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(Level1.this,Meaning.class);
                    intent.putExtra("level",level);

                    startActivity(intent);
                }
                else if(position==1){
                    Log.d(TAG,"onItemClick: name: "+data.get(position));
                    Toast.makeText(Level1.this,"You clicked on "+data.get(position),Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(Level1.this,Grammer.class);
                    intent.putExtra("level",level);

                    startActivity(intent);
                }
                else if(position==2){
                    Log.d(TAG,"onItemClick: name: "+data.get(position));
                    Toast.makeText(Level1.this,"You clicked on "+data.get(position),Toast.LENGTH_SHORT).show();
                    intent.putExtra("level",level);

                    startActivity(intent);
                    if(level=='A'){
                        Intent intent =new Intent(Level1.this,Video.class);
                        startActivity(intent);

                    }
                    else if(level=='B') {
                        Intent intent = new Intent(Level1.this, Videob.class);
                        startActivity(intent);

                    }
                    else if(level=='C') {
                        Intent intent = new Intent(Level1.this, Videoc.class);
                        startActivity(intent);

                    }

                }
                else if(position==3){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    setBook(intent);
                    startActivity(intent);
                }
                else if(position==4){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.instagram.com/l_english.with.yaso?igsh=MmlxcWVzMzAwMm11"));

                    startActivity(intent);
                }
            }



        });
    }
    private void set(){
        list=(ListView) findViewById(R.id.list);
        txtTitle =findViewById(R.id.txtTitle);
        txtExplain=findViewById(R.id.txtExplain);
        userName=findViewById(R.id.userName);
    }
    private void setTitle(){
        if(level=='A'){
        txtTitle.setText("Level "+ "A");
        } else if (level=='B') {
            txtTitle.setText("Level "+"B");

        }else if(level=='C'){
            txtTitle.setText("Level "+"C");

        }
        else {
            txtTitle.setText("Level"+"F");
        }
    }
    private void setExplain(){
        if(level=='A'){
            txtExplain.setText(getResources().getString(R.string.explane_levela));
        }
        else if(level=='B'){
            txtExplain.setText(getResources().getString(R.string.explane_levelb));

        }
        else if(level =='C'){
            txtExplain.setText(getResources().getString(R.string.explane_levelc));

        }
    }


    private void setBook(Intent intent){
        if(level=='A'){
            intent.setData(Uri.parse("http://eprints.unm.ac.id/14904/1/Complete%20Book-Teaching%20English%20for%20Beginning%20level.pdf"));
        }
        else if(level=='B'){
            intent.setData(Uri.parse("https://apoyanblog.wordpress.com/wp-content/uploads/2014/09/destination-b1.pdf"));

        }
        else if(level =='C'){
            intent.setData(Uri.parse("https://afaq-lc.com/wp-content/uploads/2021/12/Destination-C1-C2-Grammar-and-Vocabulary.pdf"));

        }
    }




}
