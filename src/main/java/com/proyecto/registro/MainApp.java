package com.proyecto.registro;

import com.proyecto.registro.controlador.ControladorRegistro;
import com.proyecto.registro.modelo.Validador;
import com.proyecto.registro.vista.VistaRegistro;
import javax.swing.SwingUtilities;

public class MainApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Validador modelo = new Validador();
            VistaRegistro vista = new VistaRegistro();
            new ControladorRegistro(modelo, vista);
            vista.setVisible(true);
        });
    }
}
