package com.example.ex3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Gắn layout tương ứng với file này
        setContentView(R.layout.activity_main);
    }

    //Đây là bộ lắng nghe và xử lý sự kiện click lên nút Tính tổng
    public void XuLyCong(View view){
        //Tìm, tham chiếu đến điều khiển trên tệp xml, mapping sang java file
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        //Lấy dữ liệu về ở điều khiển số a
        String strA = editTextSoA.getText().toString();
        //Lấy dữ liệu về ở điều khiển số b
        String strB = editTextSoB.getText().toString();

        //Chuyển dữ liệu sang dạng số
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);

        //Tính toán theo yêu cầu
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong); //chuyển sang dạng chuỗi

        //Hiện KQ ra màn hình
        editTextKetQua.setText(strTong);
    }
}