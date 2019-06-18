package com.example.movieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.view.View

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Movie list array
        final String[] movies = {
                "Genetics",
                "Revengers: Always Battle",
                "Novel Group",
                "The Diver"
        };

        final String[] movie1Times = {
                "11:00 AM",
                "3:00 PM",
                "7:55 PM"
        };

        final String [] movie2Times = {
                "11:00 AM",
                "2:00 PM",
                "5:00 PM",
                "7:55 PM"
        };

        final String[] movie3Times = {
                "11:00 AM",
                "1:15 PM",
                "5:45 PM"
        };

        final String[] movie4Times = {
                "3:30 PM"
        };

        final int[] movie1Prices = {8,9,10};
        final int[] movie1Prices = {11,12,13,14};
        final int[] movie1Prices = {15,16,17};
        final int[] movie1Prices = {18};

        Spinner movieSpinner = makeSpinner(R.id.movieSpinner, movies);
        String movie = movieSpinner.getSelectedItem().toString();

        movieSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {}
            public void OnItemSelected(AdapterView<?> parent, View view , int position, long id)
            String movie = parent.getItemAtPosition(position).toString();

        );
    }

    private Spinner makeSpinner(int idKey, string[] arr) {
        Spinner spinner = (Spinner)findViewById(idKey);
        ArrayAdapter<String> spinnerArrayAdapter =
                new ArrayAdapter<String> (this,
                        android.R.layout.simple_spinner_item,
                        arr);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerArrayAdapter);
        return spinner;
    }
}
