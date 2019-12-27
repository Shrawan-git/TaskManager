package com.classassignment.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private EditText etLoginUsername, etLoginPassword;
    private Button btnLogin, btnLoginRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Binding();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogin:
                Intent intentLogin = new Intent(Login.this, MainActivity.class);
                startActivity(intentLogin);
                break;
            case R.id.btnLoginRegister:
                Intent intentRegister = new Intent(Login.this, Register.class);
                startActivity(intentRegister);
                break;
        }
    }

    private void Binding() {
        etLoginUsername = findViewById(R.id.etLoginUsername);
        etLoginPassword = findViewById(R.id.etLoginPassword);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

        btnLoginRegister = findViewById(R.id.btnLoginRegister);
        btnLoginRegister.setOnClickListener(this);
    }
}
