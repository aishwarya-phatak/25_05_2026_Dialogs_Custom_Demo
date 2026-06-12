package com.example.a25_05_2026_dialogs_custom_demo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

//way 2 --writing dialog class separately
public class LoginDialog extends Dialog {
    TextView welcomeTxtView;
    EditText edtUsername, edtPassword;
    Button btnOk, btnCancel;

    public LoginDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.login_diaog);
        initializeViews();
        setUpListeners();
    }

    public void initializeViews() {
        welcomeTxtView = findViewById(R.id.welcomeTxtView);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);
    }

    public void setUpListeners() {
        btnOk.setOnClickListener(new MyBtnOkClickListener());
        btnCancel.setOnClickListener(new MyBtnCancelClickListener());
    }

    class MyBtnOkClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(),
                            "Ok",
                            Toast.LENGTH_LONG)
                    .show();
            dismiss();
        }
    }

    class MyBtnCancelClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(),
                    "Cancel",
                    Toast.LENGTH_LONG).show();
            dismiss();
        }
    }
}
