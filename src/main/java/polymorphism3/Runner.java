package polymorphism3;

public class Runner {

    public static void main(String[] args) {

        Corolla  car=new Corolla();
        car.speed();
        car.motor();
        System.out.println(car.multiply(3, 7));
        car.yakitTuketimi();
    }
}
