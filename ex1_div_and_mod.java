import java.util.*;
public class ex1_div_and_mod {
    public static void main (String[] args){
        int integer;
        int integer2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        integer = input.nextInt();

        System.out.print("Enter a second integer: ");
        integer2 = input.nextInt();

        int division = integer / integer2;
        int mod = integer % integer2;
        int division2 = integer2 / integer;
        int mod2 = integer2 % integer;

        System.out.println(integer + " / " + integer2 + " = " + division);
        System.out.println(integer + " % " + integer2 + " = " + mod);
        System.out.println(integer2 + " / " + integer + " = " + division2);
        System.out.println(integer2 + " % " + integer + " = " + mod2);
    }
}
