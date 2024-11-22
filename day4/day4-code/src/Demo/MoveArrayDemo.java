package Demo;

//动态初始化数组

import java.util.Scanner;

public class MoveArrayDemo {
    public static void main(String[] args) {
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            System.out.println(name);
        }
    }
}
