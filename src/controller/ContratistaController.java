package controller;

import Crud.CrudInterface;
import model.*;
import javax.swing.JOptionPane;

public class ContratistaController extends UsuarioController implements CrudInterface {

    ContratistaModel contratista = new ContratistaModel();

    @Override
    public void crear() {
        contratista.setIdentificacion(123456);
        contratista.setNombre("Juan");
        contratista.setApellido("Badillo");
        contratista.setEdad(78);
        contratista.setCargo("Contratista");
        contratista.setDireccion("El Pozon");
        contratista.setEstaReportado(false);
    }

    @Override
    public void actualizar() {
        contratista.setIdentificacion(575757);
        contratista.setNombre("Rafael");
        contratista.setApellido("Mejia");
        contratista.setEdad(54);
        contratista.setCargo("Contratista");
        contratista.setDireccion("Las Gaviotas");
        contratista.setEstaReportado(true);
    }

    @Override
    public void eliminar() {
        contratista.setIdentificacion(0);
        contratista.setNombre("null");
        contratista.setApellido("null");
        contratista.setEdad(0);
        contratista.setCargo("null");
        contratista.setDireccion("null");
        contratista.setEstaReportado(false);
    }

    @Override
    public void consultar() {
        JOptionPane.showMessageDialog(null,
                "ID: " + contratista.getIdentificacion() + "\n"
                + "Nombre: " + contratista.getNombre() + "\n"
                + "Apellido: " + contratista.getApellido() + "\n"
                + "Edad: " + contratista.getEdad() + "\n"
                + "Cargo: " + contratista.getCargo() + "\n"
                + "Direccion: " + contratista.getDireccion() + "\n"
                + "Esta reportado: " + contratista.isEstaReportado()
        );
    }

    @Override
    public void reportar() {
        JOptionPane.showMessageDialog(null,"Estoy Reportando al Contratista X");
    }
}
