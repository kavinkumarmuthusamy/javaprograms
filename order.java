package newp;
import java.util.*;
public class order {

	public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
          System.out.println("enter the number");
          String a=in.nextLine();
          int d1=0;
          int	res=0;
         String arr[]=a.split(" ");
          for(int i=0;i<arr.length;i++) {
        	  int d=0;
        	char b[]=arr[i].toCharArray();
        	for(int j=0;j<b.length;j++) {
          		int z=0;
          		char ch=b[j];
          		int c=ch;
          		for(int k=48;k<c;k++) {
          			z++;
          		}
          		d+=z;
          		d=d*10;
        	} 
        	if(d1==0) {
        		d1=d;
        	}
        	if(d1<=d) {
        		res=1;
        		d1=d;
        	}
        	if(d1>d) {
        		res=0;
        		break;
        	}
          }
          if(res==1) {
        	  System.out.println("true");
          }else {
        	  System.out.println("false");
          }
	}

}
