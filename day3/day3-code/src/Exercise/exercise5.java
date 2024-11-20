package Exercise;

//判断断线重连，最多执行五次
public class exercise5 {
    public static void main(String[] args) {
        String sitution ="断线";
        if (sitution == "断线"){
            for (int i =1;i <=5;i++){
                System.out.println("正在尝试第" + i + "次重连");
            }
        }else System.out.println("重连成功");
    }
}
