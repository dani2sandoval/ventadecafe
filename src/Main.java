public class Main {
    public static void main(String[] args) {

        Grano granosColombianos = new Grano("Colombiano", 100);

        Agua agua = new Agua(200);

        Leche leche = new Leche("Entera", 50);

        Cafe cafeColombiano1 = new CafeColombiano("Mediano", 25.00, granosColombianos, agua, leche, "Cafe");

        Cafe espressoItaliano1 = new EspressoItaliano("Pequeño", 20.00, granosColombianos, agua, leche, 8);

        Empleado empleado1 = new Empleado("Melvin", "Daniel", 3500.0);

        Equipo equipo1 = new Equipo("cocina", "Operando");





    }
}