import java.util.Scanner;

public class hm_08 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.print("name:");
        String name =scn.next();

        System.out.print("age:");
        int age =scn.nextInt();

        System.out.print("city:");
        String city =scn.next();

        System.out.println(name+","+age+","+city);

        scn.close();




    }
    
}
