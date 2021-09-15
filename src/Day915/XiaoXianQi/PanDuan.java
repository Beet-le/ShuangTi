package Day915.XiaoXianQi;

import java.util.Scanner;

public class PanDuan {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("初始化数组函数:");
        int n=sc.nextInt();
        stu_scor(n);
    }
    public static void stu_scor(int n){
        int sum=0;
        int sum2=0;
//        double sum=0;
        int j=0;

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
        int S=0;//计数不及格人数
        System.out.println("一共有"+j+"不及格 ");
        System.out.println("总分为"+sum);
//       double evg=sum/n;
        if (avg<60){
            System.out.println("1:全部加分 2:残忍拒绝");
            int key = sc.nextInt();
            if (key==1){
                while (avg<60){
                    for (int i = 0; i < stu.length; i++) {
                        sum2=sum2+ (stu[i]+10);
                        int AVG=stu[i]+10;
                        System.out.println("加分后第"+(i+1)+"个人的成绩:"+AVG);
                        if(AVG<60){
                            S++;
                        }
                    }
                    avg=sum2/n;
                    System.out.println("平均成绩为: "+avg);
                    System.out.println("加分后不及格人数为"+S);
                    System.out.println("加分后总分为"+sum2);
                }
            }else {
                System.out.println("滚滚!");
            }
        }
    }
}
