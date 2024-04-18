package com.example.assignment1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText edtName ;
    private EditText edtPassword ;
    private TextView txtMsg;
    SharedPreferences sharedpreferences;

    private char level ='B' ;
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String EMAIL = "EmailKey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        set();
        String email = sharedpreferences.getString(EMAIL,"");
        edtName.setText(email);

    }
    private void set(){
        edtName=findViewById(R.id.edtName);
        edtPassword=findViewById(R.id.edtPassword);
        txtMsg=findViewById(R.id.txtMsg);
    }
    public void onClickCreateAccount(View view){
        Intent intent =new Intent(this,SignUpActivity.class);
        startActivity(intent);
    }
    public void onClickLogin(View view){
        String email =edtName.getText().toString();
        String password =edtPassword.getText().toString();
        if(!email.isEmpty()&&!password.isEmpty()){
            if(Data.find(email,password)){
                String user =Data.getName(email,password);
                level =Data.getLevel(email,password);
                Intent intent =new Intent(this,Level1.class);
                intent.putExtra("level",level);
                intent
                        .putExtra("user",user);

                startActivity(intent);
            }
            else {
                txtMsg.setText("The email or password is incorrect");
            }
        }
        else {
            txtMsg.setText("There an empty field ");

        }
        SharedPreferences.Editor editor = sharedpreferences.edit();

        editor.putString(EMAIL, email);
        editor.apply();

    }
}