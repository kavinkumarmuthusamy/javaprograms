package newp;
import java.util.*;
public class binaryornot {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
        int a=in.nextInt();
        int res=0;
        while(a!=0) {
        	int b=a%10;
        	a=a/10;
        	if(b!=1&&b!=0) {
        		res=1;
        		break;
        	}
        }
        if(res==1) {
        	System.out.println("False");
        }
        else {
        	System.out.println("True");
        }
	}

}
