import java.util.Scanner;


public class reverseastring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
StringBuffer s1=new StringBuffer(s);
StringBuffer s2=new StringBuffer(s1.reverse());
System.out.println(s2);
	}

}
