package com.ods.splash;

import com.orm.SugarRecord;

public class Usuario extends SugarRecord<Usuario> {

    private String nombre;
    private int documento;
    private String email;
    private String usuario;
    private String contraseña;

    public Usuario(){

    }

    public Usuario(String nombre, int documento, String email, String usuario, String contraseña) {
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
