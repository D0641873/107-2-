package com.example.checkboxes_and_etc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getselected(View view) {

        StringBuffer toppings = new
                StringBuffer().append("Toppings: ");
        if  (((CheckBox) findViewById(R.id.chocolate)).isChecked()) {
            toppings.append("Chocolate syrup ");
        }
        if  (((CheckBox) findViewById(R.id.sprinkles)).isChecked()) {
            toppings.append("Sprinkles ");
        }
        if  (((CheckBox) findViewById(R.id.nuts)).isChecked()) {
            toppings.append("Crushed nuts ");
        }
        if  (((CheckBox) findViewById(R.id.cherries)).isChecked()) {
            toppings.append("Cherries ");
        }
        if  (((CheckBox) findViewById(R.id.cookies)).isChecked()) {
            toppings.append("Orio cookies crumbles ");
        }
        Toast.makeText(MainActivity.this, toppings.toString(),
                Toast.LENGTH_SHORT).show();
    }
}



