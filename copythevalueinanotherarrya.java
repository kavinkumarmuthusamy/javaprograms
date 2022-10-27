//copy the value in another arrya// 
import java.util.Scanner;
public class copythevalueinanotherarrya {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size:");
			int n=in.nextInt();
			System.out.println("enter the value:");
			int[] a =new int[n];
			for(int i=0;i<n;i++) {
				a[i]=in.nextInt();
			}
			int[] b=new int[n];
			for(int i=0;i<n;i++) {
				b[i]=a[i];
			}
			for(int i=0;i<n;i++) {
				System.out.println(b[i]);
			}
		}	
}
