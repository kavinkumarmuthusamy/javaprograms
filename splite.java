package newpack;
import java.util.*;
public class splite {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String s=in.nextLine();
		System.out.println("enter the dividing number");
		int n=in.nextInt();
		int c=0;
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='-') {
				c++;
			} else {
				arr[i-c]=arr[i];
			}
		}
		s="";
		int d=0;
		int e=n;
		for(int i=0;i<arr.length-c;i++) {
			d++;
			s+=arr[i];
			if(d==e&&d<arr.length-c) {
				e+=n;
				s+="-";
			}
		}
		System.out.println(s);
	}

}
