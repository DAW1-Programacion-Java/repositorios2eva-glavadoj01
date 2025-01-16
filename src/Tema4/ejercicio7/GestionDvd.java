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

public class GestionDvd {
    private ArrayList<DvdCine> listaDvd = new ArrayList<>();

    public GestionDvd() {
        
    }
}
