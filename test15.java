/*月份天數計算器
Description
給定一個年份和月份，計算該月有多少天。需要考慮閏年的情況（閏年2月有29天）。閏年規則：能被4整除但不能被100整除，或者能被400整除的年份是閏年。

Input
輸入兩個整數，分別表示年份和月份，用空格分隔。年份範圍為1-9999，月份範圍為1-12。
Output
表示該月的天數

Sample Input 1 
2020 2
Sample Output 1
29 
*/
import java.util.Scanner;
public class test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int days;
        
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = -1; 
                break;
        }
        
        System.out.println(days);
        scanner.close();
    }
}
