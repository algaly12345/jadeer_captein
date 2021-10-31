package com.jadeeer.jadeeercaptinapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jadeeer.jadeeercaptinapp.HomerActivity;
import com.jadeeer.jadeeercaptinapp.R;

public class VerificationCodeActivity extends AppCompatActivity {

    Button btnVerfiy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_code);

        btnVerfiy =findViewById(R.id.btn_verify);

        btnVerfiy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VerificationCodeActivity.this, HomerActivity.class));
            }
        });
    }
}