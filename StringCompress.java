import java.util.Scanner;

public class StringCompress {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Input: ");
        String input = sc.nextLine();
        StringBuilder output = new StringBuilder();
        int count = 1;
        for (int i=1;i<=input.length();i++){
            if(i<input.length() && input.charAt(i) == input.charAt(i-1)){
                count++;
            }else {
                output.append(input.charAt(i-1)).append(count);
                count = 1;
            }
        }
        System.out.println("The compressed Input is "+output.toString());
    }
}
