package Exercise;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        //假设商品的总价为1000，键盘录入会员等级计算出所付的金额
        //会员1级：9折，会员2级：8折，会员3级：7折，非会员不打折
        int price =1000;
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入你的会员等级：");
        int level =sc.nextInt();
        if (level ==9){
            System.out.println("商品的价格为：" +price*0.9);
        }else if (level ==8){
            System.out.println("商品的价格为：" +price*0.8);
        }else if (level ==7){
            System.out.println("商品的价格为：" +price*0.7);
        }else {
            System.out.println("不是会员不打折，原价：" +price);
        }
    }
}
