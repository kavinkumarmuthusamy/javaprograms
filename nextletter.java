package newp;
import java.util.*;
class string{
	public static String name(char[] arr) {
		String c = "";
		for(int i=0;i<arr.length;i++) {
			char b=arr[i];
			if(b!='z') {
			b++;
			c+=b;}
			else {
				b='a';
				c+=b;
			}
		}
		System.out.println(c);
		return c;
	}
}
public class nextletter {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String a=in.nextLine();
		char arr[]=a.toCharArray();
		string.name(arr);
	}

}
