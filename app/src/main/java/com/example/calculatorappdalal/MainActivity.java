package com.example.calculatorappdalal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numInput;
    String answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v){

        EditText valOne = findViewById(R.id.valueOneId);
        double val1 = Integer.parseInt(valOne.getText().toString());

        EditText valTwo = findViewById(R.id.valueTwoId);
        double val2 = Integer.parseInt(valTwo.getText().toString());

        EditText operationId = findViewById(R.id.operationTextId);
        String operation = operationId.getText().toString();

        double ans =0;

        if(operation.equals("+")){
            ans = (double)val1 + val2;
        }
        else if(operation.equals("-")){
            ans = (double)val1-val2;
        }
        else if(operation.equals("*")){
            ans = (double)val1 * val2;
        }
        else if(operation.equals("/")){
            ans = (double)val1/val2;
        }

        answer = Double.toString(ans);

        TextView answerTextId = findViewById(R.id.answerId);
        answerTextId.setText(answer);


        //once math is done, use setText() to set the text view that's meant to be the answer
        //equal to the answer after converting the answer back to a String to be displayed
    }

    public void numClicked(View v){
        if(v.getId()== R.id.button1){
            Log.i("Isha", "Selected 1");
            numInput = 1;
        }
        else if(v.getId()== R.id.button2){
            Log.i("Isha", "Selected 2");
            numInput = 2;
        }
        else if(v.getId()== R.id.button3){
            Log.i("Isha", "Selected 3");
            numInput = 3;
        }
        else if(v.getId()== R.id.button4){
            Log.i("Isha", "Selected 4");
            numInput = 4;
        }
        else if(v.getId()== R.id.button5){
            Log.i("Isha", "Selected 5");
            numInput = 5;
        }
        else if(v.getId()== R.id.button6){
            Log.i("Isha", "Selected 6");
            numInput = 6;
        }
        else if(v.getId()== R.id.button7){
            Log.i("Isha", "Selected 7");
            numInput = 7;
        }
        else if(v.getId()== R.id.button8){
            Log.i("Isha", "Selected 8");
            numInput = 8;
        }
        else if(v.getId()== R.id.button9){
            Log.i("Isha", "Selected 9");
            numInput = 9;
        }
        else if(v.getId()== R.id.button0){
            Log.i("Isha", "Selected 0");
            numInput = 0;
        }
    }


}