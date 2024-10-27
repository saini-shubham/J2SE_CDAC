// Array of references

package tester;
import java.util.Arrays;
import java.util.Scanner;

import com.cdac.core.Box;

/*
 * Accept no of boxes to make from user.
 * Accept dims from user. 
 * Display box dims , volume : for-each
 */

public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of boxes");
		Box[] boxes;
		//System.out.println(boxes);
		boxes=new Box[sc.nextInt()];//10 , [Lcom.cdac.core.Box , 1 array obj.
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter box dims : w d h");
			boxes[i]=new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		}
		
		//display details
		for(Box b : boxes)
		{
			System.out.println(b.getBoxDims());
			System.out.println("vol = "+b.getVolume());
		}
		System.out.println("cls loaded "+boxes.getClass());
		System.out.println("cls loaded "+boxes[0].getClass());
		System.out.println(Arrays.toString(boxes));
		
		// Double the width for all boxes having volume > 100
		for (Box b:boxes) //b=boxes[0]....b=boxes[n-1]
		{
			if(b.getVolume()>100)
				// b.width*=2; --> compile time error as width is private
				b.setWidth(b.getWidth()*2);
			/* NOTE: you can never use for-each loop for modifying the arrays
			 *  but we can modify the state of objects pointed to those array objects. 
			*/
		}
			
			
			sc.close();

	}

}
