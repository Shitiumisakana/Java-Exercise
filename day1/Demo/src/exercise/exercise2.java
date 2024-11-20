package exercise;//键盘录入两个数字，求出他们的和并打印
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args){
        //输入第一个数字
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc1.nextInt();
        //输入第二个数字
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入第二个数字");
        int num2 = sc2.nextInt();
        System.out.println(num1 + num2);
    }
}
