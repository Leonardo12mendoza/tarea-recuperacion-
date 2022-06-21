/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class proveedor extends persona {
    private String calidad;
    private String ventas;
    private String pais;

    public proveedor() {
    }

    public proveedor(String calidad, String ventas, String pais, String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.calidad = calidad;
        this.ventas = ventas;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setDomicilio(String pais) {
        this.pais = pais;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setProductos(String calidad) {
        this.calidad = calidad;
    }

    public String getVentas() {
        return ventas;
    }

    public void setVentas(String ventas) {
        this.ventas = ventas;
    }
    
}
