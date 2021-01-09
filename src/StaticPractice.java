
public class StaticPractice {

	public static void main(String[] args) {
		
	int x = 10;
	int y = 5;
	int z = 15;
	int w = 27;

	// System.out.println(Math.max(10, 5)); 	
	System.out.println(Math.max(x, (Math.max(y, Math.max(z, w)))));

	int [] nums = {12, 1, 5, 4, 84, 51, 21, 12, 23, 45, 56, 56, 67, 78, 89, 90, 234};
	int max = nums [0];
	
	for (int i = 0; i < nums.length; i++) {
		if (max <nums[i]) {
			max = nums[i];
		}
	}
	
	System.out.println(max);
	
	System.out.println("******************");
	
	
	int [] nums1 = {12, 1, 5, 4, 84, 51, 21, 12, 23, 45, 56, 56, 67, 78, 89, 90, 234};
	int max1 = nums1[0];
	
	for (int i = 0; i < nums1.length; i++) {
		max1 = Math.max(max1, nums1[i]);
					
	}
	
	System.out.println(max1);
	}

}
