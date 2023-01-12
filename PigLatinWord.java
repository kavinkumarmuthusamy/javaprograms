package diva;
import java.util.*;
public class PigLatinWord {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		char arr[]=a.toCharArray();
		char brr[]= {'a','e','i','o','u'};
		int res=0;
		String z="";
		for(int i=0;i<brr.length;i++) {
			if(arr[0]==brr[i]) {
				res=1;
			}
		}
		if(res==1) {
			z=a+"yay";
		}
		else {
			for(int i=0;i<brr.length;i++) {
				for(int j=0;j<a.length();j++) {
				if(arr[j]==brr[i]) {
					res=j;
					break;
				}
				}
			}
			if(res>0) {
				z=a.substring(res,a.length())+a.substring(0,res)+"ay";
			}
			else {
				z="Not Possible to generate Pig Latin Word";
			}
		}
		System.out.println(z);
	}

}
