
package model;

public class ContratistaModel extends UsuarioModel {
    private String cargo;

    public ContratistaModel() {
    }

    public ContratistaModel(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "ContratistaModel{" + "cargo=" + cargo + '}';
    }
    
    
}
