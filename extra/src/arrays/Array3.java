package arrays;

public class Array3 {
	
	    public static  int maxSubArray(int[] nums) {
	        int sum=0;
	        for(int i=0;i<nums.length-1;i++){
	         sum =nums[0];
	        if((sum+a[i+1])>sum)
	            sum=sum+a[i+1];
	        else
	            break;
	        return sum;
	           
	      
	    }}
	    public static void main(String [] args) {
	    	
	    }

}
