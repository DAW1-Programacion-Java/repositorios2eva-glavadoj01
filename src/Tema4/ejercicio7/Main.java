package ejercicio7;

/*
Diseña un programa Java que trabaje con la clase DvdCine creada en el ejercicio anterior. Crea una clase (GestionDvd) que incluya como atributo un array de objetos pertenecientes a la clase DvdCine y como métodos las opciones del menú.
El menú de la aplicación sería:
Menú de opciones:
        1. Mostrar la lista de películas (Título y productora)
        2. Mostrar la película de más duración (Título y minutos)
        3. Pedir un género y mostrar el título de las pelis de ese género.
        4. Duración de la peli. Pedir título y mostrar su duración.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        boolean salir = false;
        int op;
        GestionDvd pelis = new GestionDvd();

        do {
            menu();
            System.out.println("Ingrese una opción: ");
            op = escanear.nextInt();
            switch (op) {
                case 1:
                    System.out.println(pelis.mostrarLista());
                    break;
                case 2:
                    System.out.println(pelis.mostrarMasLarga());
                    break;
                case 3:
                    System.out.println("Ingrese un género: ");
                    String generoBuscar = escanear.next().toLowerCase();
                    System.out.println(pelis.mostrarListaGenero(generoBuscar));
                    break;
                case 4:
                    System.out.println("Ingrese un titulo para ver la duración: ");
                    String titulo = escanear.nextLine();
                    System.out.println(pelis.mostrarDuracion(titulo));
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Error - Seleccionar una opción valida");
            }
        } while (!salir);
    }

    private static void menu() {
        System.out.println("""
                    1. Mostrar la lista de películas (Título y productora)
                    2. Mostrar la película de más duración (Título y minutos)
                    3. Pedir un género y mostrar el título de las pelis de ese género.
                    4. Duración de la peli. Pedir título y mostrar su duración.
                    5. SALIR
                """);
    }
}
