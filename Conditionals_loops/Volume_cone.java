import java.util.Scanner;
public class Volume_cone{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the height of cone: ");
		float h = scan.nextFloat();
		System.out.println("Enter the Base radius of cone: ");
		float r = scan.nextFloat();
		System.out.println(Math.PI*r*r*h/3);
	}
}
