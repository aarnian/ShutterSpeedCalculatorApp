package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // K voi olla esim 1-3, suurempi = enemmän motion blur
    //int k = 1;
    //Pixel pitch 1200D:ssä on 4,29µm
    //float p = (float) 4.29;



    public void handleNums(View v){

        //Aperture
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        Float N = new Float(input);
        Log.d("info", input);

        //Focal length
        EditText t2 = findViewById(R.id.source2);
        String input2 = t2.getText().toString();
        Float f = new Float(input2);
        Log.d("info", input2);

        //Min declination
        EditText t3 = findViewById(R.id.source3);
        String input3 = t3.getText().toString();
        Float d = new Float(input3);
        Log.d("info", input3);

        //Multiplier
        EditText t4 = findViewById(R.id.source4);
        String input4 = t4.getText().toString();
        Float k = new Float(input4);
        Log.d("info", input4);

        //Pixel pitch
        EditText t5 = findViewById(R.id.source5);
        String input5 = t5.getText().toString();
        Float p = new Float(input5);
        Log.d("info", input5);

        Double a = k * ((16.9 * N + 0.1 * f + 13.7 * p) / f * Math.cos(d));

        System.out.println(a);


        //Ottaa syötetyt numerot ja tekee niistä arrayn

        /*

        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        Float finput = new Float(input);
        Log.d("info", input);

        EditText t2 = findViewById(R.id.source2);
        String input2 = t2.getText().toString();
        Float finput2 = new Float(input2);
        Log.d("info", input2);

        EditText t3 = findViewById(R.id.source3);
        String input3 = t3.getText().toString();
        Float finput3 = new Float(input3);
        Log.d("info", input3);

        EditText t4 = findViewById(R.id.source4);
        String input4 = t4.getText().toString();
        Float finput4 = new Float(input4);
        Log.d("info", input4);

        EditText t5 = findViewById(R.id.source5);
        String input5 = t5.getText().toString();
        Float finput5 = new Float(input5);
        Log.d("info", input5);

        float[] nums = new float[5];
        nums[0] = finput;
        nums[1] = finput2;
        nums[2] = finput3;
        nums[3] = finput4;
        nums[4] = finput5;

        //System.out.println(Arrays.toString(nums));

        return nums;

        */
    }
}

