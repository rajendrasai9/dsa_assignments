import java.util.Scanner;
public class Main{
    public static int hcf(int a,int b){
        int small=Math.min(a,b);
        int hcf=1;
        int i =2;
        while(i<=small){
            if (a%i==0 && b%i==0){
                hcf=i;
            }
            i++;
        }
        return hcf;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int hcf = hcf(a,b);
        System.out.println("LCM is : "+(a*b)/hcf);
        System.out.println("HCF is : "+hcf);
    }
}
