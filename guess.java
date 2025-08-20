import java.util.Random;
import java.util.Scanner;

public class guess{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        int userguess = 0;
        int attempts = 0;
        while(userguess != number){
            System.out.println("enter your guess: ");
            userguess = sc.nextInt();
            attempts++;
            if(userguess > number){
                System.out.println("Too High!");
            }
            else if(userguess < number){
                System.out.println("Too Low!");
            }
            else{
                System.out.println("You guessed it in "+attempts+" attempts!");
            }
        }
    }
}