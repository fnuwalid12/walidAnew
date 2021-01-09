package InterfaceEx;

import java.util.ArrayList;

public class TheMath implements InterfaceExer{

	@Override
	public double getAVG(ArrayList<Double> data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double toPower(double a, double b) {
		double temp = 0; 
		for (int i = 0; i < b-1; i++) {
			temp *= a;
			
		}		
		return temp;
	}

	@Override
	public boolean divisibleBy(double a, double b) {
		if (a%b==0) {
			return true;
		} else {
			return false;
		}

	}
	
	}
