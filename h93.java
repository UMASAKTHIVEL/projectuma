import java.util.Scanner;


public class h95 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
			String s6="";
			String[] s1 = s.split(" ");
			String[] s2 = new String[s1.length];
			String[] temp = new String[s2.length];
			String s3 = "";
			//char []b=new char[a.length];
			for (int i = 0; i < s1.length; i++) {
				temp[i] = "";
				StringBuffer sb = new StringBuffer(s1[i]);
				s2[i] = sb.reverse().toString();
				//System.out.println(s2[i]);
				char[] c = new char[s2[i].length()];
				for (int j = 0; j < s1[i].length(); j++) {
					//System.out.println(s1[i].charAt(j));
					//System.out.println("a"+s2[i].charAt(j));
					if (Character.isUpperCase(s1[i].charAt(j))) {
						c[j] = Character.toUpperCase(s2[i].charAt(j));
					} else if (Character.isLowerCase(s1[i].charAt(j))) {
						c[j] = Character.toLowerCase(s2[i].charAt(j));
					}
					temp[i] += c[j];
				}
				s += temp[i] + " ";
			}
			System.out.println(s);

		}
}
