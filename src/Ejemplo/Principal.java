package Ejemplo;

public class Principal {
    public static void main(String[] args) {
        //En tiempo de compilacion se declara
        Superclase s;

        //En tiempo de ejecucion se instancia
        s = new SubclaseA();
        s.metodo();

        //En tiempo de ejecucion se instancia
        s = new SubclaseB();
        s.metodo();
    }
}