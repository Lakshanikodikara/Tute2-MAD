package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //get the text values from the previous activity to this activity
        Intent intent = getIntent();
        String number1 = intent.getStringExtra(FirstActivity.number1);
        String number2 = intent.getStringExtra(FirstActivity.number2);

        //assign them to the text fields in activity 2
        EditText editText1 = findViewById(R.id.editText3);
        editText1.setText(number1);
        EditText editText2 = findViewById(R.id.editText4);
        editText2.setText(number2);

        //declaring buttons
        Button btn1 = findViewById(R.id.button2);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button4);
        Button btn4 = findViewById(R.id.button5);


        //calling methods for buttons
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sub();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multi();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Div();
            }
        });
    }


    //creating methods for buttons
    public void Add() {
        //getting the text values
        EditText no1 = findViewById(R.id.editText3);
        EditText no2 = findViewById(R.id.editText4);

        TextView answer = findViewById(R.id.textView7);

        //converting to integers
        int number1 = Integer.parseInt(no1.getText().toString());
        int number2 = Integer.parseInt(no2.getText().toString());
        //calculating the answer and assing to a varible
        int Answer = number1 + number2;

        answer.setText(+ number1 + "+" + number2 + "=" + Answer);

    }

    public void Sub() {
        //getting the text values
        EditText no1 = findViewById(R.id.editText3);
        EditText no2 = findViewById(R.id.editText4);
        TextView answer = findViewById(R.id.textView7);

        //converting to integers
        int number1 = Integer.parseInt(no1.getText().toString());
        int number2 = Integer.parseInt(no2.getText().toString());
        //calculating the answer and assing to a varible
        int Answer = number1 - number2;

        answer.setText(+ number1 + "-" + number2 + "=" + Answer);

    }
    public void Multi() {
        //getting the text values
        EditText no1 = findViewById(R.id.editText3);
        EditText no2 = findViewById(R.id.editText4);

        TextView answer = findViewById(R.id.textView7);

        //converting to integers
        int number1 = Integer.parseInt(no1.getText().toString());
        int number2 = Integer.parseInt(no2.getText().toString());
        //calculating the answer and assing to a varible
        int Answer = number1 * number2;

        answer.setText(+ number1 + "*" + number2 + "=" + Answer);

    }

    public void Div() {
        //getting the text values
        EditText no1 = findViewById(R.id.editText3);
        EditText no2 = findViewById(R.id.editText4);

        TextView answer = findViewById(R.id.textView7);

        //converting to integers
        int number1 = Integer.parseInt(no1.getText().toString());
        int number2 = Integer.parseInt(no2.getText().toString());
        //calculating the answer and assing to a varible
        int Answer = number1 / number2;

        answer.setText(+ number1 + "/" + number2 + "=" + Answer);

    }


}