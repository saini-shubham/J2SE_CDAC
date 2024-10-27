package dustbin;

import java.util.Comparator;

public class Sort implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		int res = ((Double)o1.getPrice()).compareTo(o2.getPrice());
			if(res ==0) {
				return o1.getChasisNo().compareTo(o2.getChasisNo());
			}
		return res;
	}

}
