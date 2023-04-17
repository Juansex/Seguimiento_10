package ui;

import model.Pais;
import model.TablaDeMedallas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TablaDeMedallas tabla = new TablaDeMedallas();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ingresar un país");
            System.out.println("2. Mostrar medallería");
            System.out.println("3. Mostrar total de medallas");
            System.out.println("4. Mostrar países");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del país: ");
                    String nombrePais = scanner.nextLine();

                    // Crear un nuevo país con el nombre ingresado
                    Pais pais = new Pais(nombrePais);

                    // Solicitar la cantidad de medallas de cada tipo
                    System.out.print("Ingrese la cantidad de medallas de oro: ");
                    int cantidadOro = scanner.nextInt();
                    System.out.print("Ingrese la cantidad de medallas de plata: ");
                    int cantidadPlata = scanner.nextInt();
                    System.out.print("Ingrese la cantidad de medallas de bronce: ");
                    int cantidadBronce = scanner.nextInt();

                    // Agregar las medallas al país
                    for (int i = 0; i < cantidadOro; i++) {
                        pais.agregarMedalla("oro");
                    }
                    for (int i = 0; i < cantidadPlata; i++) {
                        pais.agregarMedalla("plata");
                    }
                    for (int i = 0; i < cantidadBronce; i++) {
                        pais.agregarMedalla("bronce");
                    }

                    // Agregar el país a la tabla de medallas
                    tabla.agregarPais(pais);

                    System.out.println("Se ha agregado el país " + nombrePais + " a la tabla de medallas con " +
                            cantidadOro + " medallas de oro, " + cantidadPlata + " medallas de plata y " +
                            cantidadBronce + " medallas de bronce.");
                    break;
                case 2:
                    tabla.ordenarPorMedalleriaConvencional();
                    tabla.imprimir();
                    break;
                case 3:
                    tabla.ordenarPorTotalMedallas();
                    tabla.imprimir();
                    break;
                case 4:
                    tabla.ordenarAlfabeticamente();
                    tabla.imprimir();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
                    break;
            }
        }
    }
}
