package com.example.listviewlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkShowDownActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_show_down);
        ArrayAdapter<Drink> drinkAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, Drink.drinks);
        ListView drinkList = (ListView) findViewById(R.id.drink_list);
        drinkList.setAdapter(drinkAdapter);


        //event listener
        drinkList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int id, long l) {
                Intent viewDrink = new Intent(DrinkShowDownActivity.this,DrinkActivity.class);
                viewDrink.putExtra(DrinkActivity.EXTRA_DRINK, (int) id);
                startActivity(viewDrink);
            }
        });
    }
}