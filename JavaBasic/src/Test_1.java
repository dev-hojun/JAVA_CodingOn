
public class Test_1 {

	public static void main(String[] args) {
		
		  try {
		   Scanner scan = new Scanner(System.in);
		   System.out.print("입력할 숫자의 갯수 : ");
		   int many = scan.nextInt();
		   
		   int[] arr = new int[many];
		   int sum = 0;
		   
		   for (int i = 0; i < many ; i ++ ) {
		    System.out.print("입력할 숫자 : ");
		    int num = scan.nextInt();
		    arr[i] = num;
		    sum+=arr[i];
		   }
		   
		   System.out.print(sum);
		      
		   if ( many < 0 ) {
		    throw new MinusException();
		    }
		   }
		  catch (MinusException e) {
		   e.printStackTrace();
		   }
	}

}
