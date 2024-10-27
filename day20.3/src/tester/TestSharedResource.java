package tester;

import com.app.banking.JointBankAccount;

import runnable_tasks.CheckBalanceTask;
import runnable_tasks.UpdateTask;

public class TestSharedResource {

	public static void main(String[] args) {
		//create a joint account 
		JointBankAccount acct= new JointBankAccount(10000);
		//create task -- attach threads -- start thread
		Thread t1 = new Thread(new UpdateTask(acct),"c1");
		Thread t2 = new Thread(new CheckBalanceTask(acct),"c2");  //since it's a joint account, both customers are concurrently accessing same account
		//1: runnable ; c1,c2 : NEW
		t1.start();
		t2.start();		// 3: runnable(main,c1,c2)
		System.out.println("main waiting for child threads to complete");
		System.out.println("main over!!");
	}

}
