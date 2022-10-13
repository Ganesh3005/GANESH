package ganesh;
import java.util.Scanner;
public class reciprocal {
enum Level{LOW,MEDIUM,HIGH};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1+1/2+1/3+1/4
		System.out.println("enter the number");
		java.util.Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		double result=0.0,reciprocal=0.0;
		for(double i=1;i<=num;i++)
	
		{
			reciprocal=(1/i);
			System.out.println("reciprocal="+reciprocal);
			result=result+reciprocal;
			
		}
		System.out.println("sum of series=+result");
	}

}
