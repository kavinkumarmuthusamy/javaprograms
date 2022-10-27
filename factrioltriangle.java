package newpack;
import java.util.*;
public class factrioltriangle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int n=in.nextInt();
        int a=1;
        int b=0;
        int m=2;
        int i=1;
        System.out.println("0");
        System.out.print("1 ");
        while(a+b<n) {
        	 int c=a;
        	 a=a+b;
        	 b=c;
        	 System.out.print(a+" ");
        	 i++;
        	 if(i>=m) {
        		 i=0;m++;
        		 System.out.println();
        	 }
        }
	}
}
