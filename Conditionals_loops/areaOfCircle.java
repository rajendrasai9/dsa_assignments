import java.util.Scanner;
public class areaOfCircle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Radius of Circle : ");
		float radius = scan.nextFloat();
		System.out.println(Math.PI*radius*radius);
	}
}
