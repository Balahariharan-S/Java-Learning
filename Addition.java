public class Addition {
    static void add(int a, int b, int c){
        System.out.println("Addition of a,b,c : "+(a+b+c));
    }
    static void sub(int a, int b, int c){
        System.out.println("Subtraction of a,b,c : "+(a-b-c));
    }
    static void mul(int a, int b, int c){
        System.out.println("Multiplication of a,b,c : "+(a*b*c));
    }
    static void div(int a, int b, int c){
        System.out.println("Division of a,b,c : "+(a/b/c));
    }
    public static void main(String[] args) {
        add(5,10,15);
        sub(50,45,3);
        mul(10,5,10);
        div(10,5,2);
    }
}
