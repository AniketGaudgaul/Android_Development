package com.example.multiplication_table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private TextView aline;
    private Button generate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        aline = findViewById(R.id.aline);
        generate = findViewById(R.id.generate);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = input.getText().toString();
                int number = Integer.parseInt(s);
                aline.setText("Multiplication Table for " + number + " : ");
                for (int i = 1; i < 11; i++) {
//                    aline.setSingleLine(false);
                    aline.append("\n\t\t\t" + number + " x " + i + " = " + number*i);
                }
            }
        });




    }
}