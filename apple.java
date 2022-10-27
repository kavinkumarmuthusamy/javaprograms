package newpack;
import java.util.*;
public class apple {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the how many Apple");
		int n=in.nextInt();
		System.out.println("how many apple first shop in pack and rate");
        int a1=in.nextInt();
        int a2=in.nextInt();
        System.out.println("how many apple second shop in pack and rate");
        int b1=in.nextInt();
        int b2=in.nextInt();
        int c=a1;
        int d=a2;
        while(a1<n) {
        	a1=a1+c;
        	a2=a2+d;
        }
        c=b1;
        d=b2;
        while(b1<n) {
        	b1=b1+c;
        	b2=b2+d;
        }
        if(a2>b2) {
        	System.out.println("second shop rate less "+b2);
        }
        else if(a2==b2) {
        	System.out.println("both shop is same rate "+b2);
        }
        else {
        	System.out.println("first shop rate less "+a2);
        }
	}

}
