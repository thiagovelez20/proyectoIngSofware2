package com.ods.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PaginaPrincipal extends AppCompatActivity {

    EditText usuario,clave;
    Button login,registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

        usuario = findViewById(R.id.txtusuario);
        clave = findViewById(R.id.txtclave);

        login = findViewById(R.id.btnlogin);
        registrar = findViewById(R.id.btnregistrar);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usu= usuario.getText().toString();
                String pass = clave.getText().toString();
                if(usu.equals("jac") && pass.equals("iudigital")){
                    Toast.makeText(getApplicationContext(), "Bienvenido a la App", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Usuario y/o contraseña errados ", Toast.LENGTH_LONG).show();
                }
                usuario.setText("");
                clave.setText("");
            }
        });

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PaginaPrincipal.this,Registrar.class);
                startActivity(i);
            }
        });

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PaginaPrincipal.this,Menu_act.class);
                startActivity(i);
            }
        });
    }

}