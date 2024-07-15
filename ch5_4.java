public class ch5_4 {
    public static void main(String[] args) {
        int a = 50, b = 20;
        char oper = '*'; // 修改操作符为 *（乘法）或者其他你想测试的操作符

        switch (oper) {
            case '+':
                System.out.println(a + "+" + b + "=" + (a + b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a + "/" + b + "=" + (a / b));
                } else {
                    System.out.println("Division by zero error!");
                }
                break;
            default:
                System.out.println("Unknown expression!!");
        }
    }
}
