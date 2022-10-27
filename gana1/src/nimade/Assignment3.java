package nimade;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the angle A=");
		int a=sc.nextInt();
		System.out.println("enter the angle B=");
		int b=sc.nextInt();
		System.out.println("enter the angle C=");
		int c=sc.nextInt();
		int n=a+b+c;
		System.out.println(n);
		if(n==180)

			{
				System.out.println("1st prize");
			}
			
		else
		{
			System.out.println("no prize");
		}

	}

}
