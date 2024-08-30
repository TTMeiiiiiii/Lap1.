package com.example.xucxac;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView dice;
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        dice = findViewById(R.id.imageView2);
        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateDice();
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void rotateDice() {
        int i= random.nextInt(5)+1;
        Animation ani = AnimationUtils.loadAnimation(this,R.anim.rotate);
        dice.startAnimation(ani);
        switch(i){
            case 1:
                dice.setImageResource(R.drawable.so1);
                break;
            case 2:
                dice.setImageResource(R.drawable.so2);
                break;
            case 3:
                dice.setImageResource(R.drawable.so3);
                break;
            case 4:
                dice.setImageResource(R.drawable.so4);
                break;
            case 5:
                dice.setImageResource(R.drawable.so5);
                break;
            case 6:
                dice.setImageResource(R.drawable.so6);
                break;
        }
    }

    public void btn_click(View view) {
        Intent myintent = new Intent(MainActivity.this,Randomm.class);
        startActivity(myintent);
    }
}