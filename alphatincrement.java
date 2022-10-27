//alphat increment 
import java.util.*;
public class alphatincrement {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int a=in.nextInt();
        char x='a';
        char y='A';
        int c=a+a;
        for(int i=0;i<a;i++) {
        	for(int j=0;j<i;j++) {
        System.out.print(x);
        x++;}
        for(int j=0;j<c;j++) {
        	System.out.print(" ");
        }c=c-2;
        	for(int j=0;j<i;j++) {
        		System.out.print(y);
        		y++;
        	}
        			
        			System.out.println();}
        for(int i=0;i<a;i++) {
        	for(int j=0;j<i;j++) {
        		System.out.print(x);
        	}
        	x++;
        	System.out.println();
        }
	}
	}

