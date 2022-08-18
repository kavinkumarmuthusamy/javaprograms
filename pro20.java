//power the value
import java.util.Scanner;

public class pro20 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the power a:");
		int a=in.nextInt();
         System.out.println("enter the value b: ");
         int b=in.nextInt();
         int c=b;
         for(int i=1;i<a;i++) {
        	 b*=c;
         }
         System.out.println("power value is:"+b);
	}

}
