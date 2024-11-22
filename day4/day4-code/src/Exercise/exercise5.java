package Exercise;

//定义一个数组，存入1，2，3，4，5.按照要求交换索引对应的元素。
//交换前：1，2，3，4，5
//交换后：5，2，3，4，1
public class exercise5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int temp = 0;
        temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        System.out.println(arr[0]);
        System.out.println(arr[4]);
    }
}
