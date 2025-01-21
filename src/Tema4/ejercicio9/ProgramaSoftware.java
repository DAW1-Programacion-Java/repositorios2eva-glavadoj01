package ejercicio9;

/*
Diseña una aplicación Java que trabaje con una clase llamada Programa (Software).
Cada programa tendrá como atributos su nombre, versión,
    función (sistema operativo, servidor de bases de datos, ofimática, …),
    año de lanzamiento, empresa que lo desarrolla, tipo de licencia y precio
*/

import java.time.LocalDate;

public class ProgramaSoftware {
    private final int idPrograma;
    private String nombre;
    private String version;
    private Funcion funcion;
    private LocalDate annoLanzamiento;
    private String desarrolladora;
    private Licencia licencia;
    private double precio;
    private static int contadorProgramas = 0;

    // Constructor completo
    public ProgramaSoftware(String nombre, String version, Funcion funcion, LocalDate annoLanzamiento,
                            String desarrolladora, Licencia licencia, double precio) {
        contadorProgramas++;
        this.idPrograma = contadorProgramas;
        this.nombre = nombre;
        this.version = version;
        this.funcion = funcion;
        this.annoLanzamiento = annoLanzamiento;
        this.desarrolladora = desarrolladora;
        this.licencia = licencia;
        this.precio = precio;
    }

    // Constructor Parcial 1
    public ProgramaSoftware(String nombre, Funcion funcion, Licencia licencia, double precio) {
        contadorProgramas++;
        this.idPrograma = contadorProgramas;
        this.nombre = nombre;
        this.version = "Unknown";
        this.funcion = funcion;
        this.annoLanzamiento = LocalDate.of(1900, 1, 1);
        this.desarrolladora = "Unknown";
        this.licencia = licencia;
        this.precio = precio;
    }

    // Generador de Getter's & Setter's
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public LocalDate getAnnoLanzamiento() {
        return annoLanzamiento;
    }

    public void setAnnoLanzamiento(LocalDate annoLanzamiento) {
        this.annoLanzamiento = annoLanzamiento;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
