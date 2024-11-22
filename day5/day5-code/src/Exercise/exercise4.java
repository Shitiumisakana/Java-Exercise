package Exercise;

//定义一个copyOfRange（int[] arr,int from,int to）
//将数组arr中从索引from（包含from）开始。
//到索引to结束（不包含to）的元素复制到新数组中。
//返回新数组。
public class exercise4 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int[] arr2 = copyOfRange(arr,4,8);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }

    }

    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] newArr = new int[to - from];//定义新数组的大小
        int j = 0;
        for (int i = from; i < to; i++) {//从第from个开始遍历，到第to个结束，依次填入新数组
            newArr [j] = arr [i];
            j++;
            }
        return newArr;
    }
}

