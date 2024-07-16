
/*
一個Java程式來輸出多行文字，展示你的個人信息

Description
使用System.out.println()一個Java程式來輸出多行文字，展示你的個人資訊


Input
(請參考下方範例input)


Output
(請參考下方範例output)


Sample Input 1 
tkuim
Sample Output 1
tkuim

Sample Input 2 
20
Sample Output 2
20

Sample Input 3 
NewTaipei city
Sample Output 3
NewTaipei city
*/
import java.util.Scanner;

public class test_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value;
        value =scanner.next();
        System.out.println(value);
        scanner.close();
    }

    
}