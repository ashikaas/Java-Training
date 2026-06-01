import java.util.Scanner;
public class Voter {
    public static void main(String[] agrs){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age >= 18) 
            {System.out.println("You are eligible! ");
        } else 
        {System.out.println("Not Eligible!! ");}

    
scanner.close();

    }    
}
