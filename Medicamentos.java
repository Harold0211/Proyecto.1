
package proyecto;

import java.util.LinkedList;

/**
 *
 * @author Harold
 */
public class Medicamentos {
    private String nombre;
    LinkedList<String> Medicamento = new LinkedList<String>();

    public Medicamentos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   public void AgregarMedicamento(String nombre){
    Medicamento.add(getNombre());
}

    public void setMedicamento(LinkedList<String> Medicamento) {
        this.Medicamento = Medicamento;
    }

}