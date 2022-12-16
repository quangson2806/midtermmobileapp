package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

        }



    public void btnSignin(View view) {
        Intent Signin = new Intent(this, HomeActivity.class);
        startActivity(Signin);
    }

    public void btnSignup(View view) {
        Intent Signup = new Intent(this, RegisterAcitivity.class);
        startActivity(Signup);
    }

    public void ForgotPassword(View view) {
        Intent ForgotPassword = new Intent(this, ForgotPassword.class);
        startActivity(ForgotPassword);
    }

}