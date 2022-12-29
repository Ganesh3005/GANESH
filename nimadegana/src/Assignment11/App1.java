package Assignment11;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App1 {
	 public static void main( String[] args )
	    {
	    	 System.out.println( "Project Started!" );
	         Configuration cfg=new Configuration().configure().addAnnotatedClass(Teacher.class);
	         Configuration cfg1=new Configuration().configure().addAnnotatedClass(Course
	        		 .class);
	         SessionFactory sf=cfg.buildSessionFactory();
	         Session s = sf.openSession();
	         Transaction T = s.beginTransaction();
	         
	         Teacher T1 = new Teacher();
	         T1.setTid(102);
	         T1.setName("Anuradha");
	         T1.setDept("CSC");
	        
	         Course c1 = new Course();
	         Course c2 = new Course();
	         Course c3 = new Course();
	         c1.setCid(105);
	         c1.setCnmae("Java Trainer");
	         c2.setCid(202);
	         c2.setCnmae("Python Programming");
	         c3.setCid(303);
	         c3.setCnmae("Angular Programming");
	         
	         List<Course> course = new ArrayList();
	         course.add(c1);
	         course.add(c2);
	         course.add(c3);
	         
	         T1.setCourse(course);
	         s.persist(T1);
	         T.commit();
	         s.close();
	         
	    }
	}
	




}
