package Assignment8;
class Circle
{
	static final double pi = Math.PI;
	

	public void Area(double r,double r1)
	{
		double area=pi*r*r;
		System.out.println("First Area of circle="+area);
		
		double area1=pi*r1*r1;
		System.out.println("Second Area of circle="+area1);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle A=new Circle();
		A.Area(4,20);
	}

}
