// 정수 5개를 입력받아 출력하기

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(5);
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("숫자를 입력하세요 : ");
			int num = scan.nextInt();
			arr.add(num);
		}
		System.out.println(arr);
	}
}
