package com.example.listviewlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINK = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        //get Drink id EXTRA
        int drinkId = (Integer) getIntent().getExtras().get(EXTRA_DRINK);
        Drink beverage = Drink.drinks[drinkId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(beverage.getName());

        TextView description = (TextView) findViewById(R.id.desc);
        description.setText(beverage.getDescription());

        ImageView image = (ImageView) findViewById(R.id.photo);
        image.setImageResource(beverage.getImgResourceId());
        image.setContentDescription(beverage.getName());
    }
}