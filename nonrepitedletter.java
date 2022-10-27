package newpack;
import java.util.*;
public class nonrepitedletter {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String a=in.nextLine();
		char arr[]=a.toCharArray();
		String b="";
		if(arr[0]!=arr[1]) {
			b+=arr[0];
		}
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i-1]!=arr[i]&&arr[i+1]!=arr[i]) {
				b+=arr[i];
			}
		}
		if(arr[arr.length-2]!=arr[arr.length-1]) {
			b+=arr[arr.length-1];
		}
		System.out.println(b);
	}

}
