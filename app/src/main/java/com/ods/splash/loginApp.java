package com.ods.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class loginApp extends AppCompatActivity {

    Button registrar,usu,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_app);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);
        registrar = findViewById(R.id.regbtn);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin-admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
                    //correcto
                    //Toast.makeText(loginApp.this, "Ingreso correcto", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(loginApp.this,Menu_act.class);
                    startActivity(i);
                    username.setText("");
                    password.setText("");
                }else{
                    Toast.makeText(loginApp.this, "Ingreso incorrecto", Toast.LENGTH_LONG).show();
                }
            }
        });
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(loginApp.this,Registrar.class);
                startActivity(i);
            }
        });
    }
}