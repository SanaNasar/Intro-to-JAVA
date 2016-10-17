import java.util.*;
 
class SantaClaus
{
    String greeting = "Ho! Ho! Ho!";
}
class HelloSantaClaus
{
    public static void main(String[] args)
    {
        SantaClaus sc = new SantaClaus();
        System.out.println("You do not want to pay taxes, right? Say 'yes'.");
        Scanner myScanner = new Scanner(System.in);
        String userAnswer = myScanner.nextLine();
        System.out.println("You said " + userAnswer);
        System.out.println(sc.greeting + " now let's add two integers.");
        System.out.println("Type in an integer, that is, a whole number.");
        int myFirstInt = myScanner.nextInt();
        System.out.println("Type in an second integer.");
        int mySecondInt = myScanner.nextInt();
        System.out.println("The sum is: " + (myFirstInt + mySecondInt));
    }
}