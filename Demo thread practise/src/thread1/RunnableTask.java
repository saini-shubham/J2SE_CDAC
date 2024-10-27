package thread1;

public class RunnableTask implements Runnable{

	@Override
	public void run() {
		System.out.println("started "+Thread.currentThread().getName());
		
		try {
			for(int i=0;i<10;i++) {
				System.out.println("started "+Thread.currentThread().getName()+" count" +i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			 System.out.println("err"+e+" in"+Thread.currentThread().getName());
		}
		
		System.out.println("ended"+Thread.currentThread().getName());
		
	}
	

}
