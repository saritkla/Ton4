package com.example.goodreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class StartGame extends AppCompatActivity {

    ImageButton readfast,rooread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(
                Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_startgame);
        readfast = (ImageButton)findViewById(R.id.fastread);
        rooread = (ImageButton)findViewById(R.id.rooread);
        readfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goqq =new Intent(StartGame.this,Login.class);
                startActivity(goqq);
            }
        });
        rooread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gokkk = new Intent(StartGame.this, RegisAc.class);
                startActivity(gokkk);
            }
        });

    }
    public void onBackPressed() {

    }

}
