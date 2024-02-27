public class Digits {
    public static void main (String[] args){
        int number = 258;
        int hundreds;
        int tens;
        int ones;

        hundreds = (number - (number % 100)) / 100;
        tens = ((number - (number % 10)) - (number - (number % 100))) / 10;
        ones = number % 10;
 
        System.out.println("The hundred's place digit of " + number + " is " + hundreds);
        System.out.println("The ten's place digit of " + number + " is " + tens);
        System.out.println(ones);
    }
}