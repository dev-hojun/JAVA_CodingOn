import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요 : ");
		
		int age = scan.nextInt();
		
		if (age > 20) {
			System.out.println("성인");
			
		  if(age % 2 == 0) {
			System.out.println("나이가 짝수인 성인");
		} else if(age % 2 == 1){
			System.out.println("나이가 홀수인 성인");
		} 
	}
		else {
			System.out.println("미성년자");
			
			  if(age % 2 == 0) {
					System.out.println("나이가 짝수인 미성년자");
				} else if(age % 2 == 1){
					System.out.println("나이가 홀수인 미성년자");
				} 
		}
		
	}
}
