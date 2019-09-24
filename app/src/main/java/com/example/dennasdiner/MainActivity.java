package com.example.dennasdiner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listView, View itemView, int position, long id){
                        if (position == 0){
                            Intent intent = new Intent(MainActivity.this, BreakfastChoicesActivity.class);
                            startActivity(intent);
                        }
                        if (position == 1){
                            Intent intent = new Intent(MainActivity.this, LunchChoicesActivity.class);
                            startActivity(intent);
                        }
                    }
                };
        // add the listener to list view
        ListView listview = findViewById(R.id.mealChoices);
        listview.setOnItemClickListener(itemClickListener);
    }


}
