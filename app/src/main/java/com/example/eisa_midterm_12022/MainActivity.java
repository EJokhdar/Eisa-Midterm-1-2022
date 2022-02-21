package com.example.eisa_midterm_12022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView hyena;
    MediaPlayer mpHyena;
    int playing;
    final Button act1_2 = (Button) findViewById(R.id.act1_2);
    final Button act1_3 = (Button) findViewById(R.id.act1_3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hyena = (ImageView) findViewById(R.id.imageView3);
        mpHyena = new MediaPlayer();
        mpHyena = MediaPlayer.create(this, R.raw.track1);
        playing = 0;

        act1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);
            }
        });

        act1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Activity3.class);
                startActivity(intent);
            }
        });

        hyena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpHyena=MediaPlayer.create(MainActivity.this,R.raw.track1);
                mpHyena.start();
            }
        });


    }

}