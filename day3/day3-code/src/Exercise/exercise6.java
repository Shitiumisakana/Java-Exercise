package Exercise;

//求1-5之间的和
public class exercise6 {
    public static void main(String[] args) {
        int sum = 0;//变量要定义在循环之外，不然会一直重新定义sum的值
        for (int i =1;i<=5;i++){
            sum +=i;
        }
        System.out.println(sum);

        //求1-100之间的偶数和
        int sum2 =0;
        for (int i=1;i<=100;i++){
            if (i %2 ==0){
                sum2 +=i;
            }
        }
        System.out.println(sum2);
    }
}



