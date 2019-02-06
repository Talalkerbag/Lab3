package edu.tempe.lab3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import static edu.tempe.lab3.R.id.colorSpinner;

public class ColorActivity extends AppCompatActivity {

    String colors[] = {"red", "blue", "green", "white", "gray", "cyan", "magenta", "yellow", "lightgray", "darkgray", "grey", "lightgrey"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        final Spinner colorSpinner = findViewById(R.id.colorSpinner);
        ColorAdapter adapter = new ColorAdapter(ColorActivity.this, colors);
        colorSpinner.setAdapter(adapter);

        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                view.getRootView().setBackgroundColor(Color.parseColor(adapterView.getItemAtPosition(i).toString()));
                view.setBackgroundColor(Color.WHITE);

            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });

    }


}
