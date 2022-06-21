
package modelos;
public class empleado extends persona{
    private float sueldo;
    private String cargo;
    private String celular;

    public empleado() {
    }

    public empleado(String cedula, String nombre, String apellido, float sueldo, String cargo, String celular) {
        super(cedula, nombre, apellido);
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.celular = celular;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCorreo(String celular) {
        this.celular = celular;
    }
    
}
