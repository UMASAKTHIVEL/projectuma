import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class removeduplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		TreeSet<String> s1=new TreeSet<String>();
		for(int i=0;i<s.length();i++)
		{
			s1.add(s.charAt(i)+" ");
			
		}
		System.out.println(s1);
	}

}
