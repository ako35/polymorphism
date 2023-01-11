package polymorphism1;

public class Corolla extends Toyota{

    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir...");
    }

    @Override
    public void motor() {
        System.out.println("Corolla araclar cevreci motor kullanir...");
    }

    @Override
    public void yakitTuketimi() {
        System.out.println("Corolla 5.6 lt yakit tuketir...");
    }

    @Override
    public int multiply(int a, int b, int c) {
        return super.multiply(a, b, c);
    }

    @Override
    public Integer multiply(int a, int b) {
        return super.multiply(a, b);
    }

    @Override
    public Araba speed() {
        return super.speed();
    }
}
