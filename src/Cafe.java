abstract class Cafe{

    public String nombre;
    public String tamaño;
    public double precio;
    public Grano granos;
    public Agua agua;
    public Leche leche;

    public Cafe(String nombre, String tamaño, double precio, Grano granos, Agua agua, Leche leche) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
        this.granos = granos;
        this.agua = agua;
        this.leche = leche;
    }

    public abstract void preparar();
    public abstract void servir();
}

