package Stacks;

public class Customer {
	private int id;
	private String name;
	private String address;
	public Customer(int id,String name,String address) {
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	public Customer() {
		this(0,null,null);
	}
	@Override
	public String toString() {
		return "Customer id:"+id+" Name:"+name+" Address:"+address;
	}


}
