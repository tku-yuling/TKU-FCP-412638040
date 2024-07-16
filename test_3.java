/*
 Java程式來計算兩個整數的商
Description

宣告兩個整數變數a和b，並分別賦值為10和5。計算這兩個變數的商，並將結果打印出來。


Input
(請參考下方範例input)
Output
(請參考下方範例output)

Sample Input 1 
10 5
Sample Output 1
2
 */
import java.util.Scanner;

public class test_3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int result =a/b;
        System.out.println(result);
        scanner.close();
    }
    
}
