package ArrayListPractice;

import java.util.Arrays;

public class MethodNames {

	public String getCountryCapital(String countryName){
		//System.out.println("get Country Capital");
		if(countryName ==("India")){
		return "New Delhi"; //return inside if statement
		}
		else if(countryName == ("USA")){
		return "Washignton DC";
		}
		else if(countryName == ("Russia")){
		return "Moscow";
		}
		return null;} //returns Nothing—mostly in If statement	

	
	
		public boolean isUSCitizen(String personName){
	
		if(personName == ("Naveen")){
		return false;
		}
		else if(personName ==("Elena")){
		return true;
		}
		return false;

		}
		
		
		static int num;
		static String mystr;
		static{
		num = 97;
		mystr = "Static keyword in Java"; }
		
		
	public static void main(String[] args) {
		
		
	
	MethodNames obj = new MethodNames ();
	MethodNames obj2 = new MethodNames ();
	//obj.getCountryCapital("Russia");
	
	System.out.println(obj.getCountryCapital("India"));
	
	System.out.println(obj2.isUSCitizen("Naveen"));
	
	
	System.out.println("Value of num: "+num);
	System.out.println("Value of mystr: "+mystr);
	
	
	System.out.println("-0000000000000000000000000000000000000000");
			
	String s2 = "your total amount is 1500 USD";
	System.out.println(s2.substring(21, s2.indexOf("USD")-1)); //give beg and end index
	System.out.println(s2.substring(0)); //from beginning till end
	
	System.out.println("---------------------------------------");
	
	int op = 15;
	int op1 = 30;
	
	int x11 = op + op1;
	op = x11 - op1;
	op1 = x11- op ;
	
	System.out.println("this is now value of op1:" + op);
	System.out.println("this is now value of op:" + op1);
	
	System.out.println(x11);
	
	System.out.println("---------------------------------------");
	
	String xp = "I love you";
	String xp1 = "I hate you";
	
	xp = xp + xp1;
	xp1=xp.substring(0,(xp).length()-xp1.length());
	xp=xp.substring(xp1.length());
	
	
	//y=x.substring(0,(x).length()-y.length());
	//x=x.substring(y.length());

	
	System.out.println("this is now value of xp:" + xp);
	System.out.println("this is now value of xp1:" + xp1);
	
	
	System.out.println("----------------------");
	
	String given="wefeqf878979797fewfewrf879797efds&^&^*^*^";
	String replaced=given.replaceAll("[a-zA-Z]", "");
	int alphaChar=given.length()-replaced.length();
	System.out.println(alphaChar);

	String abd = "iloveyouIyoufuckyouwherethefuckareyou24523497979&^%$#*^*^*^*^";
	String changed=abd.replaceAll("[a-zA-Z]", "");
	int aChar=abd.length()-changed.length();
	System.out.println(aChar);
			
			
	System.out.println("----------------------");
	
	
	int a = 12;
	
	if (a%2!=0) {
		System.out.println("This is odd number" + a);
	} else {
		System.out.println("This is not odd number" + a);
	}
	
	
	System.out.println("-----------------------");
	
	String ax= "You Made it to Tek School Interview Session";

	System.out.println(ax.substring(35));
	String [] words=ax.split(" ");

	System.out.println(words.length);

	for (String string : words) {
	System.out.println(string);
	}

	
	System.out.println("-----------------------");
	
	
	String kir = "I love you motherfucker and bia sarish bishi";
	
	System.out.println(kir.substring(38));
	
	String [] word1= kir.split(" ");
	System.out.println(word1.length);
	
	for (String string1 : word1) {
	System.out.println(string1);
	}
	
	System.out.println("----------------------------");
	
	String ilove = "I love you";
	
	System.out.println(ilove.substring(6));
	String [] word2 = ilove.split(" ");
	System.out.println(word2.length);
	
	for (String string2 : word2) {
		System.out.println(string2);
		
	}
	System.out.println("-----------------------");
	
	String ihate = "I love you and I hate You";
	
	StringBuffer ihate2 = new StringBuffer (ihate);
	System.out.println(ihate2.reverse());
	
	
	
	System.out.println("-----------------------");
	
	
	int koss = 1234;
	int rev = 0;
	
	while (koss!=0) {
		rev = rev*10+koss%10;
		koss = koss/10;
		
				
	}System.out.println(rev);
	
	System.out.println("-------------------------");
	
	int koss1 = 12344556;
	String number = String.valueOf(koss1);
	StringBuffer rev1 = new StringBuffer (number);
	System.out.println(rev1.reverse());
	
	
	
	System.out.println("---------------------------------");
	
	String khaya = "What the fuck is going on";
	String rev2 = "";
	
	for (int i = khaya.length()-1; i >=0; i--) {
		rev2 = rev2+khaya.charAt(i);
	} System.out.println(rev2);
			
	
	System.out.println("-----------------------");
	
	String ko = "I love you and I hate you";
	String ree = "";
	
	for (int i = ko.length()-1; i >=0; i--) {
		ree = ree+ko.charAt(i);
	}System.out.println(ree);
	
	System.out.println("-----------------------");
	
	
	int [] ka = {1,23,23, 34,45,2,3,4,5};
	Arrays.sort(ka);
	System.out.println(Arrays.toString(ka));
	
	System.out.println("-----------------------");
	
	int [] ka1 = {1,32,453,4545,64,564,5675,67,567};
	Arrays.sort(ka1);
	System.out.println(Arrays.toString(ka1));
	
	System.out.println("-----------------------");
	
	String opz = "there are a few thing I need to do";
	char [] array=opz.toCharArray();
	System.out.println(array.length);
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
	
	char [] array1=opz.toCharArray();
	//for (int i = 0; i < array.length; i++) {
	//	System.out.println(array[i]);
		
	System.out.println(Arrays.toString(array1));
	
	System.out.println("-----------------------");
	
	String az = "Okay";
	String az1 = "Okay";
	
	if (az == az1) {
		System.out.println("String az: " + az + " is equal to String az1: " + az1 );
	} else { System.out.println("They are not equal you stupid motherfucker son of a bitch");
	}
	System.out.println("-----------------------");
	
	String a0="Hello";
	String b="Hello";

	StringBuffer sb=new StringBuffer("Hello TekSchool");

	a0=a0.concat("TekSchool");
	System.out.println(a);
	sb=sb.append(" America");
	System.out.println(sb);
	
	

	
}

}
