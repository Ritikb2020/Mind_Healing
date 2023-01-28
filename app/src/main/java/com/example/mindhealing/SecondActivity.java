package com.example.mindhealing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button distracted_button,angry_button,sleepy_button,rejected_button,stressed_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        distracted_button = findViewById(R.id.distracted_button);
        angry_button = findViewById(R.id.angry_button);
        sleepy_button = findViewById(R.id.sleepy_button);
        rejected_button = findViewById(R.id.rejected_button);
        stressed_button = findViewById(R.id.stressed_button);

        distracted_button.setOnClickListener(v->{
            Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
            startActivity(intent);
        });

        angry_button.setOnClickListener(v->{
            Intent intent = new Intent(SecondActivity.this,FourthActivity.class);
            startActivity(intent);
        });

        sleepy_button.setOnClickListener(v->{
            Intent intent = new Intent(SecondActivity.this,FifthActivity.class);
            startActivity(intent);
        });

        rejected_button.setOnClickListener(v->{
            Intent intent = new Intent(SecondActivity.this,SixthActivity.class);
            startActivity(intent);
        });

        stressed_button.setOnClickListener(v->{
            Intent intent = new Intent(SecondActivity.this,SeventhActivity.class);
            startActivity(intent);
        });
    }
}