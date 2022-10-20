package Ganesh;
import java.util.Scanner;
public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find Hcf(hcd) of two number:
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int i,hcf=0;
		for( i=1; i<=num1/2 && i<=num2/2;i++){
		if(num1%i==0 && num2%i==0){
		hcf=i;
		}
		}
		System.out.println("HCF of " +num1 + " and " +num2 + " is :" +hcf);
		
		}
		
}


