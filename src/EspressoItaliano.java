public class EspressoItaliano extends Cafe{

    public int intensidad;

    public EspressoItaliano(String tamaño, double precio, Grano granos, Agua agua, Leche leche, int intensidad) {
        super("Espresso Italiano", tamaño, precio, granos, agua, leche);
        this.intensidad = intensidad;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + nombre + " con intensidad " + intensidad);
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo " + nombre + " en tamaño " + tamaño);
    }
}
