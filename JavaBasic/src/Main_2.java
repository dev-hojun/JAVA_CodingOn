import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요 : ");
		
		String name = scan.next();
		
		if (name.equals("홍길동")) {
			System.out.println("남자");
		} else if (name.equals("성춘향")) {
			System.out.println("여자");
		} else {
			System.out.println("모르겠어요");
		}
	}

}
