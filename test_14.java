/*
簡單計算器
Description

實現一個簡單的計算器，支持加（+）、減（-）、乘（*）、除（/）四種運算。輸入兩個整數和一個運算符，輸出計算結果。如果是除法運算且除數為0，輸出"Error"。


Input
包含兩個整數和一個字符（運算符），以空格分隔。
Output
表示計算結果。如果是除法，結果保留兩位小數。如果除數為0，輸出"Error"。


Sample Input 1 
5 2 +
Sample Output 1
7
Hint
請用switch解題
 */
import java.util.Scanner;

public class test_14 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        char operator =scanner.next().charAt(0);

        switch (operator) {
            case '+':
            System.out.println(a+b);
                break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            if(b==0){
                System.out.println("Error");
            }else{
                System.out.printf("%.2f/n",a/b);

            }
            
            break;

        
            default:
            System.out.print("Invalid operator");
                break;
            
        }
        scanner.close();
    }
    
}
