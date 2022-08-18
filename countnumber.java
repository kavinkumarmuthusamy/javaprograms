package newp;
import java.util.*;
public class countnumber {

	public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("enter the string");
       String a=in.nextLine();
       char arr[]=a.toCharArray();
       int count=0;
       String d="";
       for(int i=0;i<arr.length;i++) {
    	char ch=arr[i];
    	int c=ch;
    	if(c<=57&&48<=c) {
    		d+=arr[i];
    	}
    	if(42==c||43==c||45==c||47==c) {
    		d+=arr[i];
    		count++;
    	}
       }
       System.out.println(count);
      System.out.println(d);
	}

}
