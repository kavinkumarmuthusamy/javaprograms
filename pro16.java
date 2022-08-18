//nagetive into positive
import java.util.Scanner;

public class pro16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m=in.nextInt();
		if(0>m) {
        m=m*-1;
        System.out.println("changed into postive"+m);
	}
		else {
	        System.out.println("changed not into postive"+m);
		}
		}
}
