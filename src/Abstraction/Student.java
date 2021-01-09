package Abstraction;

import java.util.ArrayList;

public class Student implements AllMethodsNeeded{

	@Override
	public double calcGPA(ArrayList<Double> grades) {
		double temp = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < grades.size(); i++) {
			temp += grades.get(i);
		}
		return temp;
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
