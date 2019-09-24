package com.example.dennasdiner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LunchChoicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_choices);


        ArrayAdapter<Food> listAdapter = new ArrayAdapter<Food>(
                this, android.R.layout.simple_expandable_list_item_1, Food.lunchFoods
        );

        ListView listFoods = findViewById(R.id.lunchChoices);
        listFoods.setAdapter(listAdapter);

        // Create a listener to listen for when a Food item is clicked on

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listFoods, View itemView, int position, long id) {
                        // Pass the Food name the user cliks on to BreakfastChoicesActivity
                        Intent intent = new Intent(LunchChoicesActivity.this, LunchItemDetailActivity.class);
                        intent.putExtra(BreakfastItemDetailActivity.EXTRA_FOOD_ID, (int) id);
                        startActivity(intent);
                    }
                };
        // assign the listener to the list
        listFoods.setOnItemClickListener(itemClickListener);
    }
}
