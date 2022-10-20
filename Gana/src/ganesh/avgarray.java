package ganesh;
import java.util.Scanner;
public class avgarray {

	public static void main(String[] args) {
		// TODO Auto-generated method s
int num[]= {20,30,25,35,-16,60,100};
int sum=0;
int average=0;
for(int x:num)
{
	sum+=x;
	average=sum/7;
}
	System.out.println("average of number in array is:"+average);
	}
}