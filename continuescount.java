package newp;
import java.util.*;
public class continuescount {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String a=in.nextLine();
        char arr[]=a.toCharArray();
       char b;
       int max=0;
       int d=0;
       int c=1;
        for(int i=1;i<arr.length;i++) {
        	if(arr[i-1]==arr[i]) {
        		c++;
        	}
        	if(max<c) {
        		max=c;
        		d=i;
        	}
        	if(arr[i-1]!=arr[i]) {
        		c=1;
        	}	
        }
        System.out.println(arr[d]);
        System.out.println(max);
	}

}
