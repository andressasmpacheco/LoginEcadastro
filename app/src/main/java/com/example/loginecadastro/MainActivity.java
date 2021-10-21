package com.example.loginecadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
      String entrar = "andressa@etec.com";
      String senha = "andressa";
      if (entrar=="andressa@etec.com" && senha=="andressa") {
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