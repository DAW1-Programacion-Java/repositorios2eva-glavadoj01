package EV2_Examen2;

public class Empleado {
    private int id;
    private String nombre;

    public Empleado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "\tId= " + id +
                "\tNombre='" + nombre + "\t}";
    }
}
