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
    String numInput;
    String answer;

    EditText equation;

    String eqn;

    TextView answerTextId;

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0, bPlus, bMinus, bTimes, bDivide, bNeg, bDec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();

        equation = findViewById(R.id.equationId);
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
        bPlus = findViewById(R.id.plusButton);
        bMinus = findViewById(R.id.minusButton);
        bTimes = findViewById(R.id.timesButton);
        bDivide = findViewById(R.id.divideButton);
        bDec = findViewById(R.id.decButton);
        bNeg = findViewById(R.id.negButton);

    }

    public void calculate(View v){
        eqn = equation.getText().toString();
        int operationNum = 0;
        String operation = "";
        if(eqn.indexOf("*") != -1){
            operation = "*";
            operationNum = eqn.indexOf("*");
            Log.i("Isha", operation);
        }
        if(eqn.indexOf("+") != -1){
            operation = "+";
            operationNum = eqn.indexOf("+");
        }
        if(eqn.indexOf("-") !=-1){
            operation = "-";
            operationNum = eqn.indexOf("-");
        }
        if(eqn.indexOf("/")!=-1){
            operation = "/";
            operationNum = eqn.indexOf("/");
        }

        String val1 = eqn.substring(0,operationNum);
        double v1 = Integer.parseInt(val1);
        String val2 = eqn.substring(operationNum);
        double v2 = Integer.parseInt(val2);

        double ans = 0;

        if(operation.equals("-")){
            ans = (double)v1-v2;
        }
        if(operation.equals("+")){
            ans = ((double)v1) + v2;
        }
        if(operation.equals("*")){
            ans = (double)v1*v2;
        }
        if(operation.equals("/")){
            ans = (double)v1/v2;
        }
        answer = Double.toString(ans);
        answerTextId.setText(answer);


        //once math is done, use setText() to set the text view that's meant to be the answer
        //equal to the answer after converting the answer back to a String to be displayed
    }


    public void clearBoxes(View v) {
        equation.setText("");
        answerTextId.setText("");
        eqn = "";
    }

    public void numClicked(View v){
        if(v.getId()== R.id.button1){
            eqn = eqn + "1";
        }
        if(v.getId()== R.id.button2){
            eqn = eqn +  "2";
        }
        if(v.getId()== R.id.button3){
            eqn = eqn +  "3";
        }
        if(v.getId()== R.id.button4){
            eqn = eqn + "4";
        }
        if(v.getId()== R.id.button5){
            eqn = eqn + "5";
        }
        if(v.getId()== R.id.button6){
            eqn = eqn + "6";
        }
        if(v.getId()== R.id.button7){
            eqn = eqn +  "7";
        }
        if(v.getId()== R.id.button8){
            eqn = eqn + "8";
        }
        if(v.getId()== R.id.button9){
            eqn = eqn +  "9";
        }
        if(v.getId()== R.id.button0){
            eqn = eqn + "0";
        }
        if(v.getId() == R.id.plusButton){
            eqn = eqn +  "+";
        }
        if(v.getId() ==R.id.minusButton){
            eqn = eqn + "-";
        }
        if(v.getId() ==R.id.timesButton){
            eqn = eqn +  "*";
        }
        if(v.getId()==R.id.divideButton){
            eqn = eqn +  "/";

        }
        if(v.getId() == R.id.decButton){
            eqn = eqn + ".";
        }

        equation.setText(eqn);


//error is that its setting a new equation every time

        Log.i("Isha", eqn);
    }






}