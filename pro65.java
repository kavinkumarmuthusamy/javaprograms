import java.util.*;
public class pro65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);
    System.out.println("enter the number of number:");
    int n=in.nextInt();
    System.out.println("enter the arrya:");
    int a[]=new int[n];
    int b[]=new int[n];
    int c[]=new int[n];
    int d=0;int e=0;
    for(int i=0;i<n;i++) {
    	a[i]=in.nextInt();
    }
    for(int i=0;i<n;i++)
    {
    	if(a[i]%2==0)
    	{
    		System.out.println(a[i]);
    	}
    }
    for(int i=0;i<n;i++)
    {
    	if(a[i]%2!=0)
    	{
    		System.out.println(a[i]);
    	}
    }
	}

}
