package diva;
import java.util.*;
public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the size");
  int n=in.nextInt();
  
  String arr[]=new String[n];
  for(int i=0;i<n;i++) {
	  System.out.println("Enter the string");
	  arr[i]=in.next();
  }
  in.nextLine();
  System.out.println("Enter the string 2");
  String b=in.nextLine();
  String brr[]=b.split("[ ]");
 int c=0;
 
 for(int i=0;i<brr.length;i++) {
	 for(int j=0;j<n;j++) {
	     if(brr[i].equals(arr[j])) {
	    	 System.out.println(arr[j]);
	    	 c++;
	     }
	 }
 }
 System.out.println(c+" times come");
	}

}
