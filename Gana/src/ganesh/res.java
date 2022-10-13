package ganesh;
import java.util.Scanner;
public class res {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the first num=");
int x=sc.nextInt();	
System.out.println("enter the second num=");
int y=sc.nextInt();
int res=(x>y)?(x+y):(x-y);
System.out.println("result:"+res);
}

}
