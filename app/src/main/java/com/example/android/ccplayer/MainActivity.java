package com.example.android.ccplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openCommentEntry(View view) {
        Intent i = new Intent(this, AddComment.class);
        startActivity(i);
        //write code here
    }


    public void openPlayLibrary(View view) {
        Intent i = new Intent(this, PlayLibrary.class);
        startActivity(i);
    }


    public void openPlayStream(View view) {
        Intent i = new Intent(this, PlayStream.class);
        startActivity(i);
    }


    public void openSend(View view) {
        Intent i = new Intent(this, SendActivity.class);
        startActivity(i);
    }


    public void openDownload(View view) {
        Intent i = new Intent(this, Download.class);
        startActivity(i);
    }



}
