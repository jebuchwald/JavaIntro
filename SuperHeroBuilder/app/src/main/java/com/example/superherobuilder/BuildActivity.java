package com.example.superherobuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class BuildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build);

        Intent intent = getIntent();
        String name = intent.getStringExtra(AddPowerActivity.NAME_CONFIRM);
        String power = intent.getStringExtra(AddPowerActivity.POWER_CONFIRM);
        String strength = intent.getStringExtra(AddPowerActivity.STRENGTH_CONFIRM);

        TextView nameConfirmation = findViewById(R.id.textView4);
        TextView powerConfirmation = findViewById(R.id.textView5);
        TextView strengthConfirmation = findViewById(R.id.textView6);

        nameConfirmation.setText("NAME: " + name.toString());
        powerConfirmation.setText("POWER: " + power.toString());
        strengthConfirmation.setText("STRENGTH: " + strength.toString());

    }
}
