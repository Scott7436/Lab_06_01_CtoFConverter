import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double tempC;
        double tempF;


        System.out.print("Please enter the temperature in Celsius: ");

        if(in.hasNextDouble())
        {
            tempC = in.nextDouble();
            in.nextLine();
            tempF = tempC * 1.8 + 32;
            System.out.println("You entered " + tempC +" which is " + tempF +  " in Fahrenheit");

        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said your temperature was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);

        }

    }
}