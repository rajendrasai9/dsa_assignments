import java.util.Scanner;
public class Area_of_triangle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Height: ");
		float height = scan.nextFloat();
		System.out.println("Enter the Base: ");
		float base = scan.nextFloat();
		System.out.println(0.5*height*base);
	}
}
