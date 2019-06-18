package com.example.superherobuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    public static final String NAME_CONFIRM = "com.example.superherobuilder.nameConfirmString";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setPower(View view) {
        Intent intent = new Intent(this, AddPowerActivity.class);
        EditText name = (EditText)findViewById(R.id.editText);
        String prompt2 = name.getText().toString();
        intent.putExtra(NAME_CONFIRM, prompt2);
        startActivity(intent);
    }

}
