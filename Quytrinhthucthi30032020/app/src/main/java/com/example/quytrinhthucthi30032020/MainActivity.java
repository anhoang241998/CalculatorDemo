package com.example.quytrinhthucthi30032020;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText mEditText_number1;
    EditText mEditText_number2;
    Button mButton_reset, mButton_plus, mButton_minus, mButton_multiply, mButton_divine;
    TextView mResult_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //khai báo biến
        mEditText_number1 = findViewById(R.id.edit_number1);
        mEditText_number2 = findViewById(R.id.edit_number2);
        mButton_reset = findViewById(R.id.reset_button);
        mButton_plus = findViewById(R.id.plus_button);
        mButton_divine = findViewById(R.id.divine_button);
        mButton_multiply = findViewById(R.id.multiply_button);
        mButton_minus = findViewById(R.id.minus_button);
        mResult_textView = findViewById(R.id.result_text);


        //Plus Button
        mButton_plus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String value1 = mEditText_number1.getText().toString();
                String value2 = mEditText_number2.getText().toString();
                if ((value1.isEmpty()) || (value2.isEmpty())) {
                    mResult_textView.setText("Error");
                } else {
                    int number1 = Integer.parseInt(value1);
                    int number2 = Integer.parseInt(value2);
                    int result = number1 + number2;
                    mResult_textView.setText(Integer.toString(result));
                }
            }
        });

        //Minus Button
        mButton_minus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String value1 = mEditText_number1.getText().toString();
                String value2 = mEditText_number2.getText().toString();
                if ((value1.isEmpty()) || (value2.isEmpty())) {
                    mResult_textView.setText("Error");
                } else {
                    int number1 = Integer.parseInt(value1);
                    int number2 = Integer.parseInt(value2);
                    int result = number1 - number2;
                    mResult_textView.setText(Integer.toString(result));
                }
            }
        });

        //Multiply Button
        mButton_multiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String value1 = mEditText_number1.getText().toString();
                String value2 = mEditText_number2.getText().toString();
                if ((value1.isEmpty()) || (value2.isEmpty())) {
                    mResult_textView.setText("Error");
                } else {
                    int number1 = Integer.parseInt(value1);
                    int number2 = Integer.parseInt(value2);
                    int result = number1 * number2;
                    mResult_textView.setText(Integer.toString(result));
                }
            }
        });

        //Divine Button
        mButton_divine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String value1 = mEditText_number1.getText().toString();
                String value2 = mEditText_number2.getText().toString();
                if ((value1.isEmpty()) || (value2.isEmpty())) {
                    mResult_textView.setText("Error");
                } else {
                    int number1 = Integer.parseInt(value1);
                    int number2 = Integer.parseInt(value2);
                    float result = number1 / (number2 * 1.0f);
                    mResult_textView.setText(Float.toString(result));
                }
            }
        });

        mButton_reset.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                mResult_textView.setText("");
            }
        });

    }
}
