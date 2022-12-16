package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }

    public void btnFile(View view) {
        Intent manageFile = new Intent(this, FileActivity.class);
        startActivity(manageFile);
    }



    public void btnPhoto(View view) {
        Intent managePhoto = new Intent(this, PhotoActivity.class);
        startActivity(managePhoto);

    }




    public void btnAccount(View view) {
        Intent manageAccount = new Intent(this, AccountActivity.class);
        startActivity(manageAccount);
    }


    public void btnVideo(View view) {
        Intent manageVideo = new Intent(this, VideoActivity.class);
        startActivity(manageVideo);
    }
}