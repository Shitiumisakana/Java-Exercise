package Demo;

import com.sun.source.util.SourcePositions;

public class ArithmeDemo4 {
    public static void main(String[] args) {
        int a=10;
        int b=a++;
        int c=++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
