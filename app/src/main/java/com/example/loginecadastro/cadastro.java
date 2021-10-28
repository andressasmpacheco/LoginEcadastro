package com.example.loginecadastro;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class cadastro extends AppCompatActivity {
    EditText entrar;
    EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        entrar = (EditText) findViewById(R.id.entrar);
        senha = (EditText) findViewById(R.id.senha);


    }

    public void Finalizar(View view) {
            Toast.makeText(getBaseContext(), "Usuário cadastrado com sucesso", Toast.LENGTH_SHORT).show();
    }

}