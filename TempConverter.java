import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args){
        double fahrenheit;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("The conversion from fahrenheit to celsius is: " + celsius);
    }
}
