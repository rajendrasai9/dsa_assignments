import java.util.Scanner;
public class Volume_Pyramid{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the height of pyramid: ");
		float h = scan.nextFloat();
		System.out.println("Enter the Base Area of pyramid: ");
		float a = scan.nextFloat();
		System.out.println(a*h/3);
	}
}
