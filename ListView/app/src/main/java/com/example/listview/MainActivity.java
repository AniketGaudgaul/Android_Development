package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[] = {"The first Element", "Second element", "Last element of the list"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        // USING BUILT IN ARRAY ADAPTER
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arr);
//        listView.setAdapter(ad);

        // CREATING OUR OWN CUSTOM ADAPTER

        AniketAdapter ad = new AniketAdapter(this,R.layout.aniket_layout, arr);
        listView.setAdapter(ad);

    }
}