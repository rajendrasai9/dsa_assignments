import java.util.Scanner;
public class simple_interest{
	public static void main(String[] args){
		int principle,time,rate_of_interest;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the principle : ");
		principle = scan.nextInt();
		System.out.print("Enter the time : ");
		time = scan.nextInt();
		System.out.print("Enter the rate of interest : ");
		rate_of_interest = scan.nextInt();
		System.out.print("simple interest is : "+principle*time*rate_of_interest/100);

	}
}
