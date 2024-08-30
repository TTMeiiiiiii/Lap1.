package com.example.chuongtrinhgoinhan;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Chucnanggoi extends AppCompatActivity {
    EditText num;
    Button btngoi,btnthoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chucnanggoi);
        btngoi=findViewById(R.id.goi1);
        btnthoat=findViewById(R.id.back);
        num=findViewById(R.id.sdt);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void goi_click(View view) {
        Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+num.getText().toString()));
        startActivity(callintent);
    }

    public void back_click(View view) {
        finish();
    }
}