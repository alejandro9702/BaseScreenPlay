package com.poli.automatizacion.models;

public class Usuario {

    private String rol;
    private String nombreEmpleado;
    private String nuevoNombreUsuario;
    private String estado;
    private String nuevaContrasena;
    private String confirmarNuevaContrasena;


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


}
