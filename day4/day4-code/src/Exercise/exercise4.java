package Exercise;

import java.util.Random;

//生成10个1~100之间的随机数存入数组
//求所有数据的和
//求所有数据的平均数
//统计有多少个数据比平均值小
public class exercise4 {
    public static void main(String[] args) {
        int[] arr =new int[10];
        for (int i = 0; i <arr.length; i++) {
            Random r = new Random();
            arr[i] = r.nextInt(100) + 1;
        }
        //求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("这组数据的和为：" + sum);

        //求平均数
        System.out.println("这组数据的平均数为：" + sum / 10);

        //有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < (sum / 10)){
                count++;
            }
        }
        System.out.println("有" + count + "个数字比平均值小");
    }
}
