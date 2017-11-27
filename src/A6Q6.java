
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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //create scanner
        Scanner in = new Scanner(System.in);

        System.out.println("How many students are in the class?");
        int Students = in.nextInt();

        //create an array
        int[] marks = new int[Students];

        //ask user for 10 marks
        System.out.println("Enter " + Students + " marks");


        //recieve all of the marks
        for (int a = 0; a < Students; a++) {
            marks[a] = in.nextInt(); 
        }

        for (int x = 0; x < Students; x++) { 
            for (int i = 0; i < Students - 1; i++) { 
                if (marks[x] < marks[i]) { 
                    int temp = marks[i]; 
                    marks[i] = marks[x]; 
                    marks[x] = temp; 
                } else {
                }
            }
        }
          
        
        
        //make average variable
        int average = 0; 
        
        for (int y = 0; y < Students; y++){ 
            average = marks[y] + average; 
        }
        //find average
        average = average/Students;
        
        //output lowest mark
        System.out.println("The lowest mark is " + marks[0]); 
       
        //output highest mark
        System.out.println("The highest mark is " + marks[Students - 1]); 
        
        //output average
        System.out.println("The average is " + average); 

    }
    
}
