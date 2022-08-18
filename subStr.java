
import java.util.*;
public class subStr {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter an string:");
		String a=s.nextLine();
		String o="";
		System.out.println("enter the num char :");
		int d=s.nextInt();
		for (int i = 0; i <=a.length()-d; i++) {
			o=a.substring(i, i+d);
			System.out.println(o);
		}	
	}
}
