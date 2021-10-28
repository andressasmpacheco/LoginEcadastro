package com.example.loginecadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText entrar;
   EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrar = (EditText) findViewById(R.id.entrar);
        senha = (EditText) findViewById(R.id.senha);
    }

    public void entrar(View view) {
        if (entrar.getText().toString().equals("andressa@etec.com") && senha.getText().toString().equals("andressa")) {
            Toast.makeText(getApplicationContext(), "Carregando acesso", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(), "Acesso negado", Toast.LENGTH_SHORT).show();
        }
    }

    public void cadastro(View view) {
        Intent intent = new Intent(this,cadastro.class);
        startActivity(intent);
    }
}
