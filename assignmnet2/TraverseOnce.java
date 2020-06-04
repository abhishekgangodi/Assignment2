package assignmnet2;

public class TraverseOnce {

	public static void main(String[] args) {
		
		int j = 1;
		
		int k = 0;
		
		int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		
		int[] brr = new int[arr.length];
		
		for(int i = 0;i<arr.length;i++)
			
		{
			if(arr[i]==0)
			{
				brr[k] = arr[i];
				k = k + 1;
			}
			else
			{
				brr[arr.length-j] = arr[i];
				j = j + 1;
			}
		}
		
		for(int i:brr)
		{
			System.out.print(i);
		}
		

	}

}
