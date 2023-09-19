import java.util.Scanner;
public class userinp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int var= 1;
		int sum=0;
		while( true){
			System.out.print("Enter a number: ");
			var = scan.nextInt();
			if (var!=0){
				sum+= var;
			}
			else{
				break;
			}

		}
		System.out.println("The sum is : "+sum);
	}
}
