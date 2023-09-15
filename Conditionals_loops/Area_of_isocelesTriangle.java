import java.util.Scanner;
public class Area_of_isocelesTriangle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Base: ");
		float b = scan.nextFloat();
		System.out.println("Enter the length of equal sides: ");
		float a = scan.nextFloat();
		System.out.println(b/2*Math.sqrt( a*a- b*b/4));
	}
}
