import java.util.Scanner;
public class printLargest{
	public static void main(String[] args){
		int a,b;
		Scanner scan= new Scanner(System.in);
		System.out.print("Number1 : ");
		a= scan.nextInt();
		System.out.print("Number2 : ");
		b=scan.nextInt();
		if (a>b){
			System.out.println("The largest number : "+a);
		}else {
			System.out.println("The largest number : "+b);
		}

	}
}
