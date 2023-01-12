package EjercicioFlyable;

public class Bird extends Animal implements Flyable{

    @Override
    public void speak(){
        System.out.println("chirp chirp");
    }

    @Override
    public void fly(){
        System.out.println("*Se va volando hacia el sur*");
    }
}
