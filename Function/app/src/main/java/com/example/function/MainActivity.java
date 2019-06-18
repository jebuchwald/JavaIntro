package com.example.function;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = (Button)findViewById(R.id.add);
        Button erase = (Button)findViewById(R.id.erase);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Finds the text view object and does something
                // with it.
                TextView message = (TextView)findViewById(R.id.message);
                EditText shape = (EditText)findViewById(R.id.shape);
                add(message,shape);
            }
        });

        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView message = (TextView)findViewById(R.id.message);
                EditText shape = (EditText)findViewById(R.id.shape);
                erase(message,shape);
            }
        });
    }

    private void add(TextView message, EditText shape) {
        String messageString = message.getText().toString();
        messageString += shape.getText().toString();
        message.setText(messageString);
    }

    private void erase(TextView message, EditText shape) {
        String messageString = message.getText().toString();
        messageString = messageString.replace(shape.getText().toString(), "");
        message.setText(messageString);
    }
}
