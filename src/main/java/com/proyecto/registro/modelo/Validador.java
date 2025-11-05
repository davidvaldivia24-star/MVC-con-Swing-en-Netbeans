package com.proyecto.registro.modelo;

public class Validador {

    public String validarUsuario(String usuario, String password) {
        if (usuario == null || usuario.trim().isEmpty()) {
            return "Error: El campo 'Usuario' no puede estar vacío.";
        }

        if (password == null || password.length() < 6) {
            return "Error: La contraseña debe tener al menos 6 caracteres.";
        }

        // Si todo está bien
        return null;
    }
}
