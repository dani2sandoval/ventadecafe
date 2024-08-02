public class CafeColombiano extends Cafe{
    public String tipoGrano;

    public CafeColombiano(String tamaño, double precio, Grano granos, Agua agua, Leche leche, String tipoGrano) {
        super("Cafe Colombiano", tamaño, precio, granos, agua, leche);
        this.tipoGrano = tipoGrano;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo");
    }
}
