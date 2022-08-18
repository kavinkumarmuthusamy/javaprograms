package newp;
import java.util.*;
public class pro1 {

	public static void main(String[] args) {
	   Scanner in=new Scanner(System.in);
	  System.out.println("enter the string ");
      String a=in.nextLine();
      char arr[]=a.toCharArray();
      String b="!@#$%^&* ";
      char brr[]=b.toCharArray();
      int res=0;
      String c="";
      String d="";
      int e=0;
      int f=0;
      for(int i=arr.length-1;i>=0;i--) {
    	  res=0;
    	  for(int j=0;j<brr.length;j++) {
    	  if(arr[i]==brr[j]) {
    		  res=1;
    	  }
    	 }
    	  if(res==0) {
    		  c+=arr[i];
    	  }
      }
   char crr[]=c.toCharArray();
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<brr.length;j++) {
    	  if(arr[i]==brr[j]) {
    		  e=i;
            for(int k=d.length();k<e;k++) {
            	d+=crr[k-f];
            }
            f++;
      	  d+=arr[i];
    	  }
    	  }
      }
      for(int i=e+1;i<arr.length;i++) {
    	  d+=crr[i-f];
      }
      System.out.println(d);
	}

}
