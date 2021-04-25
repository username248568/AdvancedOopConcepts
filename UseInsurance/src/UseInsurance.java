import java.util.Scanner;

public class UseInsurance {
	public static void main(String[] args) {
		
		System.out.print("Choose an insurance type: \n 1. Health \n 2. Life \n");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		switch(n)
		{
			case 1:
			Health healthIns = new Health();
			healthIns.display();
			break;
			case 2:
			Life lifeIns= new Life();
			lifeIns.display();
			break;
			default:
			System.out.print("invalid input");
		}
	}
}
