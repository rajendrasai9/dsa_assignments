import java.util.Scanner;
public class Armstrong{
	public static boolean isArmstrong(int num){
		int a=num;
		int ans;
		int result=0;
		String b=""+a;
		int n= b.length();
		for (int i=0; i<n;i++){
			ans = (int)Math.pow(a%10,n);
			result+=ans;
			a-= a%10;
			a/=10;
		}
		return result==num;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter starting number of range : ");
		int start =  scan.nextInt();
		System.out.print("Enter ending number of range : ");
		int end = scan.nextInt();
		for (int i=start; i<=end;i++){
			if (isArmstrong(i)==true){
				System.out.println(i);
			}

		}
	}
}
