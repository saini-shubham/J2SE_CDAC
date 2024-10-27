//Question (375)
//Maximum and Minimum Element in an Array

package arrays;

public class Array1 {
	
	//Class Pair is used to return to values from the method
	public static class Pair{
		int min;
		int max;
	}
	public static Pair getMinMax(int arr[], int n) {
		Pair minmax=new Pair();
		if(n==1) {
			minmax.min=arr[0];
			minmax.max=arr[1];
		}
		
		if(arr[0]>arr[1])
			minmax.max=arr[0];
		else
			minmax.min=arr[0];
		for(int i=2;i<arr.length;i++) {
			if(arr[i]<minmax.min)
				minmax.min=arr[i];
			if(arr[i]>minmax.max)
				minmax.max=arr[i];
			
		}
		return minmax;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,21,324,56,7,78,54,324,32,9};
		int n=arr.length;
		
		Pair minmax=  getMinMax(arr, n);
		
		System.out.println("Min"+minmax.min+"Max"+minmax.max);
	}
	

}
