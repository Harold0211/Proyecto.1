
package proyecto;

import java.util.LinkedList;

public class Pacientes {

     private String nombre;
    LinkedList<String> Pacientes = new LinkedList<String>();

    public Pacientes(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
public void AgregarPaciente(String nombre){
    Pacientes.add(getNombre());
}
    public int CantidadPacientes(){
        return Pacientes.size();
    }

    public void setPacientes(LinkedList<String> Pacientes) {
        this.Pacientes = Pacientes;
    }


    
}
