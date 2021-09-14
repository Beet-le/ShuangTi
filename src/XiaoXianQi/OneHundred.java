package XiaoXianQi;

public class OneHundred {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(i <= 100){
            i++;
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("结果是："+sum);
    }
}
