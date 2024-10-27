package tester;

import utils.SynchroUtils;

public class Test7 {
	 private static boolean exit;
	public static void main(String[] args) throws Exception{
	//	 boolean exit=false;
		SynchroUtils u1 = new SynchroUtils();
		Thread t1 = new Thread(()  -> {
				while (!exit)
					SynchroUtils.test1();//static synch method

			
		}, "t1");
		Thread t2 = new Thread(() -> {
				while (!exit)
					synchronized (SynchroUtils.class ) // argument should be --> where lock have to be applied --> but never say lock is applied at class level
					{
						SynchroUtils.test3();//static un sync method
					}
					
			
		}, "t2");//NEW
		t1.start();
		t2.start();
		System.out.println("Press enter to exit");
		System.in.read();//main thrd : blocked on i/p : till any key press
		exit=true;
		System.out.println("main waiting for child thrds to complete exec");
		t1.join();
		t2.join();
		System.out.println("main over...");

	}

}

/*
Conc:
unssync static as well as non sttaic methods works in similar manner.
sync non static method -> lock is applied actually at the instance of the class.
sync static lock is again applied to object but object of java.lang.object  */