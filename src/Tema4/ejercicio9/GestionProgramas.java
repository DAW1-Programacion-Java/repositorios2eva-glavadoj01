package ejercicio9;

/*
Diseña también una clase llamada GestionProgramas que contendrá:
        - un ArrayList de 25 elementos de la clase Programa
        - métodos que sirvan para programar las funciones del siguiente menú:
Menú
1. Insertar nuevo programa (controlar elementos libres)
2. Mostrar lista de software
3. Filtrar por licencia
4. Filtrar por función
5. Eliminar el último elemento
6. Buscar programa por nombre y retornar programa
7. Salir
*/

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionProgramas {
    private ArrayList<ProgramaSoftware> listaGestion = new ArrayList<>();

    public GestionProgramas() {
        insertarDatosPrueba();
    }

    public void insertarDatosPrueba() {
        ProgramaSoftware Programa1 = new ProgramaSoftware("Windows 10", "V.5.20", Funcion.SO,
                LocalDate.of(2012,5,15),"Microsoft SA", Licencia.CCA4,115.99);
        listaGestion.add(Programa1);
        listaGestion.add(new ProgramaSoftware("Windows 11", "V.2", Funcion.SO,
                LocalDate.of(2018,12,30),"Microsoft SA", Licencia.CCA4,155.99));
        listaGestion.add(new ProgramaSoftware("Word 365", Funcion.OFIMA,Licencia.CCA4,69.99));
        // Van 3 => Hasta 25...    :_(
    }

    public void agregarProgramaEnLista(ProgramaSoftware programa) {
        listaGestion.add(programa);
    }
}
