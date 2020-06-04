package assignmnet2;

public class ZigZag {

	public static void main(String[] args) {
		
		int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int[] brr = new int[arr.length];
		
		int j = 1;
		
		int k = 0;
		
		for(int i =0; i <arr.length; i++)
		{
			if (i % 2 ==0)
			{
				brr[i] = arr[arr.length-j];
				j = j +1;
			}
			else
			{
				brr[i] = arr[k];
				k = k+1;
			}	
		}
		for(int a1:brr)
		{
			System.out.println(a1);
		}

	}

}
