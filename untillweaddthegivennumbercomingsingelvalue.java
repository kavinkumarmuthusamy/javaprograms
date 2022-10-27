//untill we add the given number coming singel value
import java.util.Scanner;

public class untillweaddthegivennumbercomingsingelvalue {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value:");
		int n=in.nextInt();
	
		int ans=single(n);
		if (ans>9) {
			ans=single(ans);
		}
		
		System.out.println(ans);
		}
	public static int single(int a) {
		int b=1,c=0;
		
	while(a>0) {
		b=a%10;
		c+=b;
		a=a/10;
	}
	return c;
	}

}
