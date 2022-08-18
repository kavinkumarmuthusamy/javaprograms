//min and max
import java.util.Scanner;

public class pro10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			int n=in.nextInt();
			int[] a =new int[n];
			int i=0;
			for( i=0;i<n;i++) {
				a[i]=in.nextInt();
			}
			int max=a[0];
for( i=0;i<n;i++) {
 if( max < a[i]) {
		max=a[i];
 }
 
}
int min=a[0];
for(i=0;i<n;i++) {
	if(min>a[i]) {
		min=a[i];
	}
}
System.out.println("max value:"+max);
System.out.println("min value:"+min);

	}
	}

