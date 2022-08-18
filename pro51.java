//more number of letter
import java.util.*;
public class pro51 {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string:");
        String a=in.nextLine();
        int max=0;
        int c=0;
        String e="";
        char ar[]=a.toCharArray();
        for(int i=0;i<ar.length;i++) {
        	c=0;
        	for(int j=i+1;j<ar.length;j++) {
        		char b=a.charAt(i);
        		char d=a.charAt(j);
        		if(b==d&&i!=j) {
        			c=c+1;
        			}
        		if(c>max) {
            		max=c;
            	}
        	}
        if(c==max) {
         e="";	
         e+=ar[i];
        }}
        System.out.println(e);
   }
}
