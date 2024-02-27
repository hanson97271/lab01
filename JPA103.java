import java.util.Scanner;
public class JPA103 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("please input:");

        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();

        System.out.println("Average:"+((a+b+c)/3));

    }
}
