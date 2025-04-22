package techlab.clases.c7;

public class Cafe extends Producto implements Descontable {
    private double precioBase;

    public Cafe(String nombre, double precioBase) {
        super(nombre);
        this.precioBase = precioBase;
    }

    @Override
    public double calcularPrecioFinal() {
        // Recargo del 10%
        return precioBase * 1.1;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        precioBase = precioBase * (1 - porcentaje / 100);
    }

    // Constructor que llama a super
    public Cafe(String nombre) {
        super(nombre);
    }
}
