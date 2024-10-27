package com.app.banking;
import static utils.BankingVlidationRules.validateBalance;
import java.time.LocalDate;

import custom_exception.BankingException;
public class BankAccount {
	private int accNo;
	private String customerName;
	private AcType acctType;
	private LocalDate creationDate;		/*wrapper for holding the date(yyyy-mm-dd) and it is immutable
	 									*	No need of SDF parse method*/
	private double balance;
	public BankAccount(int accNo, String customerName, AcType acctType, LocalDate creationDate, double balance) {
		super();
		this.accNo = accNo;
		this.customerName = customerName;
		this.acctType = acctType;
		this.creationDate = creationDate;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public AcType getAcctType() {
		return acctType;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", customerName=" + customerName + ", acctType=" + acctType
				+ ", creationDate=" + creationDate + ", balance=" + balance + "]";
	}
	
	/*If you want add account info in the hashMap, which method you will have to override 
	for the correct working of hashAlgo?
	Ans: NONE(neither equals nor hashCode )since the key type of Map: java.lang>Integer
	which has already followed the contract*/
	
	/*What it will be in the case of composite primary key(accID+ifsc)?
	 *HM<AccountPK,BankAccount> 
	 *This is an example of customer ordering*/
	
	//Business logic methods: withdraw,deposit,find transfer
	
	public void deposit(double amount) {
		this.balance+=amount;
	}
	public void withdraw(double amount) throws BankingException {
		validateBalance(balance-amount);
		this.balance+=amount;
	}
	
	public void fundsTransfer(BankAccount dest,double transferAmount) throws BankingException {
		this.withdraw(transferAmount);
		dest.deposit(transferAmount);
		System.out.println("Fund transferred from source"+this.accNo+"into -->"+dest.accNo);
	}
	
	
	

}
