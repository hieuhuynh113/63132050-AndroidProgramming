package com.example.ex5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai báo các đối tượng gắn với điều khiển tương ứng
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    void TimDieuKhien(){
        editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        editTextKQ = (EditText) findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        //Gắn bộ lắng nghe sự kiện và code xử lý cho từng nút
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Xử lý cộng ở đây
                XuLyCong();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyTru();
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyNhan();
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyChia();
            }
        });
    }

    //Xử lý cộng
    void XuLyCong(){

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        float Tong = soA + soB;

        String chuoiKQ = String.valueOf(Tong);
        editTextKQ.setText(chuoiKQ);
    }

    //Xử lý trừ
    void XuLyTru(){

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        float Hieu = soA - soB;

        String chuoiKQ = String.valueOf(Hieu);
        editTextKQ.setText(chuoiKQ);
    }

    //Xử lý nhân
    void XuLyNhan(){

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        float Tich = soA * soB;

        String chuoiKQ = String.valueOf(Tich);
        editTextKQ.setText(chuoiKQ);
    }

    //Xử lý chia
    void XuLyChia(){

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        float Thuong = soA / soB;

        String chuoiKQ = String.valueOf(Thuong);
        editTextKQ.setText(chuoiKQ);
    }
}