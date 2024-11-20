package Demo;

//简单的变量更改
public class VariableDemo1 {
    public static void main(String[] args) {
        int count = 0;
        //第一站上去一位乘客
        count = count + 1;
        // 第二站上去两位乘客，下来一位乘客
        count = count + 2;
        count = count - 1;
        //第三站上去两位乘客，下来一位乘客
        count = count + 2;
        count = count - 1;
        System.out.println("现在车上的人数为:   " + count);//3

        }
    }


