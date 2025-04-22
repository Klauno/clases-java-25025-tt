package techlab.clases.c7;

public class Te extends Producto implements Descontable {
    private double precioBase;

    public Te(String nombre, double precioBase) {
        super(nombre);
        this.precioBase = precioBase;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase; // Sin recargo ni descuento por ahora
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        precioBase = precioBase * (1 - porcentaje / 100);
    }
}
