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
	char []a=s.toCharArray();
	int f=0;
	for(int i=0;i<a.length;i++)
	{
		if(Character.isAlphabetic(a[i]))
		{
			f=1;
		}
		else
		{
			f=0;
		}
	}
	if(f==1)
	{
		System.out.println("alphabetic");
	}
	else
	{
		System.out.println("not a alphabetic");
	}
	}
	
}
