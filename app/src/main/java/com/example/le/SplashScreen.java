package com.example.le;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(() -> {
            Intent i = new Intent(SplashScreen.this,
                    MainActivity.class);
            startActivity(i);
            finish();
        }, 3700);

        RotateAnimation rotate = new RotateAnimation(
                0, 360,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
        );
        rotate.setDuration(1000);
        rotate.setRepeatCount(Animation.INFINITE);
        ImageView imageView = findViewById(R.id.rotateImg);
        imageView.startAnimation(rotate);
    }
}