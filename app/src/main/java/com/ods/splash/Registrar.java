package com.ods.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class Registrar extends AppCompatActivity {

    EditText nombre, documento, email, usuario, contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        nombre = findViewById(R.id.txtnombre);
        documento = findViewById(R.id.txtDocumento);
        email = findViewById(R.id.txtEmail);
        usuario = findViewById(R.id.txtUsuario);
        contraseña = findViewById(R.id.txtContraseña);
    }

    public void Guardar(View view){
        String nom = nombre.getText().toString();
        int doc = Integer.parseInt( documento.getText().toString());
        String em = email.getText().toString();
        String usu = usuario.getText().toString();
        String cont = contraseña.getText().toString();

        Usuario user = new Usuario(nom,doc,em,usu,cont);
        user.save();

        nombre.setText("");
        documento.setText("");
        email.setText("");
        usuario.setText("");
        contraseña.setText("");
    }

    public void Consultar(View view){
        int doc = Integer.parseInt(documento.getText().toString());

        List<Usuario> usu = Usuario.find(Usuario.class, "documento="+doc, null);
        if(usu.size()<=0){
            Toast.makeText(getApplicationContext(), "Usuario no existe", Toast.LENGTH_LONG).show();
        }else{
            Usuario user=usu.get(0);
            nombre.setText(user.getNombre());
            email.setText(user.getEmail());
            usuario.setText(user.getUsuario());
            contraseña.setText(user.getContraseña());
        }
    }

    public void Eliminar(View view){
        int doc = Integer.parseInt(documento.getText().toString());

        List<Usuario> usu = Usuario.find(Usuario.class, "documento="+doc, null);
        Usuario user =usu.get(0);
        user.delete();
        Toast.makeText(getApplicationContext(), "Usuario eliminado ", Toast.LENGTH_LONG).show();

        nombre.setText("");
        documento.setText("");
        email.setText("");
        usuario.setText("");
        contraseña.setText("");
    }

    public void Actualizar(View view){
        int doc = Integer.parseInt(documento.getText().toString());

        List<Usuario> listar = Usuario.find(Usuario.class, "documento="+doc, null);
        if(listar.size()<=0){
            Toast.makeText(getApplicationContext(), "Usuario no existe", Toast.LENGTH_LONG).show();
        }else{
            Usuario registro = listar.get(0);
            registro.setNombre(nombre.getText().toString());
            registro.setEmail(email.getText().toString());
            registro.setUsuario(usuario.getText().toString());
            registro.setContraseña(contraseña.getText().toString());
            registro.save();
            Toast.makeText(getApplicationContext(), "Usuario no Actualizado", Toast.LENGTH_LONG).show();

            nombre.setText("");
            documento.setText("");
            email.setText("");
            usuario.setText("");
            contraseña.setText("");
        }
    }
}