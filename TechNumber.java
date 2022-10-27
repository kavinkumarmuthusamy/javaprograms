package newp;
import java.util.*;
public class TechNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.println("enter the number");
		int a=in.nextInt();
		int c=0;
		int b=a;
		while(b!=0) {
			c++;
			b=b/10;
		}
		 int d=1;
		for(int i=0;i<c/2;i++) {
			d*=10;
		}
		c=a;
		b=a%d;
		a=a/d;
	  int sum=a+b;
	  sum=sum*sum;
	  if(c==sum) {
		  System.out.println("it is Tech Number");
	  }else {
		  System.out.println("it is Not Tech Number");
	  }
	}

}
