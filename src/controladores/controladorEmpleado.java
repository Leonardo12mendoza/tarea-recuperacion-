
package controladores;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelos.empleado;

public class controladorEmpleado {
    List<empleado> todosEmpleado;

    public controladorEmpleado() {
        todosEmpleado =new ArrayList<>();
    }
    
    public void enlistar(String cedula, String nombre, String apellido, float sueldo, String cargo, String celular){
        empleado nuevo=new empleado(cedula, nombre, apellido, sueldo, cargo, celular);
        todosEmpleado.add(nuevo);
    }
    public void eliminar(int posicion){
        todosEmpleado.remove(posicion);
    }
    
    public DefaultTableModel mostrar(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CEDULA");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("SUELDO");
        modelo.addColumn("CELULAR");
        
        for (empleado dato : todosEmpleado){
            String[] fila=new String[4];
            fila[0]=dato.getCedula();
            fila[1]=dato.getNombre();
            fila[2]=String.valueOf(dato.getSueldo());
            fila[3]=dato.getCelular();
            
            modelo.addRow(fila);
        }
        return modelo;
    }
}
