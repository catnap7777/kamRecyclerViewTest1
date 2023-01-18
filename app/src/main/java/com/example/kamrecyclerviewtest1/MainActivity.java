package com.example.kamrecyclerviewtest1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.kamTextView1);
        TextView textViewColor1 = findViewById(R.id.kamTextViewColors);
        Switch switch1 = findViewById(R.id.kamSwitch1);


        String intro = "This is really interesting";
        textView1.setText(intro);
        textView1.setBackgroundColor(Color.GREEN);








    }
}