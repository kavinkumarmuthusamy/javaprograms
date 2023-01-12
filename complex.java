package diva;
import java.util.*;
public class complex {
	static void add(int a,int b) {	
    	int d=a+b;
    	 System.out.println(d);
     }
	static void dif(int a,int b) {
    int	 e=a-b;
    	 System.out.println(e);
     }
	static void pro(int a,int b) {
	  int   f=a*b;
	     System.out.println(f);
     }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("Enter the num 1");
        int a=in.nextInt();
        System.out.println("Enter the num 2");
        int b=in.nextInt();	
        add(a,b);
        dif(a,b);
        pro(a,b);
	}

}