package runnable_tasks;

import com.app.banking.JointBankAccount;
import static java.lang.Thread.currentThread;

public class CheckBalanceTask implements Runnable {
	private JointBankAccount jointAccount;

	public CheckBalanceTask(JointBankAccount jointAccount) {
		super();
		this.jointAccount = jointAccount;
	}

	@Override
	public void run() {
		System.out.println(currentThread() + " started");
		try {
			synchronized (jointAccount) {
				while (true) {
					double balance = jointAccount.checkBalance();
					if (balance != 10000) {
						System.out.println("Error, invalid balance !!!!!!!!!!!");
						System.exit(-1);
					}

					Thread.sleep(123);
				}
			}
		} catch (Exception e) {
			System.out.println(currentThread() + "got error " + e);
		}
		System.out.println(currentThread() + "over");

	}
}
