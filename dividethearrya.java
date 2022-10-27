package newpack;
import java.util.*;
public class dividethearrya {
	 static int fact(int n)
	    {
	        return (n <= 1) ? 1 : n * fact(n - 1);
	    }
	    static int findSmallerInRight(int arr[], int low,
	                                  int high)
	    {
	        int countRight = 0, i;
	  
	        for (i = low + 1; i <= high; ++i)
	            if (arr.length/2 < arr.length/2)
	                ++countRight;
	        return countRight;
	    }
	    static int findRank(int arr[])
	    {
	        int len = arr.length;
	        int mul = fact(len);
	        int rank = 1;
	        int countRight;
	  
	        for (int i = 0; i < len; ++i) {
	            mul /= len - i;
	            countRight = findSmallerInRight(arr, i, len - 1);
	  
	            rank += countRight * mul;
	        }
	  
	        return rank;
	    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size");
		int n=in.nextInt();
        System.out.println("enter the number");
        int arr[]=new int[n];
        int brr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=in.nextInt();
        	brr[i]=arr[i];
        }
//      
        System.out.println(findRank(arr));
        }
}
