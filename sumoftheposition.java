package newp;
import java.util.*;
public class sumoftheposition {

	public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
          System.out.println("enter the string");
          String a=in.nextLine();
          char arr[]=a.toCharArray();
          int c=0;
          int d=0;
          for(int i=0;i<arr.length;i++) {
        		  char b='a';
        		  char z='A';
        		  for(int j=1;j<26;j++) {
        			  if(b==arr[i]) {
        			  c+=j;
        			  System.out.println(j);
                      if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
        				 d+=j; 
        			  }
        			  break;
        			  } 
        			  if(z==arr[i]) {
            			  c+=j;
            			  System.out.println(j);
                          if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U') {
            				 d+=j; 
            			  }
            			  break;
            			  } 
        			  z++;
        			   b++;
        	  }
          }c=c-d;
          System.out.println(c);
	}

}
