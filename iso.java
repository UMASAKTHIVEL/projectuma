import java.util.Scanner;


public class iso {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int f=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					if(s2.charAt(i)==s2.charAt(j))
					{
						//System.out.println("true");
						f=1;
					}
					else
					{
						//System.out.println("false");
						f=0;
					}
				}
				
			
			}
		}if(f==1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
