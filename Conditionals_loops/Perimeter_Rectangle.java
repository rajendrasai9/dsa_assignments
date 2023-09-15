import java.util.Scanner;
public class Perimeter_Rectangle{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length: ");
		float l = scan.nextFloat();
		System.out.println("Enter the Breadth: ");
		float b = scan.nextFloat();
		System.out.println(2*(l+b));
	}
}
