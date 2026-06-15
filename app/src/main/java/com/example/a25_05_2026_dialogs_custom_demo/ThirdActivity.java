package com.example.a25_05_2026_dialogs_custom_demo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    Button btnWay3CustomDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
        btnWay3CustomDialog = findViewById(R.id.btnWay3CustomDialog);

        btnWay3CustomDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LoginDialog1 loginDialogWay3 = new LoginDialog1(ThirdActivity.this);
                        loginDialogWay3.setOnLoginDialogClickListener(new MyLoginDialogClickListener());
                        loginDialogWay3.show();
                    }
                }
        );

    }

    class MyLoginDialogClickListener implements LoginDialog1.OnLoginDialogClickListener{

        @Override
        public void onSuccess() {
            Log.e("tag","inside third activity, login successful!");
        }

        @Override
        public void onFailure() {
            Log.e("tag","inside third activity, login unsuccessful!");
        }
    }
}
