package ganesh;
import java.util.Scanner;
public class prime 
{
	static int power(int N,int P)
	{
		if(P==0)
			return 1;
		else
			return N*power(N,P-1);
	}
//Driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int N=2;
			int P=6;
					System.out.println(power(N,P));
		
	}

	}
