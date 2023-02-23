package com.github.lucaengel.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showGreeting(View view) {
        Intent intent = new Intent(MainActivity.this, GreetingActivity.class);
        EditText name = findViewById(R.id.mainName);
        intent.putExtra("mainName", name.getText().toString());
        MainActivity.this.startActivity(intent);
    }
}