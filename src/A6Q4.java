
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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);

        //create an array
        int[] marks = new int[10];

        //ask user for 10 marks
        System.out.println("Please enter 10 marks");

        
        //get all the marks
        for (int a = 0; a < 10; a++){ 
        marks[a] = in.nextInt(); 
        }

        for (int x = 0; x < 10; x++) { 
            for (int i = 0; i < 9; i++) { 
                if (marks[x] < marks[i]) { 
                    int temp = marks[i]; 
                    marks[x] = temp; 
                }else{
                    
                }
            }
        }
        ascending(marks); 
    }
    public static void ascending(int[] marks){
        System.out.print("The numbers in ascending order are; "); 
        
        for (int i = 0; i < 10; i++){ 
            System.out.print(marks [i] + " ");
    }
    
}
}
