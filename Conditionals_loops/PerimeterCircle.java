import java.util.Scanner;
public class PerimeterCircle{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		float rad = scan.nextFloat();
		System.out.println(2*Math.PI*rad);
	}
}
