public class Test4 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int temp;
        System.out.print(a+ ",");
        for(int i=0;i<n;i++){
            System.out.print(b+ ",");
            temp = a + b;
            a = b;
            b = temp;
        }
    }
}
