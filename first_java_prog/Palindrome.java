import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = scan.next();
		// System.out.println(str.charAt(str.length()-1));
		String reverse="";
		for (int i=0; i <str.length();i++){
			reverse += str.charAt(str.length()-i-1);
		}
		System.out.print(reverse.equals(str));
	} 
		System.out.print(reverse);
}
