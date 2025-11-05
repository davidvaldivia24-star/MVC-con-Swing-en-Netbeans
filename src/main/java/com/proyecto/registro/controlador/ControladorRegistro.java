package com.proyecto.registro.controlador;

import com.proyecto.registro.modelo.Validador;
import com.proyecto.registro.vista.VistaRegistro;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistro implements ActionListener {

    private final Validador modelo;
    private final VistaRegistro vista;

    public ControladorRegistro(Validador modelo, VistaRegistro vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Registrar eventos
        this.vista.getBtnRegistrar().addActionListener(this);
        this.vista.getBtnLimpiar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnRegistrar()) {
            registrarUsuario();
        } else if (e.getSource() == vista.getBtnLimpiar()) {
            limpiarCampos();
        }
    }

    private void registrarUsuario() {
        String usuario = vista.getTxtUsuario().getText();
        String password = new String(vista.getTxtPassword().getPassword());

        String resultado = modelo.validarUsuario(usuario, password);

        if (resultado != null) {
            vista.getLblMensaje().setForeground(Color.RED);
            vista.getLblMensaje().setText(resultado);
        } else {
            vista.getLblMensaje().setForeground(new Color(0, 128, 0)); // Verde
            vista.getLblMensaje().setText("Usuario '" + usuario + "' registrado correctamente.");
        }
    }

    private void limpiarCampos() {
        vista.getTxtUsuario().setText("");
        vista.getTxtPassword().setText("");
        vista.getLblMensaje().setText("");
    }
}
