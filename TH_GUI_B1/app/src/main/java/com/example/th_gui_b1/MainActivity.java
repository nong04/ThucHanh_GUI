package com.example.th_gui_b1;

import static java.lang.Math.min;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText tbA, tbB;
    TextView txtResult;
    Button btnPlus, btnMinus, btnMultiply, btnDivide, btnGDivisor, btnThoat;

    int greatestDivisor(int A, int B) {
        for (int i = min(A, B); i > 0; --i) {
            if (A % i == 0 && B % i == 0)
                return i;
        }
        return 1;
    }

    private void innitControl() {
        tbA = findViewById(R.id.tbA);
        tbB = findViewById(R.id.tbB);
        txtResult = findViewById(R.id.txtResult);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnGDivisor = findViewById(R.id.btnGDivisor);
        btnThoat = findViewById(R.id.btnThoat);
        btnPlus.setOnClickListener(view -> {
            int a = Integer.parseInt(tbA.getText().toString());
            int b = Integer.parseInt(tbB.getText().toString());
            int result = a + b;
            txtResult.setText(String.valueOf(result));
        });
        btnMinus.setOnClickListener(view -> {
            int a = Integer.parseInt(tbA.getText().toString());
            int b = Integer.parseInt(tbB.getText().toString());
            int result = a - b;
            txtResult.setText(String.valueOf(result));
        });
        btnMultiply.setOnClickListener(view -> {
            int a = Integer.parseInt(tbA.getText().toString());
            int b = Integer.parseInt(tbB.getText().toString());
            int result = a * b;
            txtResult.setText(String.valueOf(result));
        });
        btnDivide.setOnClickListener(view -> {
            int a = Integer.parseInt(tbA.getText().toString());
            int b = Integer.parseInt(tbB.getText().toString());
            int result = a / b;
            txtResult.setText(String.valueOf(result));
        });
        btnGDivisor.setOnClickListener(view -> {
            int a = Integer.parseInt(tbA.getText().toString());
            int b = Integer.parseInt(tbB.getText().toString());
            int result = greatestDivisor(a, b);
            txtResult.setText(String.valueOf(result));
        });
        btnThoat.setOnClickListener(view -> finish());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        innitControl();
    }
}