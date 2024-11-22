package Demo;

public class JumpDemo {
    public static void main(String[] args) {
        //输入5.fori
        for (int i = 1; i <= 5; i++) {
            if (i ==3){
                continue;//跳过第三个继续下面的循环
            }
            System.out.println("在吃第" + i + "包子");
        }
        for (int i = 1; i <= 5; i++) {
            if (i ==2){
                break;//在第二个循环处结束循环
            }
            System.out.println("在吃第" + i + "包子");
        }
    }
}
