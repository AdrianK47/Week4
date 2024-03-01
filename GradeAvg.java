import java.util.*;
public class GradeAvg {
    public static void main(String[] args){
        double grade1;
        double grade2;
        double grade3;
        double grade4;
        double grade5;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the grade #1: ");
        grade1 = input.nextInt();
        

        System.out.print("Enter the grade #2: ");
        grade2 = input.nextInt();
        

        System.out.print("Enter the grade #3: ");
        grade3 = input.nextInt();
        

        System.out.print("Enter the grade #4: ");
        grade4 = input.nextInt();
        

        System.out.print("Enter the grade #5: ");
        grade5 = input.nextInt();
        

        double average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
        System.out.println("The grade average is " + average);
    }
}
