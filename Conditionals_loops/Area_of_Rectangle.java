import java.util.Scanner;
public class Area_of_Rectangle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Length: ");
		float l = scan.nextFloat();
		System.out.println("Enter the Breadth: ");
		float b = scan.nextFloat();
		System.out.println(l*b);
	}
}
