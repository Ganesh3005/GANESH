package ganesh;
import java.util.Scanner;
public class fact {
static int factorial(int n)
{
	int res=1,i;
	for(i=1;i<=n;i++)
		res*=i;
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner res=new Scanner(System.in);
System.out.println("enter the value=");
int num=res.nextInt();
System.out.println("factorial of"+num+"is"+factorial(num));


	}

}
