/*字符和整數轉換
Description
輸入一個字符，輸出其對應的ASCII碼值。

Input
輸入一個字符(英文字母大寫)
Output
輸出表示該字符的ASCII碼值。

Sample Input 1 
A
Sample Output 1
65
*/
import java.util.Scanner;
public class test7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        char A=scanner.next().charAt(0);
        System.out.println((int)A);
        scanner.close();
    }
}