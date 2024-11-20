package Demo;

//字符串相加
public class ArithmeDemo3 {
    public static void main(String[] args) {
        String s1 ="123";
        String s2 ="12356";
        System.out.println(s1 + s2);

        System.out.println(3.7 + "abc");

        System.out.println(1+100+"20");

        System.out.println("我的年龄是" + 18 + "岁");

        //有字符串参与后，接下来的操作都是拼接操作
        System.out.println(1 + 2 +"abc"+ 2 + 1);
    }
}
