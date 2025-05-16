
package admintareas;

import java.util.Scanner;

public class AdminTareas {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrganizadorNotas organizador = new OrganizadorNotas();
        Agenda agenda = new Agenda();
        ArbolMaterias arbol = new ArbolMaterias();

        int opcion;
        do {
            System.out.println("MENÚ");
            System.out.println("1. Agregar nota");
            System.out.println("2. Mostrar todas las notas");
            System.out.println("3. Calcular promedio de una materia");
            System.out.println("4. Agregar recordatorio");
            System.out.println("5. Mostrar recordatorios");
            System.out.println("6. Mostrar materias ordenadas alfabéticamente");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la materia: ");
                    String materia = scanner.nextLine();
                    System.out.print("Nota (0-5): ");
                    double valor = scanner.nextDouble();
                    System.out.print("Porcentaje que representa (0-100): ");
                    double porcentaje = scanner.nextDouble();
                    organizador.agregarNota(materia, new Nota(valor, porcentaje));
                    arbol.insertar(materia);
                    break;
                case 2:
                    organizador.mostrarNotas();
                    break;
                case 3:
                    System.out.print("Nombre de la materia: ");
                    String nombre = scanner.nextLine();
                    organizador.calcularPromedio(nombre);
                    break;
                case 4:
                    System.out.print("Escriba el recordatorio: ");
                    String texto = scanner.nextLine();
                    System.out.print("Fecha (dd/mm/yyyy): ");
                    String fecha = scanner.nextLine();
                    agenda.agregarRecordatorio(new Recordatorio(texto, fecha));
                    break;
                case 5:
                    agenda.mostrarRecordatorios();
                    break;
                case 6:
                    arbol.mostrarOrdenado();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
