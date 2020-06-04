package assignmnet2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SuperElement {

	public static void main(String[] args) {
		
		Set<Integer> a1 = new LinkedHashSet<>();
		int arr[] = {1, 5, 3, 6};
		
		for(int i = 0; i<arr.length;i++)
		{
			int count = 0;
			for(int j = 0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					count = count + 1;
				}
			}
			if(count>=2) 
			{
				a1.add(arr[i]);
			}
		}
		if(a1.isEmpty())
		{
			System.out.println("No Super elements ");
		}
		else
		{
			a1.forEach(d1->{
				System.out.println(d1);
			});
		}

	}

}
