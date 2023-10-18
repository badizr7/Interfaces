package view;

import controller.*;
import java.awt.Component;
import javax.swing.JOptionPane;

/*
Integrantes: 
Rafael Junior Mejia Paternina
Juan Luis Badillo Morales
 */
public class Main {

    static String menu = """
                         1. CREAR CONTRATISTA
                         2. ACTUALIZAR CONTRATISTA
                         3. ELIMINAR CONTRATISTA
                         4. SALIR
                         """;

    public static void main(String[] args) {
        int mensaje = mostrarMenuOpciones(null, menu);
        seleccionarOpcion(mensaje);
    }

    static void mostrarmensaje(Component componente, Object mensaje) {
        JOptionPane.showMessageDialog(componente, mensaje);
    }

    static String ingresarDatos(Component componente, Object mensaje) {
        return JOptionPane.showInputDialog(componente, mensaje);
    }

    static int mostrarMenuOpciones(Component componente, Object mensaje) {
        do {
            String datos = ingresarDatos(componente, mensaje);
            if (datos != null) {
                mensaje = Integer.valueOf(datos);
                return (int) mensaje;
            }
        } while (JOptionPane.CLOSED_OPTION != -1);
        return -1;
    }

    static void seleccionarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> {
                ContratistaController contratista = new ContratistaController();
                contratista.crear();
                contratista.consultar();
                contratista.reportar();
            }
            case 2 -> {
                ContratistaController contratista = new ContratistaController();
                contratista.actualizar();
                contratista.consultar();
                contratista.reportar();
            }
            case 3 -> {
                ContratistaController contratista = new ContratistaController();
                contratista.eliminar();
                contratista.consultar();
                contratista.reportar();
            }
            case 4 -> {
                System.exit(0);
            }

        }

    }
}
