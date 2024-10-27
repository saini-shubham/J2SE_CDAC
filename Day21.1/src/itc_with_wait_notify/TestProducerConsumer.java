package itc_with_wait_notify;

public class TestProducerConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		EmpUtils u = new EmpUtils();
		String[] nms = { "Producer", "Consumer" };
		
		Producer p1 = new Producer(u);// thrd doesn't exist
		Consumer c1 = new Consumer(u);
		
		Thread t2 = new Thread(c1, nms[1]);// consumer thrd---new
		t2.start();// rdy pool
		Thread t1 = new Thread(p1, nms[0]);// new
		Thread.sleep(10);
		t1.start();// rdy pool
		Thread.sleep(10);
		
		
		
		// Thread.sleep(5);
		System.out.println("Press enter to exit");
		System.in.read();//main thrd Blocked on i/p
		p1.stop();
		c1.stop();
		System.out.println("mian waiting for some time for the threadds to complete execution");
		t1.join(500);
		t2.join(400);
		System.out.println("main checking if thread are still alive if yes --> sending interrupt");
		if(t1.isAlive())
			t1.interrupt();
		if(t2.isAlive())
			t2.interrupt();
		System.out.println("main over...");
	}
	//Conlusion
	//run & observe --> now there is a sequence b/w producer & consumer.
	//one last problem is:
			//consumer got terminated but producer blocked 
			//on wait and main thread blocked on join  (assuming consumer is sleeping less)
			//producer got terminated but consumer blocked 
			//on wait and main thread blocked on join  (assuming producer is sleeping less)

}
