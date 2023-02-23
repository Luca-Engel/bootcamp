package com.github.lucaengel.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_greeting);

        String name = intent.getStringExtra("mainName");
        EditText greeting = findViewById(R.id.greetingText);

        String greetingText = "Hello " + name + "!";
        greeting.setText(greetingText);
    }

}
