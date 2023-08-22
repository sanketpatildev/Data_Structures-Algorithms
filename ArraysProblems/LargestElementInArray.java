//Question
//For any given array find the maximum Integer element present in an array
//----------------------------------------------------------------------------
//Answer :-
public class LargestElementInArray {
	
	public static int findLargest(int [] arr)
	{
		int n= arr.length;
		int max=Integer.MIN_VALUE;
		for(int i=0; i<n; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) 
	{
		int[] arr=InputOfArray.takeInput();
		int largest=findLargest(arr);
		System.out.println("The Largest Element in Array is " + largest);
		
	}
}
