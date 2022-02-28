//Write a program to input twenty names in an array. Arrange these names in ascending order of letters, using the bubble sort technique.
//Sample Input:
//Rohit, Devesh, Indrani, Shivangi, Himanshu, Rishi, Piyush, Deepak, Abhishek, Kunal, .....
//Sample Output:
//Abhishek, Deepak, Devesh, Himanshu, Indrani, Kunal, Piyush, Rishi, Rohit, Shivangi, .....
package string_project;
import java.util.Scanner;
public class Bubble_Sort {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String names[] = new String[5];
        System.out.println("Enter 5 names:");
        for (int i = 0;  i < names.length; i++) {
            names[i] = in.nextLine();
        }

        //Bubble Sort
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1 - i; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    String temp = names[j + 1];
                    names[j + 1] = names[j];
                    names[j] = temp;
                }
            }
        }
        
        System.out.println("\nSorted Names");
        for (int i = 0;  i < names.length; i++) {
            System.out.println(names[i]);


        }
	}
}

