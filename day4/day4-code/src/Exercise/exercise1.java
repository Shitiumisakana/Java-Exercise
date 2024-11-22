package Exercise;

//使用程序在控制台打印出1-100之间，跳过包含7或7的倍数的数
public class exercise1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i  % 7 ==0){//i是7的倍数
                continue;
            }else if (i % 10==7){//i个位是7
                continue;
            }else if (i / 10==7){//i十位是7
                continue;
            }
            System.out.println(i);
        }
    }
}
