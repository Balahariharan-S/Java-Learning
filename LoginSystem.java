public class LoginSystem {
    public static void main(String[] args) {
        String username = "admin";
        String password = "12345";
        String user = "Admin";
        String pass = "12345";
        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Username or Password!");
        }

    }
}