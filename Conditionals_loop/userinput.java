import java.util.Scanner;
public class userinput{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int var= 1;
		int largest=0;
		while( true){
			System.out.print("Enter a number: ");
			var = scan.nextInt();
			if (var!=0){
				if (var>largest){
					largest=var;
				}
			}
			else{
				break;
			}
		}
		System.out.println("The largest number is : "+largest);
	}
}
