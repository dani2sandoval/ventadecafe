public class Leche implements Ingrediente{
    public String tipo;
    public int cantidad;

    public Leche(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return tipo + " Leche";
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }

}
