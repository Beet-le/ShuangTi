package XiaoXianQiZhongQIu;

import java.util.Scanner;

/*
//男孩有房
　　boolean boyHasHouse=true;
　　//男孩有车
　　boolean boyHasCar=true;
　　//女孩的感情值
　　int girlsLoverCount=5;
　　//女孩是否愿意等
　　boolean girlsCanWaite=true;
　　//男孩的年薪
　　int boySalary=80000;
　　//男孩送玫瑰花
　　boolean boyGiveFlower=true;
　　//情人节(值为一年中的第几天)
　　int loverDay=363;
　　//女孩的生日
　　int girlsBir=364;
　　//年龄
　　int age=21;
具体需求：1.如果男孩有房，有车，直接嫁程序结束
        2.如果男孩只有车or只有房，女孩暂时不嫁给男孩,接下来要看女孩是否愿意等
        3.如果不愿意等程序结束；如果愿意等在那么男孩的年薪要>10万，感情值要>8才能嫁（感情值增加的方法是每年生日有送花和礼物，如果没有送就减少，
        同时女生的年龄会增加1岁，当女生年龄>28岁了，男生就算达到年薪10万，程序也结束，感情减少到0是，程序也结束）默认男孩年薪每年增加1万
        4.age<28 && girlsLoverCount>8才能嫁
        提示：所有初始值都可以用Scanner输入
 */
public class Main {
    static int condition;
    public static void main(String[] args) {
        One one=new One();
        Two two=new Two();
        Scanner sc=new Scanner(System.in);
        System.out.println("男孩有车有房请输入：1");
        System.out.println("男孩有车或房请输入：2");
        System.out.println("男孩有没车没房请输入:3");
        do {
             condition = sc.nextInt();
            switch (condition){
                case 1:one.marry();break;
                case 2:two.judge();break;
                case 3:
                    System.out.println("算了吧!");
            }
            if (condition!=1&&condition!=2&&condition!=3){
                System.out.println("语法错误!重新输入");
            }
        }while (condition!=1&&condition!=2&&condition!=3);

    }
}
