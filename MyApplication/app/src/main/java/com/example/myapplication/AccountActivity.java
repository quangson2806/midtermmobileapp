package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }


    public void   btnChangeUsername(View view) {
        Intent changeusername = new Intent(this, ChangeUsername.class);
        startActivity(changeusername);
    }

    public void  btnChangePassword(View view) {
        Intent changepassword= new Intent(this, ChangePassword.class);
        startActivity(changepassword);
    }

    public void  btnLogout(View view) {
        Intent logout= new Intent(this, LoginActivity.class);
        startActivity(logout);
    }
}