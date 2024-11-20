package Exercise;

//判断一个数字是否为回文数
public class exercise7 {
    public static void main(String[] args) {
        int i =121;
        int tem =i;
        int num =0;
        while (i !=0){
            int j =i %10;
            i =i /10;
            num =num *10 +j;

        }
        System.out.println(num);
        if (num ==tem){
            System.out.println(true);
        }else System.out.println(false);

    }
}
