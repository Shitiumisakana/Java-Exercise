package Exercise;

import java.util.Scanner;

//键盘录入星期数，显示今天的计划
//default可以省略
public class exercise2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入星期数：");
        int weeks =sc.nextInt();
        switch (weeks){
            //jdk12新特性
            case 1-> System.out.println("跑步");
            case 2-> System.out.println("游泳");
            case 3-> System.out.println("拳击");
            case 4-> System.out.println("慢走");
            case 5-> System.out.println("射箭");
            case 6-> System.out.println("骑车");
            case 7-> System.out.println("好好吃一顿");
        }


    }
}
