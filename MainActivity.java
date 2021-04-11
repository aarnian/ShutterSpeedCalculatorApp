package com.example.shutterspeedcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleNums(View v) {

        //Aperture
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        float N;
        if (input.matches("")) {
            N = 0;
        } else {
            N = new Float(input);
        }
        Log.d("info", input);

        //Focal length
        EditText t2 = findViewById(R.id.source2);
        String input2 = t2.getText().toString();
        float f;
        if (input2.matches("")) {
            f = 0;
        } else {
            f = new Float(input2);
        }
        Log.d("info", input2);

        //Min declination
        EditText t3 = findViewById(R.id.source3);
        String input3 = t3.getText().toString();
        float d;
        if (input3.matches("")) {
            d = 0;
        } else {
            d = new Float(input3);
        }
        Log.d("info", input3);

        //Multiplier
        EditText t4 = findViewById(R.id.source4);
        String input4 = t4.getText().toString();
        float k;
        if (input4.matches("")) {
            k = 0;
        } else {
            k = new Float(input4);
        }
        Log.d("info", input4);

        //Pixel pitch
        EditText t5 = findViewById(R.id.source5);
        String input5 = t5.getText().toString();
        float p;
        if (input5.matches("")) {
            p = 0;
        } else {
            p = new Float(input5);
        }
        Log.d("info", input5);

        //Funktio
        Double a = k * ((16.9 * N + 0.1 * f + 13.7 * p) / f * Math.cos(d));
        Double rounded = Math.round(a * 10) / 10.0;
        System.out.println(a);

        //Tulos
        ((TextView) findViewById(R.id.output)).setText(rounded.toString() + " seconds");


    }

    public void clear(View v){
        EditText t = findViewById(R.id.source);
        EditText t2 = findViewById(R.id.source2);
        EditText t3 = findViewById(R.id.source3);
        EditText t4 = findViewById(R.id.source4);
        EditText t5 = findViewById(R.id.source5);

        t.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
    }


}