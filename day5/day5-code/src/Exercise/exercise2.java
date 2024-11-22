package Exercise;

//比较不同类型数据的大小
public class exercise2 {
    public static void main(String[] args) {
        boolean result =compare(99999999,55555555);
        System.out.println(result);
    }

    public static boolean compare(byte a, byte b){
        return a > b;
    }

    public static boolean compare(short a, short b){
        return a > b;
    }

    public static boolean compare(int a, int b){
        return a > b;
    }

    public static boolean compare(long a, long b){
        return a > b;
    }
}
