package newpack;
import java.util.*;
public class Patternmaching {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the String");
		String a=in.nextLine();
		System.out.println("enter the maching String");
		String b=in.nextLine();
        char arr[]=a.toCharArray();
        char brr[]=b.toCharArray();
        int c=0;
        int res=0;
        for(int i=0;i<arr.length;i++) {
        	 char z='a';
             char y='A';
             c=arr[i];
             if(65<=c&&90>=c) {
        	 while(arr[i]!=y) {
        		z++;
        		y++;}
        		if(arr[i]==y) {
        			arr[i]=z;
        		}}
        }
        for(int i=0;i<brr.length;i++) {
       	 char z='a';
            char y='A';
            c=brr[i];
            if(65<=c&&90>=c) {
       	 while(brr[i]!=y) {
       		z++;
       		y++;}
       		if(brr[i]==y) {
       			brr[i]=z;
       		}}
       }
        
        for(int i=0;i<arr.length;i++) {
        	 if(arr[i]==brr[0]) {
        	 c=i;
        	 res=1;
        	 for(int j=0;j<brr.length;j++) {
        		 if(arr[j+c]!=brr[j]) {
        			 res=0;
        		 }
        	 }
        	 if(res==1) {
        		 break;
        	 }
        	 }
        }
        if(res==1) {
        	System.out.println("it is mached");
        }
        else {
        	System.out.println("it is not mached");
        }
	}

}
