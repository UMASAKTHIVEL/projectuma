import java.util.Scanner;


public class divideby2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			int a=i;
			while(a!=0)
			{
				int b=a%10;
				if(b==2)
				{
					count++;
				}
				a=a/10;
			}
		}
		System.out.println(count);
	}

}
