package com.example.animo;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.imageView);
        Animation animo = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotation);
        img.setAnimation(animo);

       /* View v = img;
        ObjectAnimator anim = ObjectAnimator.ofFloat(v,"rotationX",0.0f,360f);
        anim.setDuration(5000);
        anim.setRepeatCount(ValueAnimator.INFINITE);
        anim.start();*/
    }
}
