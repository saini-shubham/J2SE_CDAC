package nested_classes;

public class A {
	private int i;
	private static int j;
	static {
		j = 100;
	}

	public A(int i) {
		super();
		this.i = i;
	}

	// can you add non static methods in outer class? -> Yes, that's what you are
	// doing all this while
	public void outerShow() {
		// which data members ypu can access ? -> both static and non static
		System.out.println("i=" + i + "j" + j);

		// Can outer's instance method DIRECTLY access inner's method? -> NO
		// System.out.println("k"+k+"I"+I));
		// so to access inner's non static members -> create inner's instance
		B b1 = new B(234);
		System.out.println("k=" + b1.k + "I=" + B.I); /* B.I is legal but not 
													advised -> I is static data member*/
	}

	// can you add static methods in outer class? -> Yes,
	public static void outerStaticShow() {
		// which data members you can access directly? -> static members
		// directly means without instantiation
		// System.out.println("i="+i+"j"+j);
		System.out.println("j:" + j);

		// can outer's static method directly access inner's members ? -> k:no, I: B.I
		System.out.println("I=" + B.I);
		// System.out.println(k);
		A a1 = new A(123);
		A.B ref = a1.new B(213);
		ref.innerShow();

		// do it in one line
		A.B ref2 = new A(123).new B(213);
	}

	// add non static (inner) class
	class B {
		// can you add static as well as non static data members in the inner class ? ->
		// No, you can add only non static
		private int k;
		private static final int I = 123;
//		static {
//			I=12345;  //can't define static intializer block
//		}

		// can you add ctor to intialize the data members ? -> YES

		public B(int k) {
			this.k = k;
		}

		// can you add static method in the inner class? -> YES
		// can it access DIRECTLY(without instantion ) even the private members of the
		// outer class? -> YEs
		// why? -> with every inner class, javac implicilty passes Outer class instance:
		// OuterClassName.this
		// eg: A.this
		void innerShow() {
			System.out.println("inner show" + A.this.i + A.j + this.k + B.I);
		}

	}// inner class end

}
