package Demo;

import java.util.Random;

//生成一个随机数，类比于Scanner的用法
public class RandomDemo {
    public static void main(String[] args) {
        //随机数从0开始
        Random r =new Random();
        int number =r.nextInt(100);//0~99
        System.out.println(number);
    }
}
