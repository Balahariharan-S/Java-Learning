public class Fibonacci {
    public static void main(String[] args) {
        int terms = 10;
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: " + first + ", " + second);

        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}
