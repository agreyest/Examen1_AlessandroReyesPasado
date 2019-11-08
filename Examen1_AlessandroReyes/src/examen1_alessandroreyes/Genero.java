package examen1_alessandroreyes;

public class Genero {
    private String nombre;

    public Genero() {
    }

    public Genero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
            
}
