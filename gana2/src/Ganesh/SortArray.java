package Ganesh;
import java.util.*;
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defining an array of type string  
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string value: ");
	      String str = sc.nextLine();
	      char charArray[] = str.toCharArray();
	      Arrays.sort(charArray);
	      System.out.println(new String(charArray));
	   }	

	}


