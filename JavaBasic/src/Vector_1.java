import java.util.Scanner;
import java.util.Vector;


public class Vector_1 {

public static void main(String[] args) {

Vector<Integer> numbers = new Vector<Integer>(7);

Scanner scan = new Scanner(System.in);

for (int i=0 ; i<7 ; i++ ) {
System.out.println("���ڸ� �Է����ּ���. : ");
int num = scan.nextInt();
numbers.addElement(num);
}
for (int i=0 ; i<7 ; i++ ) {
System.out.print(numbers.get(i));
}

}

}