package diva;
import java.util.*;
public class greatervalue {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value");
		char a=in.next().charAt(0);
		char arr[]=new char[3];
		char brr[]=new char[3];
		for(int i=0;i<3;i++) {
			System.out.println("Enter the next char"+(1+i));
			 arr[i]=in.next().charAt(0);
			 brr[i]=arr[i];
		}
		int b=a;
		int c=1000;
		char d=' ';
        for(int i=0;i<3;i++) {
        	if(c>brr[i]) {
        		c=brr[i];
        		d=arr[i];
        	}
        }
        System.out.println(d);
	}

}
