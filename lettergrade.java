//Author: prashanth kumar ganji
import java.util.Scanner;
public class lettergrade{
    public static void main(String[] args) {
        char lettergrade;
        System.out.println("Prashanth kumar Ganji");
        System.out.println(" please enter your grade : ");
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        // if grade >= 92, set the lettergrade to A+
        if (grade >= 92){
            System.out.println("Your letter grade is A+");
        }
        // if grade >= 90, set the lettergrade to A
        else if (grade >= 90){
            System.out.println("Your letter grade is A");
        }
        // if grade >= 87, set the lettergrade to B+
        else if (grade >= 87){
            System.out.println("Your letter grade is B+");
        }
        // if grade >= 80, set the lettergrade to B
        else if (grade >= 80){
            System.out.println("Your letter grade is B");
        }
        //if grade >=  , set the lettergrade to C+
        else if (grade >= 77){
            System.out.println("Your letter grade is C+");
        }
        // if grade >= 70, set the lettergrade to C
        else if (grade >= 70){
            System.out.println("Your letter grade is C");
        }
        // if grade >= 67, set the lettergrade to D+
        else if (grade >= 67){
            System.out.println("Your letter grade is D+");
        }
        // if grade >=62, set the lettergrade to D
        else if (grade >= 62){
            System.out.println("Your letter grade is D");
        }
        // else set the grade to F
        else{
        System.out.println("Your letter grade is F");
        }
        // Display the final grade
        


    }
}

