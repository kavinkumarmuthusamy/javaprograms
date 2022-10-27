package newpack;
import java.util.*;
public class letter {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the String");
		String a=in.nextLine();
		System.out.println("enter the number");
		int n=in.nextInt();
		char arr[]=a.toCharArray();
		String b="";
		for(int i=0;i<arr.length;i++) {
			int c=n;
			char z=arr[i];
			while(c!=0) {
				z++;
				c--;
				if(z=='{') {
					z='a';
				}
				if(z=='[') {
					z='A';
				}
			}
			b+=z;
		}
       System.out.println(b);
	}

}
