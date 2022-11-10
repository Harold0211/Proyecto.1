/**
 *
 * @author Harold
 */
package proyecto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Proyecto {

     public static void AgregarMedicamento(LinkedList<String> Medicamento, Scanner entrada) {

        System.out.println("Ingresar el nuevo medicamento");
        Medicamento.push(entrada.next());
        Medicamento.add("Jarabe para la tos");
        Medicamento.add("acetaminoféno");

    }

    public static void AgregarPaciente(LinkedList<String> Pacientes, Scanner entrada) {
        System.out.println("Ingresar el nombre del paciente");
        Pacientes.push(entrada.next());
        System.out.println("ingrese el medeicamento del paciente");
        Pacientes.push(entrada.next());

        Pacientes.add("Andres, Jarabe para la tos");
        Pacientes.add("Adrian, acetaminofén");
    }

    public static void Imprimirdatos(LinkedList<String> Medicamento) {
        System.out.println("La lista de medicamentos son:" + Medicamento);

    }

    public static void Imprimirdatos2(LinkedList<String> Pacientes) {
        System.out.println("La lista de pacientes es: " + Pacientes);
    }

    public static void EliminarMedicamento(LinkedList<String> Medicamento, Scanner entrada) {
        String nombre;
        System.out.println("Intriduce el dato a eliminar");
        nombre = entrada.next();
        if (Medicamento.contains(nombre)) {
            Medicamento.remove(nombre);
            System.out.println("El nombre:  " + nombre + "fue eliminado");

        } else {
            System.out.println("El nombre no se encuentra en la lista");
        }

    }

    public static void main(String[] ddg) {
        LinkedList<String> Pacientes = new LinkedList();
        LinkedList<String> Medicamento = new LinkedList();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Elige una opción");
            System.out.println("1- Agregar medicamento");
            System.out.println("2- Agregar un paciente");
            System.out.println("3- Eliminar medicamento");
            System.out.println("4- Imprimir los datos");
            System.out.println("5- salir");
            System.out.println("Digite una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Estas introduciendo los datos");
                    AgregarMedicamento(Medicamento, entrada);

                    break;
                case 2:
                    System.out.println("Agregar un paciente");
                    AgregarPaciente(Pacientes, entrada);
                    System.out.println("inserte el medicamento al paciente" + Medicamento);

                    break;
                case 3:
                    System.out.println("Eliminar medicamentos");
                    EliminarMedicamento(Medicamento, entrada);
                    break;
                case 4:
                    System.out.println("imprimir");
                    Imprimirdatos(Medicamento);
                    Imprimirdatos2(Pacientes);

                    break;
                case 5:
                    System.out.println("Salir");
                default:
                    System.out.println("Opcion invalida, digite una opcion mostrada en pantalla");

            }

        } while (opcion != 5);

    }

}

