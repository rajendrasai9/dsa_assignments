import java.util.Scanner;
public class prime{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		func(num);
	}
	static void func(int num){
		float root = (float)Math.sqrt(num);
		int i=2;
		boolean b= false;
		while( i< root){
			if (num%i==0){
				b=false;
				break;
			}
			else{
				b=true;
			}
			i+=1;
		}
		System.out.print(b);
	}
}
