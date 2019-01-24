package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
                calculate('+');
            }
        });
        subButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('-');
            }
        });
        multButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('*');
            }
        });
        divButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('/');
            }
        });
    }

    private void calculate(char op){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);
        double firstNumVal = Double.parseDouble(firstNum.getText().toString());
        double secondNumVal = Double.parseDouble(secondNum.getText().toString());
        TextView resultNum = (TextView)findViewById(R.id.resultNum);
        Log.i("test", firstNumVal + "-" + secondNumVal);

        double res = 0;
        switch(op){
            case '+':
                res = firstNumVal + secondNumVal;
                break;
            case '-':
                res = firstNumVal - secondNumVal;
                break;
            case '*':
                res = firstNumVal * secondNumVal;
                break;
            case '/':
                res = firstNumVal / secondNumVal;
                break;
            default:
                res = 0.0;
        }
        resultNum.setText(Double.toString(res));
    }
}
