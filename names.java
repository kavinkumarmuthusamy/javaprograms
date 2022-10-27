package newpack;
import java.util.*;
public class names {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter th number of name");
        int n=in.nextInt();
        String a[]=new String[n];
        System.out.println("Enter the name "+n);
        for(int i=1;i<=n;i++) {
        	 a[i]=in.nextLine();
        }
        for(int i=0;i<=n;i++) {
        	System.out.println(a[i]);
        }
//        char b[][]=new char[n][100];
//        for(int i=0;i<n;i++) {
//        	char[] b1=a[i].toCharArray();
//        	
//        }
	}

}
