package polymorphism1;

public class MethodOverloading {

    public int sum(int x, int y){
        return (x+y);
    }

    public int sum(int x, int y, int z){
        return (x+y+z);
    }

    public static void main(String[] args) {

        MethodOverloading obj=new MethodOverloading();
        System.out.println(obj.sum(3, 6));
        System.out.println(obj.sum(3,6,7));
    }
}
