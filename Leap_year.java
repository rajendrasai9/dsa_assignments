import java.util.Scanner;
public class Leap_year{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year%400==0){
            System.out.print("LEAP");
            return ;
        }
        else if (year%4==0 && year%100!=0){
            System.out.print("LEAP");
        }
        else{
            System.out.print("NOT LEAP");
            
        }
    }
}
