package com.serma.crocobisunes.timetable;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.serma.crocobisunes.timetable.MainActivity;
import com.serma.crocobisunes.timetable.R;

public class SecondPage extends AppCompatActivity {

    ImageButton dir1;
    ImageButton dir2;

    ImageButton jumping;
    ImageButton sleeping;
    ImageButton walking;

    TextView question2;

    TextView ansVar3;
    TextView ansVar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        dir2 = (ImageButton) findViewById(R.id.dir2);

        dir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondPage.this, MainActivity.class);
                startActivity(intent);

            }
        });

        jumping = (ImageButton) findViewById(R.id.jumping);

        jumping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(SecondPage.this, "Правильно!", Toast.LENGTH_SHORT).show();
                Animation animation = AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.scale);
                jumping.startAnimation(animation);
            }
        });

        sleeping = (ImageButton) findViewById(R.id.sleeping);

        sleeping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(SecondPage.this, "Неправильно!", Toast.LENGTH_SHORT).show();
                Animation animation = AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.translate);
                sleeping.startAnimation(animation);

                Animation animation1 = AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.scale);
                jumping.startAnimation(animation1);
                Toast.makeText(SecondPage.this, "Вот правильный ответ!", Toast.LENGTH_SHORT).show();
            }
        });

        walking = (ImageButton) findViewById(R.id.walking);

        walking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Toast.makeText(SecondPage.this, "Неправильно!", Toast.LENGTH_SHORT).show();
                Animation animation = AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.translate);
                walking.startAnimation(animation);

                Animation animation1 = AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.scale);
                jumping.startAnimation(animation1);
                Toast.makeText(SecondPage.this, "Вот правильный ответ!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}