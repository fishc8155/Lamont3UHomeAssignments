
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
        
        
        int students = in.nextInt();
        
        //ask user to enter all of the marks in the class
        System.out.println("Please enter the marks");
        
        //store amrks
        double[] marks = new double[students];
        
        //make a loop
        for(int i = 0; i < students; i++){ 
            marks[i] = in.nextInt();
        }
        
        //find average
        System.out.print("The average is ");
        System.out.printf("%.2f", average(students, marks));
        System.out.print("%");


    } public static double average(int students, double[] marks){
        double sumOfArray = 0;
        for (int i = 0; i < students; i++) { 
            sumOfArray = sumOfArray + marks[i]; 
        }
        double average = sumOfArray / students; 
        
        return average;
    }
    
}
