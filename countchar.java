package newp;
import java.util.*;
public class countchar {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String a=in.nextLine();
        char arr[]=a.toCharArray();
        int c=1;
        int b=0;
        for(int i=0;i<arr.length-1;i++) {
        	if(arr[i]==arr[i+1]) {
        		c++;
        	}else {
        		System.out.print(arr[i]+""+c);
        		c=1; 
        	}
        	b=i;
        }
        System.out.print(arr[b]+""+c);
	}
}
