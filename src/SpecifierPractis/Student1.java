package SpecifierPractis;

public class Student1 {

		private String name;
		private int age;
		private static int count=0;
		
		public Student1() {
			name = "";
			age = 0;
			count++;
		}

		public Student1(String name, int age) {
			this.name = name; 
			this.age = age;
			count++;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}


		public static int getCount() {
			return count;
		}

		public static void setCount(int count) {
			Student1.count = count;
		}
		
	
	
}
