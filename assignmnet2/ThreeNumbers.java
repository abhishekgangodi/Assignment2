package assignmnet2;

public class ThreeNumbers {

	public static void main(String[] args) {
		
		int arr[] = {0, 1, 0, 2, 0, 0, 2, 1, 2, 0};
		int brr[] = new int[arr.length];
		int count= 0;
		int j = 1;
		int k =0;
		for(int i = 0; i < arr.length;i++)
		{
			if(arr[i]==0)
			{
				brr[count] = arr[i];
				//k = k +1;
				count = count + 1;
			}
			
		}
		for(int i = 0; i < arr.length;i++)
		{
			if(arr[i]==1)
			{
				brr[count] = arr[i];
				count = count + 1;
			}
			else if(arr[i]==2)
			{
				
					
				brr[arr.length-j] = arr[i];
				j = j + 1;
				
			}
			else 
			{
			continue;	
			}
			
		}
		for(int i : brr)
		{
			System.out.print(i);
			
		}
		
	}

}
