package Exercise;

//设计一个方法求数组的最大值，并将最大值返回
public class exercise3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,90,50,60};
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int[] arr){
        int theMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > theMax){
                theMax = arr[i];
            }
        }
        return theMax;
    }
}
