package Exercise;

import java.util.Scanner;

//在实际开发过程中会在多种情况下选择一个，这时就可以用switch语句
//假设一个机票预定电话。
//电话中语言提示：
//1 机票查询   2 机票预定   3 机票改签   4 退出服务   其他按键也是退出服务
public class exercise4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请选择按键：");
        int bottle = sc.nextInt();
        switch (bottle){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
            default -> System.out.println("退出服务");
        }
    }
}
