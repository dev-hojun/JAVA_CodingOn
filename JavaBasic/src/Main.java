import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요 : ");
		
		int age = scan.nextInt();
		
		if (age < 8) {
			System.out.println("유아");
		} else if (age < 14) {
			System.out.println("초등학생");
		} else if (age < 17) {
			System.out.println("중학생");
		} else if (age < 20) {
			System.out.println("고등학생");
		} else {
			System.out.println("성인");
		}
	}
}
