package Demo;

public class MethodDemo1 {
    public static void main(String[] args) {
        //调用一个方法
        playGame();
        playGame();
        girlFriend();
    }
    //定义一个方法
    public static void playGame(){
        System.out.println("开始一局游戏");
    }

    public static void girlFriend() {
        System.out.println("慧慧");
        System.out.println("18岁");
        System.out.println("女");
    }
}
