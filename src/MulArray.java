
public class MulArray {

	public static void main(String[] args) {
		String a = "11";
		String b = "19";
		
		int m = a.length(), n = b.length();
		int[] vals = new int[m+n];
		
		for (int i = m - 1; i >= 0; --i) {
			for (int j = n-1; j >= 0; --j) {
				int mul = (a.charAt(i) - '0') * (b.charAt(j) - '0');
				int sum = vals[i+j+1] + mul;
				vals[i+j] += sum / 10;
				vals[i + j + 1] = sum % 10;
				
			}
		}
		StringBuilder sb  = new StringBuilder();
		for (int val : vals) {
			if (sb.length() !=0 || val !=0)
				sb.append(val);
			
		}
		return sb.length() == 0 ? "0" : sb.toString();
		
		
		
	}

}
