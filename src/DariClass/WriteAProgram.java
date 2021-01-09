package DariClass;

import java.util.ArrayList;

public class WriteAProgram {
	

	public static void main(String[] args) {

	
		// write a program that print 1 - 25 and print some text instead of some numbers
		// TEK for numbers that are divisible by 3
		// School for numbers that are divisible by 5
		// TEKSchool for numbers that are divisible by 5 and 3
		
		
		for (int i = 1; i <= 25; i++) {
			if (i%15==0 && i%3==0) {
				System.out.println("Shabnam Walid");
				continue;
			}
			if (i%3 == 0  ) {
				System.out.println("Walid");
				continue;
			} 
			if (i%5==0) {
				System.out.println("Shabnam");
				continue;
			}

			System.out.println(i);
			
		}
		
	System.out.println("-------------------------------------");
	
	for (int i = 1; i <=25; i++) {
		
		if (i%5==0 && i%3==0) {
			System.out.println("TEK SCHOOL");
			continue;
		} else if (i%5==0) {
			System.out.println("School");
			continue;
		} else if (i%3==0) {
			System.out.println("TEK");
			continue;
		}
		
		
		System.out.println(i);
		
	}
		
	System.out.println("--------------------------------");
	
	for (int j = 0; j <=17; j+=3) {
		System.out.println(j);
		
	}
		
	
	System.out.println("--------------------------------");	
	
	
	String [] data = { "one", "two", "three"};
	for (String i : data) {
		System.out.println(i);
	}
	
	System.out.println("--------------------------------");
	
	int [] data1 = { 1, 2, 3};
	for (int i : data1) {
		System.out.println(i);
	}
			
	System.out.println("--------------------------------");	
	
	String original = "this is a book";
	StringBuffer sb = new StringBuffer(original);
	System.out.println(sb.reverse());
	
	
	System.out.println("---------------------");
	
	String name = "This is non of your business";
	StringBuffer sb1 = new StringBuffer(name);
	System.out.println(sb1.reverse());
	
	
	System.out.println("---------------------");
	
	String o = "This is class";
	String rev = "";
	
	for (int i = o.length()-1; i>=0; i--) {
	
		rev += o.charAt(i);
	} System.out.println(rev);

	System.out.println("---------------------");
	
	
	String str1 = "This is a book";
	StringBuffer sb3 = new StringBuffer (str1);
	System.out.println(sb3.reverse());
	
	
	System.out.println("---------------------");
	
	String koko = "this is a very good place";
	String [] data6=koko.split(" ");
	for (String i:data6) {
		System.out.println(i);
	}
	
	System.out.println("------------------------------");
		
	int [][] int123 = new int [2][2];
	
	int123[0][0] = 1;
	int123[0][1] = 50;
	
	int123[1][0] = 200;
	int123[1][1] = 100;
	int max = int123 [0][0];
	int min = int123 [0][0];
	
	for (int i = 0; i < int123.length; i++) {
		for (int j = 0; j < int123[i].length; j++) {
			if (int123 [i][j]>max) {
		max=int123[i][j];
		
	} if (int123 [i][j]<min) {
		min=int123[i][j];
	}
	System.out.println(int123[i][j]);
		}
		System.out.println("This is the max " + max);
		System.out.println("This is the min " + min);
	}
	System.out.println("------------------------------");
	
	
	
	String walid = "This is a kir";
	
	System.out.println(walid.charAt(5));
	
	
	System.out.println("------------------------------");
	
	
	String walid1 = "This is a kir";
	boolean x = walid1.contains("o");
	System.out.println(x);
	
	System.out.println("------------------------------");
	
	String a = "This is not a game";
	boolean x1 = a.contains("Game");
	System.out.println(x1);
	
	System.out.println("------------------------------");
	
	
	String a1 = "This";
	String b = "this";
	boolean l = a1.equalsIgnoreCase(b);
	System.out.println(l);
	
	
	
	System.out.println("------------------------------");
	
	String str13 = "I have to go home";
	
	String x12 = str13.replaceAll("have", "can't");
	System.out.println(x12);
	
	
	
	
	String x3 = "   This is a book      ";
	
	String xab = x3.trim();
	String xao = x3.toLowerCase();
	System.out.println(xao);
	System.out.println(xab);
	
	
	System.out.println("------------------------------");
	
	
	String x4 = "Home,sweet,home,go, home";
	String [] xab1 = x4.split(",");
	for (String i : xab1) {
	System.out.println(i);	
	}
	
	System.out.println("------------------------------");
	
	String q = "This is a book";
	boolean w = q.startsWith ("T") && q.endsWith("k");
	System.out.println(w);
	
	System.out.println("------------------------------");
	
	String q1 = "Taco Taco";
	char [] w1= q1.toCharArray();
	for (char i12 : w1)
	
	
	System.out.println(i12);
	System.out.println("------------------------------");
	
	
	String abx = "This is class";
	//String rev1=""
	
	for (int i = abx.length()-1; i>=0; i--) {
	
	//rev1 += o.charAt(i);.
		
	System.out.println(abx.charAt(i));
	} 
	
	System.out.println("------------------------------");
	
	int wa = 500;
	int wo = 600; 
	int we = 1000;
	
	int max1 = 0;
	
	if (wa>wo && wa>we) {
		System.out.println(wa);
	} else if (wo>wa && wo>we) {
		System.out.println(wo);
	} else if (we>wa && we>wo) {
		System.out.println(we);
	}
	
	if (max1>wa) {
		max1=wa;
	} 
	if (max1>wo) {
		max1=wo;
	} if (max1>we) {
		max1=we;
		
	}
	System.out.println(max1);

	
	System.out.println("-------------------------");
	
	String data21 = "4www,tekschool.com$%";
	
	String str1234 = data21.replaceAll("[^a-zA-Z.]","");
	System.out.println(str1234);
	
	System.out.println("-------------------------");
	
	
	String rev8 = "This is a book";
	StringBuffer rev9 = new StringBuffer(rev8);
	System.out.println(rev9.reverse());
	
	
	System.out.println("-------------------------");
	
	// rev int
	
	int num7 = 1234;
	int rev7= 0;
	while (num7!=0) {
		rev7 = rev7*10+num7%10;
		num7 = num7/10;
		
	}System.out.println(rev7);
	
	
	
	
	System.out.println("-------------------------");
	
	
	
	
	String [] data4 = new String [7];
	
	data4[0] = "A";
	data4[1] = "B";
	data4[2] = "C";
	data4[3] = "D";
	data4[4] = "B";
	data4[5] = "C";
	data4[6] = "D";
	
	for (int i = 0; i < data4.length; i++) {
		for (int j = i+1; j < data4.length; j++) {
			if (data4[i].equals(data4[j])) {
				System.out.println("This is duplicate" + data4[i]);	
			
			}
				
		}
	}
	
	
	
	System.out.println("-----------------------");
	
	
	
	String str10 = "BDCDAA";
	
	for (int i = 0; i < str10.length(); i++) {
		for (int j = i+1; j < str10.length(); j++) {
			if (str10.charAt(i)==str10.charAt(j)) {
				System.out.println(str10.charAt(i));
			}
		}
		
	}
	
	System.out.println("-----------------------");
	
	
	char c11 = 'a';
	char c12 = 'b';
	System.out.println(c11);
	System.out.println(c11+c12);
	
	System.out.println("-----------------------");
	
	double d = 10.02;
	long I = (long) d;
	System.out.println(I);
	
	
	System.out.println("-----------------------");
	
	
	int op = 12;
	String strop = String.valueOf(op);
	System.out.println(strop + 123);
	
	
	System.out.println("-----------------------");
	
	
	String console = "123";
	
	int console1 = 100;
	
	int console2 = Integer.parseInt(console);
	
	System.out.println(console);
	System.out.println(console1);
	System.out.println(console2);
	
	System.out.println(console+console1);
	System.out.println(console1+console2);
	
	System.out.println("-----------------------");
	
	int x122 = 17;
	int x21 = 16;
	
	if (x122 == x21) {
		System.out.println("x1 is greater that x2");
	} if (x122 >= x21) {
		System.out.println("you are wrong");
	} else if (x122 <= x21){
		System.out.println("you are right");
	
	} else {
		System.out.println("x1 is not greater than x2");
	}
	
	
	System.out.println("==============================");
	
	int ip=10;
	do{
	System.out.println(ip);
	ip--;
	}while(ip>1);
	
	System.out.println("==============================");
	
	for (int ip1 = 10; ip1 > 0; ip1--) {
	System.out.println("loop" + ip1);
	}
	
	System.out.println("==============================");
	for (int p1 = 1; p1 <= 10; p1++) {
		System.out.println("loop" + p1);
	}
	
	
	System.out.println("========================================");
	
	int[] num0 = new int[5];
	
	num0[0] = 15;
	num0[1] = 15;
	num0[2] = 15;
	num0[3] = 15;
	num0[4] = 15;
	
	for (int i7 = 0; i7 < num0.length; i7++) {
		System.out.println(num0[i7]);	
	}
	//for (int i = 0; i < data2.length; i++) {
	//	System.out.print(data2[i] + " ");
	
	System.out.println("========================================");

	
	int[] num01 = {1,2,3,4,5};
	
	num01[0] = 15;
	num01[1] = 15;
	num01[2] = 15;
	num01[3] = 15;
	num01[4] = 15;
	
	for (int i6 = 0; i6 < num01.length; i6++) {
		System.out.println(num01[i6]);	
	}
	
	
	System.out.println("===============================");
	
	Object empData[] = new Object[3];
	empData[0] = "Tom";
	empData[1] = 25;
	empData[2] = 'm';
	
	for (int j1 = 0; j1 < empData.length; j1++) {
		System.out.println(empData[j1]);
	}
	
	System.out.println("===============================");
	
	
	ArrayList<String> arylis = new ArrayList<String>();
	
	arylis.add("home");
	arylis.add("123");
	arylis.add("home 123");
	arylis.add("homework");
	arylis.add("Yes 123");
	arylis.add("51846");
	
	for (int j15 = 0; j15 < arylis.size(); j15++) {
		System.out.println(arylis.get(j15));
	}
	
	
	System.out.println("--------------------------------");
	 
	
	
	
	
	
	
	
	
	
	
	
	
	}
}




	

