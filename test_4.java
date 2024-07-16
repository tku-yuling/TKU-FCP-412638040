/*撰寫一個Java程式來轉換攝氏溫度到華氏溫度。
Description

使用公式F = (C * 9/5) + 32來計算華氏溫度


Input
Sample Input 1 
25

Output
Sample Output 1
77
*/
import java.util.Scanner;

public class test_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       
        double C=scanner.nextDouble();
        int F=(int)(C*9/5)+32;
        System.out.printf("%d\n",F);
        scanner.close();
    }
    
}
