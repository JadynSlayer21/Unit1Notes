import java.util.Scanner;

public class LearningInput {

    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = keyboard.nextLine();

        System.out.println("how old are you?");
        int age = keyboard.nextInt();

        System.out.println("Good morning, " + name);
        System.out.println("you are "+age+" years old");


    }
}
