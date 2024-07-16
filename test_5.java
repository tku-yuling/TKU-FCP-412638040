/*
請將數字計算後相加
Description
請將2數相加

Input
設2個變數，分別存入數字12、26
Output
請將2變數值做相加


Sample Input 1 
12+26
Sample Output 1
38
*/import java.util.Scanner;

public class test_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = 12;
        int b = 26;
        int result = a + b;
 
        System.out.println(result);
        scanner.close();
    }
}