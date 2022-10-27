package newpack;
import java.util.*;
public class samepos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner in=new Scanner(System.in);
         System.out.println("enter the string");
         String s=in.nextLine();
         char arr[]=s.toCharArray();
         char a='a';
         char b='A';
         int c=0;
         for(int i=0;i<arr.length;i++) {
        	if(a==arr[i]||b==arr[i]) {
        	c++;
        	}a++;
        	b++;
         }
         System.out.println(c);
	}

}
