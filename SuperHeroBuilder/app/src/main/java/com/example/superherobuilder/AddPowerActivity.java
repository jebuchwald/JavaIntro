package com.example.superherobuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class AddPowerActivity extends AppCompatActivity {

    public static final String NAME_CONFIRM = "com.example.superherobuilder.nameConfirmString";
    public static final String POWER_CONFIRM = "com.example.superherobuilder.powerConfirmString";
    public static final String STRENGTH_CONFIRM = "com.example.superherobuilder.strengthConfirmString";

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_power);

        Intent intent = getIntent();
        name = intent.getStringExtra(MainActivity.NAME_CONFIRM);

        TextView powerPrompt = findViewById(R.id.textView3);
        powerPrompt.setText("What is " + name.toString() +"\'s super power?");
    }

    public void buildHero(View view) {
        Intent intent = new Intent(this, BuildActivity.class);
        EditText power = (EditText)findViewById(R.id.editText2);
        EditText strength = (EditText)findViewById(R.id.editText3);
        intent.putExtra(NAME_CONFIRM, name);
        intent.putExtra(POWER_CONFIRM, power.getText().toString());
        intent.putExtra(STRENGTH_CONFIRM, strength.getText().toString());
        startActivity(intent);
    }
}
