package newpack;
import java.util.*;
public class keybord {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the abcd");
		String s="qwertyuiopasdfghjklzxcvbnm";
		char srr[]=s.toCharArray();
		System.out.println("enter the string");
		String a=in.nextLine();
		char arr[]=a.toCharArray();
		String b="";
		char c='a';
		for(int i=0;i<arr.length;i++) {
			c='a';
			for(int j=0;j<srr.length;j++) {
				if(arr[i]==srr[j]) {
					b+=c;
					break;
				}
				c++;
			}
		}
		System.out.println(b);
	}

}
