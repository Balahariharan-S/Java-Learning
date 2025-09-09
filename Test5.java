public class Test5 {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(double a, double b){
        System.out.println(a+b);
    }
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    static void add(String fname, String lname){
        System.out.println(fname+" "+lname);
    }
    public static void main(String[] args) {
        add(10,15);
        add(7.0,14.0);
        add(14,17,19);
        add("Sanjay","Sampath");
    }
}
