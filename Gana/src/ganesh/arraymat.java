package ganesh;

public class arraymat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{1,2,4},{5,6,4},{3,2,1}};
int b[][]= {{1,3,4},{2,2,4},{1,2,1}};
int c[][]= new int[3][3];
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		c[i][j]=a[i][j]-b[i][j];
	}
}
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.print(c[i][j]+"");
	}
	System.out.println();
}

	}

}
