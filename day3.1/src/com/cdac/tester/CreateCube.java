package com.cdac.tester;
import com.cdac.core.Box;
import java.util.Scanner;

public class CreateCube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of cube");
		Box cube = new Box(sc.nextDouble());
		System.out.println(cube.getBoxDims());
		System.out.println("Vol "+cube.getVolume());
		Box dummyBox=new Box();
		System.out.println(dummyBox.getBoxDims());
		sc.close();

	}

}
