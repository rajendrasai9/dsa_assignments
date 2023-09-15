import java.util.Scanner;
public class Volume_Cylinder{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the height: ");
		float h = scan.nextFloat();
		System.out.println("Enter the Base radius: ");
		float r = scan.nextFloat();
		System.out.println(Math.PI*r*r*h);
	}
}
