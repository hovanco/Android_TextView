package com.example.android_text_view;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // globally
        TextView textView = (TextView) findViewById(R.id.textView);
        //in your OnCreate() method

        // Change text in Java: Hello PNV20 -> Have You Good Day
        textView.setText("Have You Good Day!");

        // Change color
        textView.setTextColor(0xFF00FF00);

        // Change color in values
        textView.setTextColor(getResources().getColor(R.color.colorRed));





    }
}
