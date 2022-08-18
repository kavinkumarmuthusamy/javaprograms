//palitrom or not
import java.util.Scanner;

public class pro15 {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		int m=in.nextInt();
        int n=m,b,a=0;
        while(m>0) {
        	b=m%10;
        	a=(a*10)+b;
        	m=m/10;
        }
        if(n==a) {
        System.out.println("it is palitrom");
        }
        else {
            System.out.println("it is not palitrom");
            }

        }
	}


