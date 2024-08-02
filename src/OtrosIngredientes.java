public class OtrosIngredientes implements Ingrediente{
    public String nombre;
    public int cantidad;

    public OtrosIngredientes(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
