package newp;
import java.util.*;
public class summultiplealsosame {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int a=in.nextInt();
        int b=a*a;
        int c=0;
        	while(b!=0) {
        		c+=b%10;
        		b=b/10;
        	}
        	if(c==a) {
        		System.out.println("neon true "+a);
        	}else {
        		System.out.println("neon flase "+a);
        	}
        }
	}


