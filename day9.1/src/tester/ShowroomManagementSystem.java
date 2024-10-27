package tester;

import java.util.Scanner;

import com.app.core.Vehicle;

import custom_exception.ShowroomCapacityException;
import static utils.VehicleValidationRules.validateAllInputs;

public class ShowroomManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the showroom capacity");
			Vehicle[] vehicles = new Vehicle[sc.nextInt()];
			int counter = 0;
			boolean exit = false;
			while (!exit) {
				System.out.println("options: 1) Add new Vehicle 2) Display showroom in info 10)exit");
				System.out.println("Chooose options");
				try {
					switch (sc.nextInt()) {
					case 1:
						if (counter < vehicles.length) {
							System.out.println("Enter vehicle details: chasis no, color, price, manufacture date");
							Vehicle vehicle = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(),
									vehicles);
							// Vehicle
							// vehicle=validateAllInputs(sc.next(),sc.next(),sc.nextDouble(),sc.next(),vehicles);
							// if control comes here -> all good->pass refernce

							vehicles[counter++] = vehicle;
							System.out.println("Vehicle added");
						} else
							// throw new VehicleValidationException(.) -> but logically here no validation
							// violation so better to create an another customer exception
							throw new ShowroomCapacityException("Capacity full");
						break;

					case 2:
						System.out.println("Showroom info");
						for (Vehicle v : vehicles)
							if (v != null)
								System.out.println(v);
						break;
					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// read off pending inputs from the scanner till new line
				sc.nextLine();
			}
		} // automatically sc.close()

		System.out.println("Main over");
	}
}
