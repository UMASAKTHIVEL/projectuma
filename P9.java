import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class primenum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=new Scanner(System.in).nextInt();
		int c=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=2;i<n;i++)
		{
			c=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				c++;	
			}
			if(c==0)
			{
				al.add(i);
			System.out.println(i);
			}
		}
		System.out.println(al.size());

	}

}
