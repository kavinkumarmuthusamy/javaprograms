package newp;
import java.util.*;
public class countall {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
        String a=in.nextLine();
        char arr[]=a.toCharArray();
        int z=0,y=0,x=0,w=0,c=0;
        for(int i=0;i<arr.length;i++) {
        	int b=arr[i];
        	if((b<=90&&b>=65)||(b<=122&&b>=97)) {
        	if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
        		z++;
        	}else {
        		y++;
        	}}
        	if(b>=48&&57>=b) {
        		x++;
        	}
        	if(b==32) {
        		c++;
        	}
        }
        w=arr.length-(x+y+z+c);
        System.out.println("Vowles "+z);
        System.out.println("Consonants "+y);
        System.out.println("Numbers "+x);
        System.out.println("Special character "+w);
	}

}
