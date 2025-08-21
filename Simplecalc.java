import java.util.Scanner;

public class Simplecalc {
    public static void main(String[] args) {
        int a = 15, b= 17;
        char operator = '-';
        double result;
        switch (operator){
            case '+':
                result = a+b;
                System.out.println(result);
                break;
            case '-':
                result = a-b;
                System.out.println(result);
                break;
            case '*':
                result = a*b;
                System.out.println(result);
                break;
            case '/':
                result = a/b;
                System.out.println(result);
                break;
            case '%':
                result = a%b;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
