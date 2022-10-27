//decimal to binary
import java.util.Scanner;
public class decimaltobinary {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=in.nextInt();
		 int [] a=new int[10];
		 int i=0;
		while(n>0) {
			a[i]=n%2;
			n=n/2;
			i++;
		}
		for(i=i-1;i>=0;i--) {
			System.out.print(a[i]);
		}
//		System.out.println(Integer.toBinaryString(n));
	}

}
