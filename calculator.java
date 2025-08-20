public class calculator {
    public static void main(String[] args) {
        int a = 25;
        int b = 15;
        String opr = "add";
        if(opr.equalsIgnoreCase("add")){
            System.out.println("Addition:"+ (a+b));
        }
        else if(opr.equalsIgnoreCase("sub")){
            System.out.println("Subtraction"+(a-b));
        }
        else if(opr.equalsIgnoreCase("mul")){
            System.out.println("Multiplication: "+(a*b));
        }
        else if(opr.equalsIgnoreCase("div")){
            System.out.println("Division: "+(a/b));
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}
