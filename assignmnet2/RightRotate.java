package assignmnet2;

public class RightRotate {

	public static void main(String[] args) {
		
		int j = 2;
		
		int[] arr = {1,2,3,4,5};
		
		int[] brr = new int[arr.length];
		
		for(int i = 0;i<arr.length;i++)
		{
			brr[i] = arr[arr.length-j];
			
			j = j - 1;
			
			if(j==0)
			{
				j = arr.length;
			}
		}
		
		for(int c:brr)
		{
			System.out.println(c);
		}
	}

}
