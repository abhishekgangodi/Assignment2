package assignmnet2;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LeaderElement {

	public static void main(String[] args) 
	
	{
		
		int count;
		
		Set<Integer> a1 = new HashSet<>();
		
		int[] arr = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
		
		int n = arr.length/2;
		
		
		for(int i = 0 ; i <arr.length;i++)
		{
			count = 1;
			
		 for(int j = i + 1 ; j<arr.length;j++)
		 {
			 if(arr[i]==arr[j])
			 
			 {
				 count = count +1;
			 }
			 
		 }
		 if(count>n)
		 {
			a1.add(arr[i]); 
		 }
		 
		
		}

		//boolean result = (Collections.max(a1) != null);
					
			if(a1.isEmpty())				
			{
				System.out.println("element doesnt exist");
				
			}
			else
			{
				int d1 = Collections.max(a1); 

				System.out.println(d1);				

			}		
		
	}

}
