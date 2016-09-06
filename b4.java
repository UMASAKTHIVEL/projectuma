import java.util.Scanner;


public class b4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int f=0;
		char []a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(Character.isAlphabetic(a[i]))
					{
				f++;
					}
		}
		if(f>0)
		{
			System.out.println("alphabet");
		}

	}

}
