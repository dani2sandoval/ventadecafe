public class Grano implements Ingrediente{
    public String tipo;
    public int cantidad;

    public Grano(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "cafe";
    }

    @Override
    public int obtenerCantidad() {
        return 1;
    }
}
