package ganesh;
import java.util.Scanner;
public class enumexample {
	enum Level{Addition,Substraction,Multiplication,Division};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Level ch=Level.Multiplication;
Scanner sc=new Scanner(System.in);
System.out.println("enter two value");
int num1=sc.nextInt();
int num2=sc.nextInt();
Switch()
{
case Addition:
	int Add=num1+num2;
	System.out.println(add);
	break;
case substraction:
	int sub=num-num2;
	System.out.println(sub);
	break;
case multiplication:
	int multi=num1*num2;
	System.out.println(multi);
	break;
case division:
	int div=num1/num2;
	System.out.println(div);
	break;
}
	}
	

}
