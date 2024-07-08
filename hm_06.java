import java.util.Scanner;

public class hm_06 {

    public static void main(String[] args) {
        Scanner scn=new Scanner((System.in));
        System.out.print("a: ");
        int a=scn.nextInt();
        System.out.print("b: ");
        int b=scn.nextInt();

        System.out.println("sum="+(a+b));
        
        scn.close();
    }
}