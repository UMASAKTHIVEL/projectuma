import java.util.Scanner;


public class facotrial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int f=s.nextInt(),fact=1;
	int a=f;
	do{
		fact*=f;
		f--;
	}while(f>=1);
System.out.println("factorial of "+a+" is "+fact);
	}

}
