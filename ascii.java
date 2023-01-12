package diva;
import java.util.*;
public class ascii {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the char");
		String a=in.nextLine();
		char arr[]=a.toCharArray();
		 int c=0;
		 int res=1;
		 int d=arr[0];
		 d=d-48;
		 if(d%2==0){
			 res=0;
		 }
		 d=0;
		 String z="";
		  for(int i=0;i<arr.length;i++){		  
			  int b=arr[i];
			  b=b-48;
			  c+=b;
			  
			  d++;
	           if(res==0&&d>1&&c%2!=0){
	                	int y=arr[i+1];
						 y=y-48;
						 if(y%2!=0){
							 res=1;
						 }
					  z+=c;
					  c=0;
			   }  
			   else if(res==1&&d>1&&c%2==0){
					   int y=arr[i+1];
						 y=y-48;
						 if(y%2==0){
							 res=0;
						 }
					  z+=c;
					  c=0;
				   
			   }
			}
		if(c!=0){
			z+=c;
			c=0;
		}
			char brr[]=z.toCharArray();
			for(int i=0;i<brr.length;i++){
				int f=brr[i];
				f=f-48;
				c=(c+f)*10;
				System.out.println(f);
			}
			 c=c/10;
			
	System.out.println(c);

	}

}
