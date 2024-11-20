package Demo;

public class SwitchDemo {
    public static void main(String[] args) {
        //注意，jdk7以上的版本才可以使用字符串
        String noodles ="拉面";
        switch (noodles){
            case "热干面":
                System.out.println("吃热干面");
                break;
            case "炸酱面":
                System.out.println("吃炸酱面");
                break;
            case "拉面":
                System.out.println("吃拉面");
                break;
            default:
                System.out.println("吃方便面");
        }
    }
}
