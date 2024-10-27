package inheritance;

public class Person {
		public String firstName;
		public String lastName;
		// Genertae constructor using-> Source
		public Person(String firstName, String lastName) {
			// super(); it will be automatically added by javac
			System.out.println("in person");
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
//		public Person() {
//			super();
//		}

		@Override
		public String toString() {
			return firstName +" "+ lastName;
		}
		public String getFirstName() {
			return this.firstName;
		}
		public String getLastName() {
			return lastName;
		}
		

}
