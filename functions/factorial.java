import java.util.Scanner;
public class factorial{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		System.out.print("The factorial of "+num+" is : ");
		int fac = 1;
		while(num >0){
			fac *= num;
			num-=1;
		}
		System.out.print(fac);
	}
}
