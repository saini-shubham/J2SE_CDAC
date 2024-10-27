package thread1;

public class Tester {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());
		RunnableTask task = new RunnableTask();
		Thread t1 = new Thread(task,"one");
		Thread t2 = new Thread(task,"two");
		Thread t3 = new Thread(task,"three");
		Thread t4 = new Thread(task,"four");
		t1.start();
		t2.start();
		t3.start();
		t4.start();		
		for(int i=0;i<10;i++) {
			System.out.println("executing "+Thread.currentThread().getName()+" count"+i);
			Thread.sleep(1500);
		}
	}
	}
