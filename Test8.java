public class Test8 {
    static void myMethod(int x, int y){
        System.out.println(x*y);
    }
    static void myMethod(double x, double y){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        myMethod(10,20);
        myMethod(56.0,72.0);
    }
}
