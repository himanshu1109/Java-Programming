
public class sumofargsMethod {
	static float average(int ...args) {
		int n = args.length;
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum += args[i];
		}
		float average = ((float)sum/(float)n);
		return average;
	}

	public static void main(String[] args) {
		System.out.println(average(1,2,4,4,4,4,2,2,4,2));
	}

}
