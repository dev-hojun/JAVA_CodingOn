import java.util.Scanner;
import java.util.Vector;

public class Vector_2 {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<String>(5);
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("���ڸ� �Է����ּ��� : ");
			String str = scan.next();
			v1.addElement(str);
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(v1.get(i));
		}
	}

}
