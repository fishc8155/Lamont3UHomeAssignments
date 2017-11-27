
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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //new scanner
        Scanner in = new Scanner(System.in);

        // create the median integer
        int median = 0;

        //ask how many students are in the class
        System.out.println("How many students are in the class?");
        int students = in.nextInt();
        //create an array
        int[] marks = new int[students];

        //ask user for 10 marks
        System.out.println("Please enter " + students + " marks");
        //get the marks
        for (int a = 0; a < students; a++) { 
            marks[a] = in.nextInt(); 
        }

        for (int x = 0; x < students; x++) { 
            for (int i = 0; i < students - 1; i++) { 
                if (marks[x] < marks[i]) { 
                    int temp = marks[i]; 
                    marks[i] = marks[x]; 
                    marks[x] = temp;
                } else {
                }
            }
        }
        ascending(marks, students); 
        if ((students / 2) % 2 == 1) { 
            median = marks[students / 2]; 
        } else { //otherwise
            int middle1 = marks[(students + 1) / 2]; 
            int middle2 = marks[(students - 1) / 2]; 
            median = (middle1 + middle2) / 2; 
        }
        System.out.println("");
        System.out.println("The median is " + median);
    }

    public static void ascending(int[] marks, int numberOfStudents) {
        System.out.print("The numbers in ascending order are: "); 

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print(marks[i] + " "); 
        }



    }
}
    
    


