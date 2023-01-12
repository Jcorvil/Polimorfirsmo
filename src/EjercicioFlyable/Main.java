package EjercicioFlyable;

public class Main {
    public static void main(String[] args) {
        Animal a;

        a = new Lion();
        a.speak();

        a = new Bird();
        a.speak();
        //Se debe hacer casting
        ((Bird)a).fly();

    }
}