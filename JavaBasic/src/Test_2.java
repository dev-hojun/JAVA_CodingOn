//# 사용자에게 먼저 입력할 숫자의 갯수를 입력받으세요.
//# 해당 갯수만큼 과일 이름을 입력받아 vector에 넣어주세요.
//# 사용자에게 "몇 번째 과일을 가져올까요?" 라고 물어 사용자가 입력한 번째의 과일을 출력해주세요.

import java.util.Scanner;
import java.util.Vector;

public class Test_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입혁할 과일의 갯수 : ");
		int many = scan.nextInt();
		Vector<String> fruit = new Vector<String>(many);
		
		for(int i = 0; i <many; i++) {
			System.out.println("입력할 과일 : ");
			String name = scan.next();
			fruit.addElement(name);
		}
		System.out.println("몇 번째 과일을 가져올까요? : ");
		int order = scan.nextInt();
		System.out.println(fruit.get(order-1));
	}

}