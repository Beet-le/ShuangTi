package Day915;

import java.util.Scanner;

public class Demo02Text {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        stu_scor(n);
    }

    public static void stu_scor(int n){
        int sum=0;
        int sum2=0;
//        double sum=0;
        int j=0;
        System.out.println("初始化数组函数:");
        int[] stu=new int[n];
        for (int i = 0; i < stu.length; i++) {
            System.out.println("请输入第"+(i+1)+"个的成绩");
            stu[i] = sc.nextInt();
            sum=sum+stu[i];
            if (stu[i]<60){
                j++;
            }
        }
       int avg=sum/n;
//       double evg=sum/n;
        if (avg<60){
            System.out.println("1:全部加分 2:残忍拒绝");
            int key = sc.nextInt();
            if (key==1){
                while (avg<60){
                    for (int i = 0; i < stu.length; i++) {
                        sum2=sum2+ (stu[i]+10);
                    }
                    avg=sum2/n;
                }
            }else {
                System.out.println("滚滚!");
            }
        }
        System.out.println("总分为"+sum);
        System.out.println("全班的平均分数为"+avg);
        System.out.println("一共有"+j+"不及格 ");

    }
}
