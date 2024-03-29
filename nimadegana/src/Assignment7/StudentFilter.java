package Assignment7;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student //   student class declare
{
	private int id;
	private String name;
	private int age;
	private int Maths_marks;
	
	
	// use Getter setter Method
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getMaths_marks() 
	{
		return Maths_marks;
	}
	public void setMaths_marks(int maths_marks) 
	{
		Maths_marks = maths_marks;
	}
	public Student(int id, String name, int age, int maths_marks)  // parameterized constructor
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Maths_marks = maths_marks;
	}
	public Student() // constructor super class
	{
		
	}
}
public class StudentFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stud = new ArrayList<>();
		stud.add(new Student(1,"Prasad",22,75));
		stud.add(new Student(2,"Ganesh",22,79));
		stud.add(new Student(3,"Saurabh",24,80));
		stud.add(new Student(4,"Vaibhav",21,86));
		stud.add(new Student(5,"Akash",22,58));
		stud.add(new Student(6,"Shubham",22,60));
		
		System.out.println("Student Marks :");
		stud.stream().forEach(j->System.out.println(j.getId()+" "+j.getName()+" "+j.getAge()+" "+j.getMaths_marks()));
		
		System.out.println("Student get Marks in Maths in between 60 to 80 :");
		stud.stream().filter(s->s.getMaths_marks()>60&&s.getMaths_marks()<80).forEach(p->System.out.println(p.getId()+" "+p.getName()+" "+p.getMaths_marks()));
		
	}

}
