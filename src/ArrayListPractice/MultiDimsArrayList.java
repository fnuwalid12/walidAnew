package ArrayListPractice;

import java.util.ArrayList;

public class MultiDimsArrayList {

	public static void main(String[] args) {


	ArrayList<ArrayList<Integer>> tableOf_theNumbers = new ArrayList<ArrayList<Integer>>();
	
	// row 1
	ArrayList<Integer> row1 = new ArrayList<Integer>();
	row1.add(11);
	row1.add(12);
	row1.add(13);
	row1.add(14);
	row1.add(15);
	row1.add(16);
	row1.add(17);
	row1.add(18);
	
	ArrayList<Integer> row2 = new ArrayList<Integer>();
	row2.add(21);
	row2.add(22);
	row2.add(23);
	row2.add(24);
	row2.add(25);
	row2.add(26);
	
	ArrayList<Integer> row3 = new ArrayList<Integer>();
	row3.add(31);
	row3.add(32);
	row3.add(33);
	row3.add(34);
	row3.add(35);
	row3.add(36);
	row3.add(37);	
	
	tableOf_theNumbers.add(row1);
	tableOf_theNumbers.add(row2);
	tableOf_theNumbers.add(row3);
	
	for (int i  = 0; i < tableOf_theNumbers.size(); i++) {
		System.out.println(tableOf_theNumbers.get(i));
		
	}
	
	}

}
