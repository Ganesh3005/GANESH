package Gana;
import java.util.*;
public class Excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Taking user input through scanner

	     Scanner s = new Scanner(System.in);


	     // Creating array to store elements

	     int arr[] = new int[5];


	     // creating and initializing variable with 0

	     int i = 0;


	     // Condition check

	     while (i < 5) {


	         // Storing user defined elements in array

	         arr[i++] = s.nextInt();

	     }

	     System.out.println(

	         "Array elements are as follows: ");


	     // Iteration over elements

	     for (int j = 0; j < 5; j++)

	         System.out.print(arr[j] + "  ");

	 }
	}