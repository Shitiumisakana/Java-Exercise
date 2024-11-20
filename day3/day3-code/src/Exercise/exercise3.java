package Exercise;

import java.util.Scanner;

//利用case击穿的案例,判断今天是工作日还是休息日
public class exercise3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("今天是星期几：");
        int day =sc.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("今天是工作日");
                break;
            case 6:
            case 7:
                System.out.println("今天是休息日");
                break;
        }
    }
}
