import java.util.Scanner;
public class Calci{
	public static void main(String[] args){
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.print("Number 1 : ");
		a= scan.nextInt();
		System.out.print("Number 2 : ");
		b= scan.nextInt();
		System.out.print("Enter operator (one of +,-,*,/) : ");
		char op = scan.next().charAt(0);
		int ans=0;
		if (op=='+'){
			ans= a+b;
		}
		else if (op=='-'){
			ans= a-b;
		} else if (op=='*'){
			ans = a*b;
		} else if (op=='/'){
		 ans = a/b;
		}
		System.out.print("Answer : "+ ans);
	}
}
