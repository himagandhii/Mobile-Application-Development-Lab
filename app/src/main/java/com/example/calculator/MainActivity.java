package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Number1,Number2;
    Button Add,Sub,Mul,Div,Reset;
    TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number1=findViewById(R.id.Number1);
        Number2=findViewById(R.id.Number2);
        Add=findViewById(R.id.Add);
        Sub=findViewById(R.id.Sub);
        Mul=findViewById(R.id.Mul);
        Div=findViewById(R.id.Div);
        Result=findViewById(R.id.Result);
        Reset=findViewById(R.id.Reset);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int add,b,c;
                b = Integer.parseInt(Number1.getText().toString());
                c = Integer.parseInt(Number2.getText().toString());
                add = b + c;
                Result.setText("Result= " + add);

            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sub,b,c;
                b = Integer.parseInt(Number1.getText().toString());
                c = Integer.parseInt(Number2.getText().toString());
                sub = b - c;
                Result.setText("Result= " + sub);

            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mul,b,c;
                b = Integer.parseInt(Number1.getText().toString());
                c = Integer.parseInt(Number2.getText().toString());
                mul = b * c;
                Result.setText("Result= " + mul);
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int div,b,c;
                b = Integer.parseInt(Number1.getText().toString());
                c = Integer.parseInt(Number2.getText().toString());
                div = b / c;
                Result.setText("Result= " + div);
            }
        });
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Number1.setText(null);
            Number1.dispatchDisplayHint(View.VISIBLE);
            Number2.setText(null);
            Number2.dispatchDisplayHint(View.VISIBLE);
            Result.setText("Result= ");

            }
        });
    }

}