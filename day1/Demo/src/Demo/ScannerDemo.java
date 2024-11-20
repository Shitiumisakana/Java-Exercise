package Demo;//键盘录入
//1.导包
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args){
        //2.创建对象
        Scanner sc = new Scanner(System.in);
        //3.接收数据
        int i = sc.nextInt();
        System.out.println(i = ++i);
        System.out.println(i);
    }
}
