import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class PRP2FIVER {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String input1=s.next().toUpperCase();
		char []a=input1.toCharArray();
		int count=0;
		String last="";
		Set<String> set=new LinkedHashSet();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='_')
			{
				count++;
			}
				
		}
		String input2=s.next();
		char []b=input2.toCharArray();
		boolean flag=false;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==':'||Character.isAlphabetic(b[i]))
			{
			flag=true;	
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(count==1&&flag==true)
		{
			String []a1=input1.split("_");
			int len=a1.length;
			if(len==2)
			{
				String []a2=input2.split(":");
				for(int i=0;i<a2.length;i++)
			{
					if(a2[i].startsWith(a1[0])&&a2[i].endsWith(a1[1])&&input1.length()==a2[i].length())
					{
						set.add(a2[i]);
					}
			}
					
			}
			else if(len==1)
			{
				if(input1.startsWith("_"))
				{
			
				String []a2=input2.split(":");
				for(int i=0;i<a2.length;i++)
			{
					if(a2[i].endsWith(a1[1])&&input1.length()==a2[i].length())
					{
						set.add(a2[i]);
					}
			}
				}
			
			
				else if(input1.endsWith("_"))
				{
			
				String []a2=input2.split(":");
				for(int i=0;i<a2.length;i++)
			{
					if(a2[i].endsWith(a1[1])&&input1.length()==a2[i].length())
					{
						set.add(a2[i]);
					}
			}
				}
			
			}
		}
			Iterator it=set.iterator();
			while(it.hasNext())
			{
				last+=it.next()+":";
			}
			String sp[]=last.split(":");
			for(int j=0;j<sp.length;j++)
			{
				System.out.print(sp[j]+((j==sp.length-1)?"":":"));
			}
		
	}
}
			
			
		
