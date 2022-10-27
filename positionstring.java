package newpack;
import java.util.*;
public class positionstring {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String s=in.nextLine();
		char srr[]=s.toCharArray();
	    char a='a';
	    char b='A';
	    for(int i=0;i<srr.length;i++) {
	    	a='a';
	    	b='A';
	    	for(int j=0;j<26;j++) {
	    		if(srr[i]==a||srr[i]==b) {
	    			System.out.println(srr[i]+"  position  "+(j+1));
	    			break;
	    		}
	    		a++;
	    		b++;
	    	}
	    }
	    		
	}

}
