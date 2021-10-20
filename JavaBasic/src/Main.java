import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자");
		
		// String testA = scanner.next(); // next() : 공백 이전까지의 글자를 읽어옴
		
		// String testA = scanner.nextLine(); // nextLine() : 엔터 이전까지의 글자를 읽어옴
		
		int a = 5;
		
		String b = scanner.next(); // next()로 읽어와 숫자 3이 아닌 문자 "3"으로 인식
		
		System.out.println(a + b); // 5 + "3" = 53
		
		System.out.println("두번째 숫자");
		
		int c = scanner.nextInt(); // nextInt()로 읽어와 숫자 3으로 인식
		
		System.out.println(a + c); // 5 + 3 = 8
	}
}
