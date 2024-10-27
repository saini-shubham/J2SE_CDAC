package itc_with_sleep;

public class EmpUtils {
	private boolean dataReady;
	private Emp e;

	public synchronized void writeData(Emp ref) throws Exception {
		System.out.println("w entered --- " + Thread.currentThread().getName());
		while (dataReady)
			Thread.sleep(30); // p blocked on sleep, inside the monitor
		// produce data
		e = ref;
		System.out.println("Write Data " + e);
		System.out.println("w exited --- " + Thread.currentThread().getName());
		dataReady = true;  //change the flag when writing is done
	}

	public synchronized Emp readData() throws Exception {
		System.out.println("r entered --- " + Thread.currentThread().getName());
		while (!dataReady) // till the time data is not ready, get blocked
			Thread.sleep(100);
		// consume data
		System.out.println("Read  Data " + e);
		System.out.println("r exited --- " + Thread.currentThread().getName());
		dataReady=false;
		return e;
	}

}
