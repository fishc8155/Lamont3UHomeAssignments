
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

        //ask how many students are in the class
        System.out.println("How many students are there?");
        int numberOfStudents = in.nextInt();

        //enter heights in cm
        System.out.println("Please enter all of the heights in centimeters");

        //store heights
        double[] classHeights = new double[numberOfStudents];

        //make a loop
        for (int i = 0; i < numberOfStudents; i++) {
            classHeights[i] = in.nextInt(); 
        }
        
        double sumOfArray = 0;
        for (int count = 0; count < numberOfStudents; count++) { 
            sumOfArray = sumOfArray + classHeights[count]; 
        }
        //get average
        double average = sumOfArray / numberOfStudents; 
        
        // output all above average heights
        System.out.printf("These are the heights that are above average "); 
        for(int x = 0; x < numberOfStudents; x++){ 
            if (classHeights[x] >= average){ 
                System.out.printf("%.0f", classHeights[x]); 
                System.out.print("cm, "); 
            }
        }
    }
}
    
    

