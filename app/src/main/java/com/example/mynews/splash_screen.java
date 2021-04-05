package com.example.mynews;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mynews.R;

public class splash_screen extends AppCompatActivity {
    ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        icon = findViewById(R.id.icon);

        int splashTimeOut = 4000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash_screen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, splashTimeOut);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash_anim);
        icon.startAnimation(animation);

    }
}
