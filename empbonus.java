public class empbonus {
    public static void main(String[] args) {
        double salary = 20000;
        int years = 3;
        double bonus;
        if (years > 5) {
            bonus = salary * 10/100;
        } else {
            bonus = salary * 5 / 100;
        }
    }
}