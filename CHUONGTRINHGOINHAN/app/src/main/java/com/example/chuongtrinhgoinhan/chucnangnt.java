package com.example.chuongtrinhgoinhan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class chucnangnt extends AppCompatActivity {
    EditText num;
    Button btnnhan,btnthoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chucnangnt);
        num = findViewById(R.id.sdt1);
        btnnhan = findViewById(R.id.nt);
        btnthoat = findViewById(R.id.thoat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void thoat_click(View view) {
        finish();
    }

    public void nt_click(View view) {
        Intent smsintent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:"+num.getText().toString()));
        startActivity(smsintent);
    }
}