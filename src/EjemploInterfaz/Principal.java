package EjemploInterfaz;

public class Principal {
    public static void main(String[] args) {
        Interfaz i;

        i = new ImplementacionA();
        i.metodo();

        i = new ImplementacionB();
        i.metodo();
    }
}