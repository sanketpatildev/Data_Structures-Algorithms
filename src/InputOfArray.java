
import java.util.Scanner;

public class InputOfArray {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] takeInput() {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int[n];

			for(int i=0;i<n;i++) {
				System.out.println("Enter element at "+ i +"th index");
				arr[i]=s.nextInt();
			}
			return arr;
	}

	public static void main(String[] args) {
//	Scanner s= new Scanner(System.in);
//	int n=s.nextInt();
//	int [] arr=new int[n];
//
//		for(int i=0;i<n;i++) {
//			System.out.println("Enter element at "+ i +"th index");
//			arr[i]=s.nextInt();
//		}
		
//		for(int i=0;i<n;i++) {
//			System.out.println(arr[i]);
//		}
		
		int[] arr=takeInput();
		printArray(arr);
	}

}
