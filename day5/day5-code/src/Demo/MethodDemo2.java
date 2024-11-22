package Demo;

import java.util.Scanner;

//带参数的方法调用
public class MethodDemo2 {
    public static void sum(int num1, int num2 ){
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int i =sc1.nextInt();
        int j =sc1.nextInt();
        sum(i,j);

    }
}
