package com.example.a25_05_2026_dialogs_custom_demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button btnWay2CustomDialog;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        btnWay2CustomDialog = findViewById(R.id.btnWay2CustomDialog);
        btnWay2CustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginDialog loginDialog1 = new LoginDialog(SecondActivity.this);
                loginDialog1.show();
            }
        });
    }
}
