public class Equipo {

    public String tipo;
    public String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void encender() {
        System.out.println("Encendiendo el equipo");
    }

    public void apagar() {
        System.out.println("Apagando el equipo");
    }

    public void reparar() {
        System.out.println("Reparando el equipo");
    }
}
