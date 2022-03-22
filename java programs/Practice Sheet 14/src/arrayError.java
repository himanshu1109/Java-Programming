import java.util.Scanner;

class MaxTriesException extends Exception{
	public String getMessage() {
		return "Error";
	}
}

public class arrayError {
	public static void Max() throws MaxTriesException{
		Scanner sc = new Scanner(System.in);
		int[] max = {1,2,3,4,5,6,7};
		int i = 0;
		int index;
		while(i<5) {
			try {
				index = sc.nextInt();
				System.out.println(max[index]);
				break;
			}
			catch(Exception e) {
				if(i<4)
					System.out.println("Invalid index , try again");
				else
					System.out.println("Max tries reached");
				i++;
			}
		}
		if(i>=5) {
			try {
				throw new MaxTriesException();
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main(String[] args) {
		try {
			Max();
		} 
		catch (MaxTriesException e) {
			e.printStackTrace();
		}
	}
}
