/*自動類型提升
Description
整數和浮點數混合運算時的自動類型提升

Input
兩行，第一行是一個整數，第二行是一個浮點數。
Output
一行，兩數相加的結果（保留兩位小數）。
Sample Input 1 
5 3.14
Sample Output 1
8.14 */
import java.util.Scanner;

public class test_8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        double b=scanner.nextDouble();
        double result =a+b;
        System.out.printf("%.2f",result);
        scanner.close();
    }
    
}
