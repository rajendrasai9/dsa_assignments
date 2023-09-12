import java.util.Scanner;
public class Fib{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a=0,b=1;
		for (int i=0; i<n-1;i++){
			System.out.print((a+b)+" ");
			int temp= a+b;
			a=b;
			b= temp;
		}

	}
}
