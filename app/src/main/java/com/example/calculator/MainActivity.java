package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    Button addNumber;
    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.num1);
        number2 = findViewById(R.id.num2);
        addNumber = findViewById(R.id.add);
        results = findViewById(R.id.result);

        addNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no1 = Integer.parseInt(number1.getText().toString());
                int no2 = Integer.parseInt(number2.getText().toString());

                int sum = no1 + no2;

                results.setText(String.valueOf(sum));

            }
        });

    }
}