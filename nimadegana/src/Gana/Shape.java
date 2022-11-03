package Gana;
class Square
{
    double side;

    Square(double side)
    {
        this.side = side;
    }

    double getArea()
    {
        return side * side;
    }
}

class Circle
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    double getArea()
    {
        return (22.0/7.0) * radius * radius;
    }
}
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Square s = new Square(7);
        Circle c = new Circle(3.5);
        
        System.out.println("Square Area : " + s.getArea());
        System.out.println("Circle Area : " + c.getArea());
        System.out.println();
        
	}

}
