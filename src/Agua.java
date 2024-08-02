public class Agua implements Ingrediente{
    public int cantidad;

    public Agua(int cantidad) {
        this.cantidad = cantidad;
    }


    @Override
    public String obtenerNombre() {
        return "agua";
    }

    @Override
    public int obtenerCantidad() {
        return 0;
    }
}
