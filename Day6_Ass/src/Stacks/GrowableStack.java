package Stacks;

public class GrowableStack extends FixedStack {
	@Override
	public void push(Customer ref) {
		//if(top<STACK_SIZE) // this will work only for first time and not when we have resized the array
		if(top<customers.length-1)
			customers[++top]=ref;
		else {
			Customer[] temp=new Customer[customers.length*2];
			for(int i=0;i<customers.length;i++)  //why for loop and why not for each ?
												//we need to copy references of earlier to new array -> for loop
				temp[i]=customers[i];
				customers=temp;
				customers[++top]=ref;
		}
		
		//you are writing customers[++top]=ref; two times -> not a clear code -> can't we just check if array is full or not ?
//		if(top == customers.length-1)  //simply checking if array is full then create a new array
//		{
//			Customer[] temp=new Customer[customers.length*2];
//			for(int i=0;i<customers.length;i++) 
//				temp[i]=customers[i];
//				customers=temp;
//		}
//		customers[++top]=ref;	
		
	}	
}
