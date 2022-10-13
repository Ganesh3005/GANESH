package ganesh;
import java.util.Scanner;
public class bufferdelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello";
		str1.concat("world");
		StringBuffer sb=new StringBuffer("techvidvanjava");
		sb.delete(0,4);
		System.out.println(str1);
		System.out.println(sb);
		
			}
	}
	


