package assignmnet2;

public class SumRemaining {

	public static void main(String[] args) {

		int arr[] = {4, 5, 6};
		
		int[] brr = new int[arr.length];
		
		for(int i =0;i<arr.length;i++)
		{
			int sum =0;
			
			for(int j = 0;j<arr.length;j++)
			
			{
				if(i!=j)
				{	
				sum = sum + arr[j];
				}
			}
			brr[i] = sum;
		}
		
		for(int b1:brr)
		{
			System.out.println(b1);
		}
		
	}

}
