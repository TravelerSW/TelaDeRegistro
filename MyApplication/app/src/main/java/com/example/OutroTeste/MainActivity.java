package com.example.OutroTeste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onBtnClick (View view) {
        EditText edtTxtName = findViewById(R.id.edtTxtName);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);
        EditText edtTxtLastName = findViewById(R.id.edtTxtLastName);
        TextView txtNome = findViewById(R.id.txtNome);
        TextView txtEmail = findViewById(R.id.txtMail);
        TextView txtSobrenome = findViewById(R.id.txtSobrenome);
        txtNome.setText("Nome: " + edtTxtName.getText().toString());
        txtSobrenome.setText("Sobrenome: " + edtTxtLastName.getText().toString());
        txtEmail.setText("Email: " + edtTxtEmail.getText().toString());

    }
}