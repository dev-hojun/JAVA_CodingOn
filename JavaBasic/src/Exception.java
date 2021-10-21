public class Exception {

	public static void main(String[] args) {
		try {			
			int [] num = new int[3];
			
			System.out.println("num 배열의 최대값은 3입니다.");
			
			num[4] = 0;
			
			System.out.println("num[4]에 값을 입력했습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 오류입니다.");
			e.printStackTrace();
		}
	}
}
