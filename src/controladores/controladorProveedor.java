
package controladores;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelos.empleado;
import modelos.proveedor;

public class controladorProveedor {
    List<proveedor> todosProveedor;
    
     public controladorProveedor() {
        todosProveedor =new ArrayList<>();
     }
     public void enlistar(String cedula, String nombre, String apellido,String calidad, String ventas, String pais){
         proveedor nuevo = new proveedor(calidad, ventas, pais, cedula, nombre, apellido);
         todosProveedor.add(nuevo);
     }
      public void eliminar(int posicion){
        todosProveedor.remove(posicion);
     }
      public DefaultTableModel mostrar(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CALIDAD");
        modelo.addColumn("Ventas");
        modelo.addColumn("PAIS");
        
        for (proveedor dato : todosProveedor){
            String[] fila=new String[3];
            fila[0]=dato.getCalidad();
            fila[1]=dato.getVentas();
            fila[2]=dato.getPais();
            
            modelo.addRow(fila);
        }
        return modelo;
    }
}
