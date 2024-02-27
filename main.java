import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("please input:");
        double num=scn.nextDouble();
        System.out.println(num+"kg="+(num*2.20462)+"ponds");;
    }
    
}
