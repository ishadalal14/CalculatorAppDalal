package com.example.calculatorappdalal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numInput;
    String answer;

    EditText valOne;
    EditText valTwo;
    EditText operationId;

    TextView answerTextId;

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();

        valOne = findViewById(R.id.valueOneId);
        valTwo = findViewById(R.id.valueTwoId);
        operationId = findViewById(R.id.operationTextId);
        answerTextId = findViewById(R.id.answerId);

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3= findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b0 = findViewById(R.id.button0);
    }

    public void calculate(View v){



        double val1 = Integer.parseInt(valOne.getText().toString());


        double val2 = Integer.parseInt(valTwo.getText().toString());


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

        answerTextId.setText(answer);


        //once math is done, use setText() to set the text view that's meant to be the answer
        //equal to the answer after converting the answer back to a String to be displayed
    }


    public void clearBoxes(View v){
        valOne.setText("");
        valTwo.setText("");
        operationId.setText("");
        answerTextId.setText("");

    }

    public void numClicked(View v){
        String numInput = "";
        if(v.getId()== R.id.button1){
            numInput += "1";
        }
        else if(v.getId()== R.id.button2){
            numInput += "2";
        }
        else if(v.getId()== R.id.button3){
            numInput += "3";
        }
        else if(v.getId()== R.id.button4){
            numInput += "4";
        }
        else if(v.getId()== R.id.button5){
            numInput += "5";
        }
        else if(v.getId()== R.id.button6){
            numInput += "6";
        }
        else if(v.getId()== R.id.button7){

            numInput += "7";
        }
        else if(v.getId()== R.id.button8){
            numInput += "8";
        }
        else if(v.getId()== R.id.button9){
            numInput += "9";
        }
        else if(v.getId()== R.id.button0){
            numInput += "0";
        }
    }


}