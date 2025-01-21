package ejercicio9;

public enum Funcion {
    SO ("Sistema Operativo"),
    SERVER("Servidor de Bases de Datos"),
    OFIMA("Ofimática");

    private final String name;

    Funcion(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
