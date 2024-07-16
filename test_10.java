/*格式化輸出
Description
格式化輸出一個浮點數，保留小數點後兩位。


Input
輸入浮點數
Output
輸出格式化後的浮點數


Sample Input 1 
3.14159
Sample Output 1
3.14*/
import java.util.Scanner;
public class test_10 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double a=scanner.nextDouble();
        System.out.printf("%.2f", a);
        scanner.close();
    }
}