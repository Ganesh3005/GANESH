package ganesh;
import java.util.Scanner;
public class arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int[]a= {20,56,7,89,76,23,10};
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
	}

}
