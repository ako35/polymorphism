package polymorphism2;

public class MethodOverloading {

    public int sum(int x, int y){
        return x+y;
    }

    public int sum(int x, int y, int z){
        return x+y+z;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int multiply(int a, int b, int c){
        return a*b*c;
    }

    public void studentId(String name, int roll_no){
        System.out.println("Name: "+name+" "+" Roll-No: "+roll_no);
    }

    public void studentId(int roll_no,String name){
        System.out.println("Roll-No: "+roll_no+" "+" Name: "+name);
    }

    public static void main(String[] args) {

        MethodOverloading obj=new MethodOverloading();

        System.out.println(obj.sum(3, 6));
        System.out.println(obj.sum(3, 6, 9));

        System.out.println();

        System.out.println(obj.multiply(3, 4));
        System.out.println(obj.multiply(3,4,5));

        System.out.println();

        obj.studentId(1,"Esra");
        obj.studentId("Elif",2);
    }
}
