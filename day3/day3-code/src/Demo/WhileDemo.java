package Demo;

//一张纸厚度为0.1mm，计算它对折几次能超越珠穆朗玛峰
public class WhileDemo {
    public static void main(String[] args) {
        int count =0;
        float i =0.1F;
        while (i <8844430.0){
            i +=i;
            count++;
        }
        System.out.println(count);
        System.out.println(i);
    }
}
