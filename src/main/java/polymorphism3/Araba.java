package polymorphism3;

public class Araba {

    public void motor(){
        System.out.println("Arabalar farkli markalarda motor kullanirlar");
    }

    public void yakitTuketimi(){
        System.out.println("Arabalar motor gucu ve yakit turune gore yakit tuketirler");
    }

    public int multiply(int a, int b, int c){
        return a*b*c;
    }

    public Integer multiply(int a, int b){
        return a*b;
    }

    public Araba speed(){
        return new Araba();
    }
}
