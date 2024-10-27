package thread2;

public class NewThread extends Thread{
	NewThread( String thrdName){
		super(thrdName);
		start();
		System.out.println("in ctor, invoked by "+Thread.currentThread());
	}
	
	@Override
	public void run() {
		System.out.println();
	}

}
