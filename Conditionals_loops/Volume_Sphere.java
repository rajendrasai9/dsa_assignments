import java.util.Scanner;
public class Volume_Sphere{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the radius of Sphere: ");
		float r = scan.nextFloat();
		System.out.println(4*Math.PI*r*r*r/3);
	}
}
