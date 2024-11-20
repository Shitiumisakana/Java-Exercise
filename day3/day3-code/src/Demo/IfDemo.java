package Demo;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        //输入酒量，如果大于两斤则给出回应，否则回应其他
        Scanner sc =new Scanner(System.in);
        int wine = sc.nextInt();
        if (wine>10){
            System.out.println("小伙子比我都强了");
        }else if (wine>2){
            System.out.println("小伙子酒量好啊");
        }else{
            System.out.println("小伙子再回去练练吧");
        }


        //判断布尔类型的变量，不要用==号，直接把变量填进去进行判断
        boolean flag =true;
        if (flag){
            System.out.println("flag的值为true");
        }
    }
}
