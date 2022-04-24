package com.example.first_multiscreen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText msg;

    // This is a key which is unique, avoids name conflicts
    public static final String EXTRA_MSG = "com.example.first_multiscreen_app.extra.MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openActivity(View v){
        Toast.makeText(this, "Opening Second Activity", Toast.LENGTH_SHORT).show();

        // Creating an intent
        // this --> means send intent from this activity to the MainActivity2
        Intent intent = new Intent(this, MainActivity2.class);
        msg = findViewById(R.id.msg);
        String msgtext = msg.getText().toString();

        // We can send data in the form of key value pairs
        intent.putExtra(EXTRA_MSG, msgtext);
        startActivity(intent);
    }
}