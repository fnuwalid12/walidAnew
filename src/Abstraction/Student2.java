package Abstraction;

import java.util.ArrayList;

public class Student2 implements AllMethodsNeeded {

	@Override
	public double calcGPA(ArrayList<Double> grades) {
		double temp = 0; 
		for (double grade : grades) {
			temp += grade; 
		}
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
