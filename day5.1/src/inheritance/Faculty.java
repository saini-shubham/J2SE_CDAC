package inheritance;

public class Faculty extends Person {
	private int expInYears;
	private String sme;
	public Faculty(String fn,String ln,int expInYears,String sme) {
		super(fn,ln);
		System.out.println("in faculty");
		this.expInYears=expInYears;
		this.sme=sme;
		}
	@Override
	public String toString() {
		return "Name"+super.toString()+" having experience of"+expInYears+" expert in"+sme;
	}
	
	//add new functionality teach: lastname teaching for years in domain
	public void teach() {
		System.out.println(getLastName()+" teaching for "+expInYears);
		//System.out.println(toString()+"teaching for"+expInYears);
	}
}
