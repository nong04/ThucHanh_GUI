package com.example.th_gui_b3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button btnTinhBMI;
    EditText editTen, editChieuCao, editCanNang;
    TextView editBMI, editChanDoan;

    public void innitControl() {
        double H=Double.parseDouble (editChieuCao.getText()+"");
        double W=Double.parseDouble (editCanNang.getText()+" ");
        double BMI=W/Math.pow(H, 2);
        String chandoan;
        if (BMI<18) {
            chandoan="Bạn gầy";
        } else if (BMI<=24.9) {
            chandoan="Bạn bình thường";
        } else if (BMI<=29.9) {
            chandoan="Bạn béo phì độ 1";
        } else if (BMI <=34.9) {
            chandoan="Bạn béo phì độ 2";
        }else {
            chandoan="Bạn béo phì độ 3";
        }
        DecimalFormat dcf=new DecimalFormat("#.0");
        editBMI.setText(dcf.format(BMI));
        editChanDoan.setText(chandoan);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTen= findViewById(R.id.editTen);
        editChieuCao= findViewById(R.id.editChieuCao);
        editCanNang= findViewById(R.id.editCanNang);
        btnTinhBMI= findViewById(R.id.btnTinhBMI);
        editBMI= findViewById(R.id.editBMI);
        editChanDoan= findViewById(R.id.editChanDoan);
        btnTinhBMI.setOnClickListener(view -> innitControl());
    }
}