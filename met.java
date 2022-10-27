package newpack;
import java.util.*;
public class met {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String input1=in.nextLine();
		String input2=input1.toUpperCase();
		   String srr[]=input2.split(" ");
		   int z=0;
		   for(int i=0;i<srr.length;i++){
			   char arr[]=srr[i].toCharArray();
			   int b=arr.length-1;
			   int a=0;
			   for(int j=0;j<arr.length/2;j++){
	             int c=arr[j]-64;
				 int d=arr[b]-64;
				 a+=c-d;
				 System.out.println(c+"    "+d);
				 if(a<0) {
					 
					 a=-1*a;
					
				 }
				 b--;
			   }
			   System.out.println(a);
			   if(arr.length%2!=0){
	               int c=arr[b]-64; 
				   a+=c;
			   }
			   z=a;
			   System.out.println(a);
			    
		   }
		  System.out.println(z);
	}

}
