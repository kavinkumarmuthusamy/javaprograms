package diva;
import java.util.*;
public class maxvalue {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=in.nextInt();
		int b=1;
		while(a!=0) {
			if(a-3>=2) {
				a=a-3;
				b=b*3;
			}
			else {
				b=a*b;
				a=a-a;		
			}
		}
     System.out.println(b);
	}

}
