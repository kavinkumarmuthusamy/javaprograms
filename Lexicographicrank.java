package newpack;
import java.util.*;
public class Lexicographicrank {

//	public static void main(String[] args) {
//		Scanner in=new Scanner(System .in);
//		System.out.println("enter the string");
//		String a=in.nextLine();
//		char arr[]=a.toCharArray();
//		System.out.println("enter the string");
//		String b=in.nextLine();
//		int c=0;
//		String e="";
//		int y=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				for(int k=0;k<arr.length;k++) {
//					String d="";
//				    if(i!=j&&i!=k&&j!=k) {	                    
//				    	d+=arr[i];
//				    	d+=arr[j];
//				    	d+=arr[k];
//	                    	 c++;
//				    if(d.equals(b)) {
//				    	e+=d;
//				    	y=c;
//				    	break;
//				    }}
//				}
//			}
//		}
//		System.out.println(e+" ffggfg "+y);
//	}
	 static int fact(int n)
	    {
	        return (n <= 1) ? 1 : n * fact(n - 1);
	    }
	    static int findSmallerInRight(String str, int low,
	                                  int high)
	    {
	        int countRight = 0, i;
	  
	        for (i = low + 1; i <= high; ++i)
	            if (str.charAt(i) < str.charAt(low))
	                ++countRight;
	  
	        return countRight;
	    }
	    static int findRank(String str)
	    {
	        int len = str.length();
	        int mul = fact(len);
	        int rank = 1;
	        int countRight;
	  
	        for (int i = 0; i < len; ++i) {
	            mul /= len - i;
	            countRight = findSmallerInRight(str, i, len - 1);
	  
	            rank += countRight * mul;
	        }
	  
	        return rank;
	    }
	    public static void main(String[] args)
	    {
			Scanner in=new Scanner(System .in);
	    	System.out.println("enter the string");
			String str=in.nextLine();
	        System.out.println(findRank(str));
	    }

}
