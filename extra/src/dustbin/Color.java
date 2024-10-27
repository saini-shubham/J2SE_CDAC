package dustbin;

public enum Color {
	//set of related (RESTICTED) self typed constants
	//public static final Color WHITE,SILVER....
	WHITE(1000), SILVER(2000), BLACK(3000), GREY(2500), RED(3500);//price is dependent on color
																	// can also add multiple : say dependent on color and availablity
	//state
	private int additionalCost;			

	private Color(int additionalCost) 				//if you remove private, it will appear in decompile code again
	{
		this.additionalCost = additionalCost;
	}//after adding ctor ->see decompile code-> you will not see an another ctor but same ctor with three parameters
	
	//we need a getter to get the additional the cost associated with the cost
	public int getAdditionalCost() {
		return additionalCost;
	}
	
	
	@Override
	public String toString(){
		return name().toLowerCase()+"@"+additionalCost ;
	}
	
}
