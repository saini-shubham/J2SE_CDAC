//choclate problem

package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array5 {

    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        //n=array length
        //m=number of students
    	int 
        long min = Long.MAX_VALUE;
        if(n==0 || m==0)
            return 0;
        if(n<m)
            return 0;
        Collections.sort(a);
       Iterator<Long>=Iterator.a;
        for(long i: a) {
        	if (a[(int) (i+(m-1))]-a[i]<min) {
				
			}
        	
        }
        a.stream().forEach(p-> p. );
//        for(long i=0;i<n-1;i++){
//            if((a[i+(m-1)]-a[i]<min)
//                min=a[i+(m-1)]-a[i];
//        }
        return min;
        
    }
    
        
    


	}

}
