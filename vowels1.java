/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuffer s1=new StringBuffer(s);
		StringBuffer s2=new StringBuffer(s1.reverse());
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)=='a'||s2.charAt(i)=='A'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='I'||s2.charAt(i)=='o'||s2.charAt(i)=='O'||s2.charAt(i)=='u'||s2.charAt(i)=='U')
			{
				s2.deleteCharAt(i);
				System.out.println(s2);
				
			}
		}


	}
}
