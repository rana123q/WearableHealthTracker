package com.example.rana_jabareen.wearablehealthtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView NewUser; //for sign Up
    private EditText Email;    //user email
    private EditText Password; //user password
    private Button LogIn;     //login button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NewUser=(TextView)findViewById(R.id.newuser); // sign up new user when click on newUser
        LogIn=(Button)findViewById(R.id.logIn);      // set action listener for logIn Button
        Email=(EditText)findViewById(R.id.email);
        Password=(EditText)findViewById(R.id.password);
        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent HomePage = new Intent(MainActivity.this, HomePage.class);

                startActivity(HomePage);


            }
        });

       /* NewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {  // used to go to sign up activity

            }
        });*/
    }


}