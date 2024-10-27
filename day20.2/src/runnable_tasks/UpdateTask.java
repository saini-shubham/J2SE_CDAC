package runnable_tasks;

import com.app.banking.JointBankAccount;
import static java.lang.Thread.currentThread;


public class UpdateTask implements Runnable {
	private JointBankAccount jointAccount;
	public UpdateTask(JointBankAccount jointAccount) {
		super();
		this.jointAccount = jointAccount;
	}

	@Override
	public void run() {
		System.out.println(currentThread() + " started");
		try {
			while (true) {
				jointAccount.updateBalance(5000);
				Thread.sleep(250);
			}
		} catch (Exception e) {
			System.out.println(currentThread() + "got error " + e);
		}
		System.out.println(currentThread() + " over");

	}

}
