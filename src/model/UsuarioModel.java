
package model;

public class UsuarioModel {
    
    protected int identificacion;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String direccion;
    protected boolean estaReportado;

    public UsuarioModel() {
    }

    public UsuarioModel(int identificacion, String nombre, String apellido, int edad, String direccion, boolean estaReportado) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.estaReportado = estaReportado;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstaReportado() {
        return estaReportado;
    }

    public void setEstaReportado(boolean estaReportado) {
        this.estaReportado = estaReportado;
    }

    @Override
    public String toString() {
        return "UsuarioController{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", direccion=" + direccion + ", estaReportado=" + estaReportado + '}';
    }
}
