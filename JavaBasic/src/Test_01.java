import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("result : " + sum);
	}

}
