package polymorphism1;

public class Runner {

    public static void main(String[] args) {

        Corolla car1=new Corolla();
        car1.speed();
        car1.motor();
        car1.yakitTuketimi();
        System.out.println(car1.multiply(12,5));
        System.out.println(car1.multiply(1,5,4));
    }
}
