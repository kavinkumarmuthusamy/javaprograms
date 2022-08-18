//   *delete the *
import java.util.*;
public class pro62 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
   Scanner in=new Scanner(System.in);
   System.out.println("enter the string:");
    String a=in.nextLine();
char arr[]=a.toCharArray();
char b='*';
    for(int i=0;i<arr.length;i++) {
    	 if(arr[0]==b) {
    		arr[0]=0;
    		arr[1]=0;	
    	}
      if(arr[arr.length-1]==b) {
    		arr[arr.length-1]=0;
    		arr[arr.length-2]=0;}
    	if(arr[i]==b&&arr[i-1]==0) {
    		arr[i]=0;
    		arr[i+1]=0;}
    	else if (arr[i]==b&&arr[i+1]==0){
    		arr[i]=0;
    		arr[i-1]=0;
    	}
    	else if(arr[i]==b&&arr[i-1]!=0&&arr[i+1]!=0) {
    		arr[i+1]=0;
    		arr[i-1]=0;
    		arr[i]=0;
    	}
    	}
    
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]!=0)
    
    System.out.print(arr[i]);
}}
}
 