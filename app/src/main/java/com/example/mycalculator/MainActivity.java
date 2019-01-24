package com.example.mycalculator;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Register all operation buttons
        Button addButton = (Button) findViewById(R.id.addButton);
        Button subButton = (Button) findViewById(R.id.subButton);
        Button multButton = (Button) findViewById(R.id.multButton);
        Button divButton = (Button) findViewById(R.id.divButton);

        // Listener for addition
        addButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('+');
            }
        });
        // Listener for subtraction
        subButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('-');
            }
        });
        // Listener for multiplication
        multButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('*');
            }
        });
        // Listener for division
        divButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('/');
            }
        });
    }

    /**
     * Calculates the operation
     * @param op operation to execute
     */
    private void calculate(char op){
        try{
            // Register first and second number
            EditText firstNum = (EditText) findViewById(R.id.firstNum);
            EditText secondNum = (EditText) findViewById(R.id.secondNum);
            // Check if first field has an input
            if (firstNum.getText().toString().equals("")){
                Toast.makeText(this, "Please enter a number for the First Number", Toast.LENGTH_SHORT).show();
                return;
            }
            // Check if second field has an input
            if (secondNum.getText().toString().equals("")){
                Toast.makeText(this, "Please enter a number for the Second Number", Toast.LENGTH_SHORT).show();
                return;
            }
            double firstNumVal = Double.parseDouble(firstNum.getText().toString());
            double secondNumVal = Double.parseDouble(secondNum.getText().toString());

            TextView resultNum = (TextView)findViewById(R.id.resultNum);

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
            // Set result on screen
            resultNum.setText(Double.toString(res));
        }
        catch (Exception e){
            Toast.makeText(this, "An error occurred. Please try again.", Toast.LENGTH_LONG).show();
            Log.e("Error", e.toString());
        }
    }
}
