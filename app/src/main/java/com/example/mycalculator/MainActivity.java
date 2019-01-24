package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addButton);
        Button subButton = (Button) findViewById(R.id.subButton);
        Button multButton = (Button) findViewById(R.id.multButton);
        Button divButton = (Button) findViewById(R.id.divButton);


        addButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNum = (EditText) findViewById(R.id.firstNum);
                EditText secondNum = (EditText) findViewById(R.id.secondNum);
                double firstNumVal = Double.parseDouble(firstNum.getText().toString());
                double secondNumVal = Double.parseDouble(secondNum.getText().toString());
                Log.i("test", firstNumVal + "clicked" + secondNumVal);
            }
        });
        subButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("test", "clicked");
            }
        });
        multButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("test", "clicked");
            }
        });
        divButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("test", "clicked");
            }
        });
    }

    private double calculate(){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);
        double firstNumVal = Double.parseDouble(firstNum.getText().toString());
        double secondNumVal = Double.parseDouble(secondNum.getText().toString());
        Log.i("test", firstNumVal + "clicked" + secondNumVal);
        return 0;
    }
}
