// ���ڿ� 5���� �Է¹޾� ����ϱ�

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_2 {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>(5);
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("���ڸ� �Է����ּ��� : ");
			String str = scan.next();
			arr.add(str);
		}
		System.out.println(arr);
	}

}