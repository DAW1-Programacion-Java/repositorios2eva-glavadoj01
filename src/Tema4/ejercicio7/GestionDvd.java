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

    private DvdCine[] pelis = {
            new DvdCine ("El hobbit. La desolación de Smaug", "Peter Jackson", "New Line Cinema. & Metro-Goldwyn-Mayer", listaActores1(), Generos.CIENCIAFICCION, "Bla...", 123),
            new DvdCine ("El Padrino", "Francis Ford Copola", "Paramount Pictures" , listaActores2(), Generos.DRAMA, "Bla...", 175),
            new DvdCine ("Titanic", "Francis Ford Copola", "Paramount Pictures. 20th Century Fox" , listaActores3(), Generos.DRAMA, "Bla...", 123),
            new DvdCine ("El Rey León", "WD", "Walt Dysney", listaActores4(), Generos.ANIMACION, "Bla...", 86),
            new DvdCine ("Los Vengadores", "--", "Marvel Studios. Walt Dysney", listaActores5(), Generos.CIENCIAFICCION, "Bla...", 114),
            new DvdCine ("Avatar", "Francis Ford Copola", "20th Century Fox", listaActores6(), Generos.CIENCIAFICCION, "Bla...", 126),
            new DvdCine ("Harry Potter. Las reliquias de la muerte", "--", "Warner Bros.", listaActores7(), Generos.CIENCIAFICCION, "Bla...", 131),
            new DvdCine ("El señor de los anillos. El retorno del rey", "Francis Ford Copola", "New Line Cinema", listaActores8(), Generos.CIENCIAFICCION, "Bla...", 175),
            new DvdCine ("Toy Story 3", "----", "Dysney/Pixar", listaActores9(), Generos.ANIMACION, "Bla...", 78),
            new DvdCine ("The Dark Knight Rises", "--", "Warner Bros.", listaActores10(), Generos.CIENCIAFICCION, "Bla...", 99)
    };

    public ArrayList<String> listaActores1() {
        ArrayList<String> listaActores1 = new ArrayList<String>();
        listaActores1.add(0,"Ian McKellen");
        listaActores1.add(1, "Martin Freeman");
        return listaActores1;
    };
    public ArrayList<String> listaActores2() {
        ArrayList<String> listaActores2 = new ArrayList<String>();
        listaActores2.add(0,"Al Pacino");
        listaActores2.add(1, "Marlon Brando");
        return listaActores2();
    };
    public ArrayList<String> listaActores3() {
        ArrayList<String> listaActores3 = new ArrayList<>();
        listaActores3.add(0,"Di Caprio");
        return listaActores3();
    };
    public ArrayList<String> listaActores4() {
        ArrayList<String> listaActores4 = new ArrayList<>();
        listaActores4.add(0,"------");
        return listaActores4();
    };
    public ArrayList<String> listaActores5() {
        ArrayList<String> listaActores5 = new ArrayList<>();
        listaActores5.add(0,"--");
        return listaActores5();
    }
    public ArrayList<String> listaActores6() {
        ArrayList<String> listaActores6 = new ArrayList<>();
        listaActores6.add(0,"--");
        return listaActores6();
    }
    public ArrayList<String> listaActores7() {
        ArrayList<String> listaActores7 = new ArrayList<>();
        listaActores7.add(0,"--");
        return listaActores7();
    }
    public ArrayList<String> listaActores8() {
        ArrayList<String> listaActores8 = new ArrayList<>();
        listaActores8.add(0,"--");
        return listaActores8();
    }
    public ArrayList<String> listaActores9() {
        ArrayList<String> listaActores9 = new ArrayList<>();
        listaActores9.add(0,"--");
        return listaActores9();
    }
    public ArrayList<String> listaActores10() {
        ArrayList<String> listaActores10 = new ArrayList<>();
        listaActores10.add(0,"--");
        return listaActores10();
    }
}
