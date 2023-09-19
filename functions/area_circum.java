import java.util.Scanner;
public class area_circum{
	static void ac( float r){
		System.out.println("Area : "+ Math.PI*r*r);
		System.out.println("Circumference : "+ Math.PI*2*r);
	}
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the radius : ");
		float r = scan.nextFloat();
		ac(r);
	}
}
