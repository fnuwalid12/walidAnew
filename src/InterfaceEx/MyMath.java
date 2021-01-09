package InterfaceEx;

import java.util.ArrayList;

public class MyMath implements InterfaceExer{

	@Override
	public double getAVG(ArrayList<Double> data) {
		double temp = 0;
		for (double d: data) {
			temp += d;
		}
		return temp/data.size();
	}

	@Override
	public double toPower(double a, double b) {
			
		return Math.pow(a, b);
	}

	@Override
	public boolean divisibleBy(double a, double b) {
 
		return false;
	}

}
