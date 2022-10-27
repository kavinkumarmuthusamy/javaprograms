package newpack;
import java.util.*;
public class nextleter {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string ");
        String a=in.nextLine();
	    System.out.println("enter the number of words ofter");
	    int b=in.nextInt();
        String d="";
        char arr[]=a.toCharArray();
        for(int i=0;i<a.length();i++) {
        	char c=arr[i];
        	for(int j=0;j<b;j++) {
         if(c!='z'&&c!='Z') {
         	c++;
     	}
         else if(c=='z') {
         	c='a';
          }
         else if(c=='Z') {
        	 c='A';
        	 }
         }
         d+=c;
        }
        System.out.println(d);
	}

}
