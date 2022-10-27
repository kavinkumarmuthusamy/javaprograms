//revers space in same
import java.util.*;
public class reversspaceinsame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner in=new Scanner(System.in);
         System.out.println("enter the string:");
         String a=in.nextLine();
        char arr[]=a.toCharArray();
        String ar[]=a.split(" ");
        String b="";
        String c="";
        char z=' ';
        int d=0;
        int space=0;
        for(int i=arr.length-1;i>=0;i--) {
        	if(z==arr[i]) {
        		continue;
        	}else {
            	  b+=arr[i];}
        }
//        System.out.println(b);
        char brr[]=b.toCharArray();
        for(int i=0;i<ar.length;i++) {
        	space=ar[i].length();
        	for(int j=d;j<space+d;j++) {
        		c+=brr[j];
        	}d+=space;
        	c+=" ";
        }
        System.out.println(c);
	}

}
