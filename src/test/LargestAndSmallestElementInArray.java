package test;



public class LargestAndSmallestElementInArray {
	public static void main(String[] args) {
		int[] arr=new int[]{10,20,15,9,34};
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}

		}
		System.out.println("Largest array element is:: "+max);
		System.out.println("Smallest array element is:: "+min);


	}
	
}
