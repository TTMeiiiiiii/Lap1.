package com.example.firtsprogram;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText X,Y;
    TextView kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        X=findViewById(R.id.txtX);
        Y=findViewById(R.id.txtY);
        kq=findViewById(R.id.textView);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void nhan_click(View view) {
        int num1=Integer.parseInt(X.getText().toString());
        int num2=Integer.parseInt(Y.getText().toString());
        int kqua = num1*num2;
        kq.setText(String.valueOf(kqua));
    }
    public void chia_click(View view) {
        int num1=Integer.parseInt(X.getText().toString());
        int num2=Integer.parseInt(Y.getText().toString());
        int kqua = num1/num2;
        kq.setText(String.valueOf(kqua));
    }

    public void du_click(View view) {
        int num1=Integer.parseInt(X.getText().toString());
        int num2=Integer.parseInt(Y.getText().toString());
        int kqua = num1%num2;
        kq.setText(String.valueOf(kqua));
    }

    public void cong_click(View view) {
        int num1=Integer.parseInt(X.getText().toString());
        int num2=Integer.parseInt(Y.getText().toString());
        int kqua = num1+num2;
        kq.setText(String.valueOf(kqua));
    }


    public void tru_click(View view) {
        int num1=Integer.parseInt(X.getText().toString());
        int num2=Integer.parseInt(Y.getText().toString());
        int kqua = num1-num2;
        kq.setText(String.valueOf(kqua));
    }
}