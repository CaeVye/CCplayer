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
}
