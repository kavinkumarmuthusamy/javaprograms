package newp;
import java.util.*;
public class addmultpile {
    public static void main(String[] args) {
    	  Scanner in=new Scanner(System.in);
          System.out.println("enter the string");
          String a=in.nextLine();
          char arr[]=a.toCharArray();
          int d=0;
          int n=0;
         float brr[]=new float[10];
          for(int i=0;i<arr.length;i++) {
        	  char ch=arr[i];
            	int c=ch;
            	if(c<=57&&48<=c) {
            		int z=0;
            		for(int j=48;j<c;j++) {
            			z++;
            		}
            		d+=z;
            		d=d*10;
             	}
            	if(c==42||c==43||c==45||c==47) {
            		d=d/10;
            		brr[n]=d;
            		d=0;
            	n=n+1;
            	}
            	if(i==arr.length-1) {
            		d=d/10;
            		brr[n]=d;
            	}
          }
          float b2=brr[0];
//          for(int i=0;i<=n;i++) {
//          System.out.println(brr[i]);}
          int b1=0;
          for(int i=0;i<arr.length;i++) {
        	  if(arr[i]=='*') {
        		b2*=brr[b1+1];
        		  b1++;  
        	  }
        	  if(arr[i]=='+') {
        		  b2+=brr[b1+1];
        		  b1++;
        	  }
        	  if(arr[i]=='-') {
        		  b2-=brr[b1+1];
        		  b1++;
        	  }
        	  if(arr[i]=='/') {
        		  b2/=brr[b1+1];
        		  b1++;
        	  }}
          System.out.println(b2);
	}

}
