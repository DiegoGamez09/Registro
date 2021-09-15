package com.example.registro;

import java.io.Serializable;

public class Usuario implements Serializable {
    String nombre;
    String telefono;
    String email;
    String contra;

    public Usuario(String nombre, String telefono, String email, String contra) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
