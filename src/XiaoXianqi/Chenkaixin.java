package XiaoXianqi;

import java.util.Scanner;

public class Chenkaixin {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请初始化数组长度：");
        int n = sc.nextInt();
        stu_score(n);
    }
    public static void stu_score(int n) {
        int sum = 0;
        int sum2 = 0;
        int j = 0;
        int[] stu = new int[n];
        for (int i = 0; i < stu.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数据：");
            stu[i] = sc.nextInt();
            sum = sum + stu[i];
            if (stu[i] < 60) {
                j++;
            }
        }
        int avg = sum / n;
        int s=1;
        System.out.println("一共有" + j + "人不及格");
        System.out.println("平均成绩为"+avg);
        System.out.println("总分为" + sum);
        if (avg < 60) {
            System.out.println("成绩显示不合格，您是否给全班每个同学加分");
            System.out.println("1.全班加十分2.残忍拒绝");
            int key = sc.nextInt();
            if (key == 1) {
                int avg2=0;
                while (avg2 < 60) {
                    for (int i = 0; i < stu.length; i++) {
                        sum2 = sum2 + (stu[i] + 10);
                    }
                    s++;//计算循环次数
                    avg2 = sum2 / n;//avg>60跳出循环
                    System.out.println(sum2);
                }
                System.out.println("s="+s);
                System.out.println("全班的平均数是：" + avg2);
//              System.out.println("总分为"+sum2);
            }
        }
       /* for (int i = 0; i < stu.length; i++) {
            System.out.println("第"+(i+1)+"单个人的成绩"+(stu[i]+10*s));
        }*/



    }
}