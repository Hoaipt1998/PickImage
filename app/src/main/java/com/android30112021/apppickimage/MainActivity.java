package com.android30112021.apppickimage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int counter=10;
    ImageView imageView;
    ImageButton imageButton;
    TextView textViewScore, textViewTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewInit();
        timeCountdown();
        randomImage();
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        }

    public void randomImage() {
        int[] photos={R.drawable.bo, R.drawable.bocanhcung,R.drawable.bongua,R.drawable.cho,R.drawable.chodom, R.drawable.cachep,R.drawable.chimcanhcut,R.drawable.chuonchuon,R.drawable.ech, R.drawable.heo,R.drawable.khi,R.drawable.meoden,R.drawable.meolucky, R.drawable.meotrang,R.drawable.rua,R.drawable.soi, R.drawable.soi};

        Random ran=new Random();
        int i=ran.nextInt(photos.length);
        imageView.setImageResource(photos[i]);
    }

    private void timeCountdown() {
        new CountDownTimer(10000,1000)
        {

            @Override
            public void onTick(long l) {
                textViewTimer.setText(String.valueOf(counter));
                counter--;

            }

            @Override
            public void onFinish() {
                textViewTimer.setText("Finished");

            }
        }.start();
    }

    private void viewInit() {
        imageView = findViewById(R.id.img1);
        imageButton = findViewById(R.id.btImg2);
        textViewScore = findViewById(R.id.tvScore);
        textViewTimer = findViewById(R.id.tvTimer);

    }
}