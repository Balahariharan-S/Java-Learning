public class ATMDemo {
    public static void main(String[] args) {
        ATMAccount acc = new ATMAccount("ACC123", 1000.0);
        acc.deposit(200);
        acc.withdraw(500);
        acc.withdraw(1000);
    }
}
