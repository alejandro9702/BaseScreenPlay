package com.poli.automatizacion.models;

import org.apache.commons.lang3.RandomStringUtils;

public class Usuario {

    private String rol;
    private String nombreEmpleado;
    private String nuevoNombreUsuario;
    private String estado;
    private String nuevaContrasena;
    private String confirmarNuevaContrasena;
    private final String codigoAleatorio = RandomStringUtils.randomAlphanumeric(6);

    
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNuevoNombreUsuario() {

        return nuevoNombreUsuario;
    }

    public void setNuevoNombreUsuario(String nuevoNombreUsuario) {
        nuevoNombreUsuario = nuevoNombreUsuario + codigoAleatorio;
        this.nuevoNombreUsuario = nuevoNombreUsuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNuevaContrasena() {
        return nuevaContrasena;
    }

    public void setNuevaContrasena(String nuevaContrasena) {
        this.nuevaContrasena = nuevaContrasena;
    }

    public String getConfirmarNuevaContrasena() {
        return confirmarNuevaContrasena;
    }

    public void setConfirmarNuevaContrasena(String confirmarNuevaContrasena) {
        this.confirmarNuevaContrasena = confirmarNuevaContrasena;
    }

    public String getCodigoAleatorio() {
        return codigoAleatorio;
    }
}
