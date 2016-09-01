import java.util.Scanner;


public class ARRAYTARGET {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("target");
		int target=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println(a[i]+" "+a[j]);
				}
				else
				{
					System.out.println("not a number");
				}
			}
		}
	}

}
