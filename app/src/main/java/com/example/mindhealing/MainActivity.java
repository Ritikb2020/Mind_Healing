package com.example.mindhealing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button next_activity_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next_activity_button = findViewById(R.id.first_activity_button);

        next_activity_button.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        });
    }
}