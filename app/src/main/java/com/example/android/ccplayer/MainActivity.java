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

    //Functionality for button to add a comment

    public void openCommentEntry(View view) {
        Intent i = new Intent(this, AddComment.class);
        startActivity(i);
    }

    //Functionality to play the offline library

    public void openPlayLibrary(View view) {
        Intent i = new Intent(this, PlayLibrary.class);
        startActivity(i);
    }


    //Functionality to play the online stream

    public void openPlayStream(View view) {
        Intent i = new Intent(this, PlayStream.class);
        startActivity(i);
    }

    //Functionality to send a file by e-mail

    public void openSend(View view) {
        Intent i = new Intent(this, SendActivity.class);
        startActivity(i);
    }

    //Functionality to download a streaming file to the offline library

    public void openDownload(View view) {
        Intent i = new Intent(this, Download.class);
        startActivity(i);
    }



}
