package com.example.loginecadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void Finalizar(View view) {
        String entrar = "andressa@etec.com";
        String senha = "andressa";
        if(entrar!="andressa@etec.com" && senha!="andressa") {
            Toast.makeText(getApplicationContext(), "Usuário já cadastrado", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(), "Usuário cadastrado com sucesso", Toast.LENGTH_SHORT).show();
        }
    }
}