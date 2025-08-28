public class Arithmetic {
    static void addition(){
        int a = 10,b = 20;
        System.out.println("add: "+(a+b));
    }
    static void subtraction(){
        int a = 40,b = 20;
        System.out.println("sub: "+(a-b));
    }
    static void multiplication(){
        int a = 25,b = 5;
        System.out.println("mul: "+(a*b));
    }
    static void division(){
        int a = 50,b = 10;
        System.out.println("div: "+(a/b));
    }

    public static void main(String[] args) {
        addition();
        subtraction();
        multiplication();
        division();
    }
}
