package com.example.assignment1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    private EditText edtFirst ;
    private EditText edtLast ;
    private Spinner spnAge ;
    private EditText edtEmail ;
    private EditText edtPass ;
    private RadioButton rdbMale ;
    private RadioButton rdbFemale ;
    private RadioButton rdbA ;
    private RadioButton rdbB ;
    private RadioButton rdbC ;
    private TextView txtMsgSign ;
    private String firstName ;
    private String lastName ;
    private int age ;
    private String email ;
    private String password ;
    private char gender ;
    private char level ;

   // SharedPreferences sharedpreferences;
 //   public static final String MyPREFERENCES = "MyPrefs" ;




    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sign_in);
       // sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        set();

        String[] arraySpinner = new String[] {
                "8", "9", "10", "11", "12", "13", "14","15","16","17","18","19","20","21","22"
                ,"23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnAge.setAdapter(adapter);






    }
    private void checkInstance(Bundle savedInstanceState) {
        if(savedInstanceState != null){
            email = savedInstanceState.getString("Email");
            password = savedInstanceState.getString("Password");
        }
    }
    public void onSaveInstanceState(Bundle savedInstance){
        super.onSaveInstanceState(savedInstance);
        savedInstance.putString("Email",email);
        savedInstance.putString("Password",password);
    }
    private void set(){
        edtFirst =findViewById(R.id.edtFirst);
        edtLast =findViewById(R.id.edtLast);
        spnAge=findViewById(R.id.spnAge);
        edtEmail =findViewById(R.id.edtEmail);
        edtPass=findViewById(R.id.edtPass);
        rdbMale=findViewById(R.id.rdbMale);
        rdbFemale=findViewById(R.id.rdbFemale);
        rdbA=findViewById(R.id.rdbA);
        rdbB=findViewById(R.id.rdbB);
        rdbC=findViewById(R.id.rdbC);
        txtMsgSign=findViewById(R.id.txtMsgSign);
    }
    public void onClickSignUp(View view ){
        boolean check =false ;
         check =check();
        if(check){
            Data.students.add(new Student(firstName,lastName,age,email,password,gender,level));
          //  SharedPreferences.Editor editor = sharedpreferences.edit();

            Intent intent =new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
    public  boolean check(){
        firstName=edtFirst.getText().toString() ;
        lastName=edtLast.getText().toString() ;
        age=Integer.parseInt(spnAge.getSelectedItem().toString());
        email=edtEmail.getText().toString() ;
        password=edtPass.getText().toString() ;
        gender='e';
        level='A';
        if(rdbFemale.isSelected())
            gender='F';
        else if (rdbMale.isSelected())
            gender='M';

        if(rdbA.isChecked())
            level='A';
        else if (rdbB.isChecked())
            level='B';
        else if (rdbC.isChecked())
            level='C';




        if(firstName.isEmpty()||lastName.isEmpty()|| email.isEmpty()||password.isEmpty()){
            txtMsgSign.setText("There are an empty field ");
            return false;
        }
        else{
            if(password.length()<8){
                txtMsgSign.setText("Password shold be at least 8 charachters and integers  ");
                return false;

            }
            else
                return true ;
        }
    }

}
