import java.util.Scanner;
public class maxminfunc{
	static int max_num(int a ,int b,int c){
		int max=0;
		if (a>=b && a>=c){
			max=a;
		}
		else if (b>=a && b>=c){
			max=b;
		}
		else if(c>=a && c>=b){
			max=c;
		}
		return max;
	}

	static int min_num(int a ,int b,int c){
		int min=0;
		if (a<=b && a<=c){
			min=a;
		}
		else if (b<=a && b<=c){
			min=b;
		}
		else if(c<=a && c<=b){
			min=c;
		}
		return min;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter first number : ");
		a= scan.nextInt();
		System.out.print("Enter second number : ");
		b= scan.nextInt();
		System.out.print("Enter third number : ");
		c= scan.nextInt();
		System.out.println("Max number : "+max_num(a,b,c));
		System.out.println("Min number : "+min_num(a,b,c));


	}
}
