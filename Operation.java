public class Operation {
    static void addition(int a, int b){
        System.out.println("Addition of a and b : "+(a+b));
    }
    static void subtraction(int a, int b){
        System.out.println("Subtraction of a and b : "+(a-b));
    }
    static void multiplication(int a, int b){
        System.out.println("Multiplication of a and b : "+(a*b));
    }
    static void division(int a, int b){
        System.out.println("Division of a and b : "+(a/b));
    }

    public static void main(String[] args) {
        addition(13,12);
        subtraction(45,23);
        multiplication(13,12);
        division(66,33);
    }
}
