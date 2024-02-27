import java.util.*;

public class JPA104 {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);

        System.out.println("輸入第1組的x和y座標:");
        double x1=key.nextDouble();
        double y1=key.nextDouble();

        System.out.println("輸入第2組的x和y座標:");
        double x2=key.nextDouble();
        double y2=key.nextDouble();

        double d=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));

        System.out.println("距離為:"+d);
    }
}
