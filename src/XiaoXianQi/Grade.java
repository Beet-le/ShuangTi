package XiaoXianQi;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int sum=0;
        System.out.println("请输入5 个人的成绩：");
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第"+i+"人的成绩");
               sum+=sc.nextInt();
        }
        System.out.println("总成绩为"+sum);
        int evera=sum/5;
        System.out.println("平均成绩为"+evera);
        if (evera<60){
            System.out.println("不合格");
        }else {
            System.out.println("合格");
        }
    }
}
