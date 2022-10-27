package newp;
import java.util.*;
public class spynum {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.println("enter the number");
		int a=in.nextInt();
		int b=0;
		int c=1;
        while(a!=0) {
        	b+=a%10;
        	c*=a%10;
        	a=a/10;
        }
        if(b==c) {
        	System.out.println("it is spy number");
        }else {
        	System.out.println("it is non spy number");
        }
	}

}
