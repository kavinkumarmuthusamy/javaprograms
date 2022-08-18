//swapping two number in without using three variable
import java.util.Scanner;

public class pro13 {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		int m=in.nextInt();
		int n=in.nextInt();
          m=m+n;
          n=m-n;
          m=m-n;
          System.out.println("m="+m+"n="+n );
	}

}
