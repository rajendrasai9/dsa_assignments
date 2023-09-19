import java.util.Scanner;
public class vote{
	static void voter(int age){
		int a = age;
		if (age >= 18){
			System.out.print("You can vote!");
		}
		else{
			System.out.print("You are not eligible to vote");
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = scan.nextInt();
		voter(age);	
	}
}
