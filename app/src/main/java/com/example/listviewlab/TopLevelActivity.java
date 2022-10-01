package com.example.listviewlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    private ListView optionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        optionList = (ListView) findViewById(R.id.options);
        //ListView item click listener w Adapter
        optionList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                if(pos==0){
                    Intent drinkIntent = new Intent(TopLevelActivity.this,DrinkShowDownActivity.class);
                    startActivity(drinkIntent);
                }
            }
        });
    }
}
