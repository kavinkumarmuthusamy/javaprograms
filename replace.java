package diva;
import java.util.*;
public class replace {

	public static void main(String[] args) {
		Scanner in=new Scanner( System.in);
		System.out.println("Enter the String");
		String a=in.nextLine();
		System.out.println("Enter the change");
		char b=in.next().charAt(0);
		System.out.println("Enter the change to");
		char c=in.next().charAt(0);
        char arr[]=a.toCharArray();
        String d="";
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==b) {
        		arr[i]=c;
        	}
        	d+=arr[i];
        }
        System.out.println(d);
        System.out.println("remove char");
        char e=in.next().charAt(0);
        for(int i=arr.length-1;i>=0;i--) {
        	if(arr[i]==e) {
        		arr[i]=0;break;
        	}
        }String z="";
        for(int i=0;i<arr.length;i++) {
        	z+=arr[i];
        }
        System.out.println(z);
	}

}
