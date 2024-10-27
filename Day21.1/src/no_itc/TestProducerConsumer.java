package no_itc;

public class TestProducerConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		EmpUtils u = new EmpUtils();
		String[] nms = { "Producer", "Consumer" };
		// produce task ---thrd --strt
		Producer p1 = new Producer(u);// thrd doesn't exist
		// Thread(Runnable inst,String nm)
		Thread t1 = new Thread(p1, nms[0]);// new
		t1.start();// rdy
		Thread.sleep(10);    //to ensure producer thread starts first
		Consumer c1 = new Consumer(u);
		// Thread(Runnable inst,String nm)
		Thread t2 = new Thread(c1, nms[1]);// consumer thrd---new
		t2.start();// rdy pool
		// Thread.sleep(5);
		System.out.println("Press enter to exit");    
		System.in.read();//main thrd Blocked on i/p
		p1.stop();
		c1.stop();
		t1.join();
		t2.join();
		System.out.println("main over...");
	}
	
	//Conclusion: 
	//Either prodcuer writing multiple time(data over writing) or consumer reading multiple times(stale data).
	//Ideally it should be like, prodcuer write the data, then consumer read the data, then again producer write and then
	///again consumer reads--> this sequencing b/w producer & consumer thread is missing.

}
