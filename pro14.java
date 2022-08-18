//amstoring or not
import java.util.Scanner;

public class pro14 {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		int m=in.nextInt();
	int a=0,n=m,b;
		while(m>0) {
		 b=m%10;
		 a+=(b*b*b);
		 m=m/10;
		}
if(n==a) {
	System.out.println("it is amstorn");
}
else {
	System.out.println("it is not amstorn");
}
	}

}
