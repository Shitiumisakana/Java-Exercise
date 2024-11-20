package Exercise;

//输入两个整数，若其中一个等于6或者相加是6的倍数，返回true，否则返回false
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner1 =new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i =scanner1.nextInt();
        Scanner scanner2 =new Scanner(System.in);
        System.out.println("请输入一个整数");
        int j =scanner2.nextInt();
        boolean result = i ==6 || j ==6 || (i + j) % 6 == 0;
        System.out.println(result);

//取这两个数的最大值
        int max =i > j ?i : j;
        System.out.println(max);
    }
}
