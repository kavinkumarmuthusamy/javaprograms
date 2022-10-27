package newpack;
import java.util.*;
public class primeposition {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String s=in.nextLine();
		char srr[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int a=srr[i];
			if(a<91) {
				a=a-64;
			}else {
				a=a-96;
			}if(a>1) {
			int res=0;
			for(int j=2;j<=a/2;j++) {
				if(a%j==0) {
					res=1;
				}
			}
			if(res==0) {
				System.out.println(srr[i]);
			}}
		}
	}

}
