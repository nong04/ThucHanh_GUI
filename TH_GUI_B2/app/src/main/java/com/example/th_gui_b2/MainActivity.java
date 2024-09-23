package com.example.th_gui_b2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText tbF, tbC;
    Button btnFToC, btnCToF, btnClear;

    private void innitControl() {
        tbF = findViewById(R.id.tbF);
        tbC = findViewById(R.id.tbC);
        btnFToC = findViewById(R.id.btnFToC);
        btnCToF = findViewById(R.id.btnCToF);
        btnClear = findViewById(R.id.btnClear);
        btnFToC.setOnClickListener(view -> {
            double f = Double.parseDouble(tbF.getText().toString());
            double result = (f - 32) * 5 / 9;
            tbC.setText(String.valueOf(result));
        });
        btnCToF.setOnClickListener(view -> {
            double c = Double.parseDouble(tbC.getText().toString());
            double result = (c * 9 / 5) + 32;
            tbF.setText(String.valueOf(result));
        });
        btnClear.setOnClickListener(view -> {
            tbC.setText("");
            tbF.setText("");
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        innitControl();
    }
}