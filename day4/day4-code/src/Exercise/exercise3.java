package Exercise;

//找到数组中最大的元素并打印
public class exercise3 {
    public static void main(String[] args) {
        int[] arr = {33,5,22,44,55};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
