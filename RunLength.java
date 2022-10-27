package newpack;
import java.util.*;
public class RunLength {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String s=in.nextLine();
        char srr[]=s.toCharArray();
        int c=1;
        s="";
        for(int i=0;i<srr.length-1;i++) {
        	if(srr[i]==srr[i+1]) {
        		c++;
        	}else {
        		s+=srr[i];
        		s+=c;
        		c=1;
        	}
        }
        s+=srr[srr.length-1];
		s+=c;
        System.out.println(s);
	}

}
