import java.util.Scanner;

public class For_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요 : ");
		
		int num = scan.nextInt();
		
		for(int i = 1; i < num+1; i++) {
			for(int j = 0; j < i; j++) {				
				System.out.println(i);
			}
		}
	}

}
