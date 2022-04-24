package com.example.first_multiscreen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textview = findViewById(R.id.textView);

        // Gets the intent
        Intent intent = getIntent();

        // Use the key to access the data
        String msg = intent.getStringExtra(MainActivity.EXTRA_MSG);

        textview.setText("Your msg is : "+ msg);
    }
}