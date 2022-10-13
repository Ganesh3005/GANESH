package ganesh;
import java.util.Scanner;
public class Greade {
enum Level{LOW, MEDIUM,HIGH};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Helloword";
		String str2="Helloword";
		System.out.println(str1.compareToIgnoreCase(str2));
		String s1="tutorialspoint";
		String s2="tutorialspoint";
		String s3=new String("tutorialspoint");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
	}

}

