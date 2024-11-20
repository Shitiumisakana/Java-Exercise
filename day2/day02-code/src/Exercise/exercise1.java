package Exercise;
//输入一个三位数，依次打印它的个位，十位，百位

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int i = scanner.nextInt();
        System.out.println("个位是 " + i%10);
        System.out.println("十位是 " + i/10%10);
        System.out.println("百位是 " + i/100%10);
    }
}
