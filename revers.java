package diva;
import java.util.*;
public class revers {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=in.nextLine();
		char arr[]=a.toCharArray();
		String brr[]=a.split(" ");
		String z="";
		int c=0;
		char f=' ';
		int e=1;
		int d=brr[0].length();
        for(int i=arr.length-1;i>=0;i--) {
            	if(c==d&& arr[i]!=f) {
        		z+=" ";
        		z+=arr[i];
        		d=d+brr[e].length();
        		e++;
        		c++;
        	}else if(arr[i]!=f) {
        	z+=arr[i];
        	c++;
        	}
        }
        System.out.println(z);
	}

}
