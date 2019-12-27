package com.classassignment.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Register extends AppCompatActivity implements View.OnClickListener {
    private EditText etRegUsername, etRegPassword, etRegCPassword;
    private ImageView ivProfilePic;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    @Override
    public void onClick(View v) {

    }

    private void Binding(){
        etRegUsername = findViewById(R.id.etRegUsername);
        etRegPassword = findViewById(R.id.etRegPassword);
        etRegCPassword = findViewById(R.id.etRegCPassword);
        ivProfilePic = findViewById(R.id.ivProfilePic);
        btnRegister = findViewById(R.id.btnRegister);
    }
}
