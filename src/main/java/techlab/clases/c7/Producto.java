package techlab.clases.c7;

public abstract class Producto {
    protected String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularPrecioFinal();
}
