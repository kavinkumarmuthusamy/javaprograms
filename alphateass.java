package newp;
import java.util.*;
public class alphateass {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String a=in.nextLine();
        char arr[]=a.toCharArray();
        int brr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i]>arr[j]) {
        		 char d=arr[i];
        		 arr[i]=arr[j];
        		 arr[j]=d;
        		 }
        	}
        }
        String e="";
        for(int i=0;i<arr.length;i++) {
        	e+=arr[i];
        }
        System.out.println(e);
	}

}
