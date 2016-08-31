import java.util.Scanner;


public class reversedigitofainteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=0;
		while(n!=0)
		{
			 b=n%10;
			n=n/10;
			System.out.print(b);
		}
		
	}

}
