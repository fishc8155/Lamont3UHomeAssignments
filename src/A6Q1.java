
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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inport a scanner
        Scanner in = new Scanner(System.in);
        
        //ask how many students are in the class
        System.out.println("How many students are in the class?");
        
        
        int numberOfStudents = in.nextInt();
        
        //ask user to enter all of the marks in the class
        System.out.println("Please enter the marks");
        
        //store amrks
        double[] classMarks = new double[numberOfStudents];
        
        //make a loop
        for(int i = 0; i < numberOfStudents; i++){ 
            classMarks[i] = in.nextInt();
        }
        
        //find average
        System.out.print("The average is ");
        System.out.printf("%.2f", average(numberOfStudents, classMarks));
        System.out.print("%");


    } public static double average(int numberOfStudents, double[] classMarks){
        double sumOfArray = 0;
        for (int i = 0; i < numberOfStudents; i++) { 
            sumOfArray = sumOfArray + classMarks[i]; 
        }
        double average = sumOfArray / numberOfStudents; 
        
        return average;
    }
    
}
