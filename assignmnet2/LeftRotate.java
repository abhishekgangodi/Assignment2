package assignmnet2;

import java.util.Scanner;

public class LeftRotate {

	public static void main(String[] args) {
		
	
		
		int[] arr = {1,2,3,4,5,6,7};
		
		int[] brr = new int[arr.length];
		
		int j = 3;		
		for(int i = 0; i<arr.length;i++)
		{	
			brr[i] = arr[j];
			j = j + 1;
			if(j==arr.length)
		    {
		    	j = 0;
		    }
		    
		}
		for(int c:brr)
		{
			System.out.println(c);
		}
	}

}
