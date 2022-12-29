package Assignment12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Entity.Agent;
import com.spring.Entity.Agentdao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// ApplicationContext represent the Spring IoC Containers
    	//also give path of config.xml file.
    	ApplicationContext ap=new ClassPathXmlApplicationContext("config.xml");
    	
    	//create object of Agentdao class age call getBean method.
    	Agentdao dao=(Agentdao) ap.getBean("x");
    	
    	//Give value to Agent class variable
    	System.out.println(dao.saveAgent(new Agent(1,"Gana",50000)));
    	System.out.println(dao.saveAgent(new Agent(2,"Pasha",40000)));
    	System.out.println(dao.saveAgent(new Agent(3,"Dinya",30000)));
    	System.out.println(dao.saveAgent(new Agent(4,"Bandu",20000)));
    	
    	//update value of Agent class variable
    	System.out.println(dao.updateAgent(new Agent(1,"Shubham",50000)));
    	
    	//delete value from Agent class
    	System.out.println(dao.deleteAgent(new Agent(4)));
        System.out.println( "Hello World!" );
    }
}


