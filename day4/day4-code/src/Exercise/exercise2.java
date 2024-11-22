package Exercise;

//取出数组内的所有内容
//求数组里所有元素的和
public class exercise2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,8,9,10};
        int sum = 0;
        //数组名.fori，就会生成
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(sum);
    }
}
