package XiaoXianQiZhongQIu;

import java.util.Scanner;

public class Feeling {
    static int girlsLoverCount = 5, boySalary = 80000, gift,flower;
    static Scanner sc = new Scanner(System.in);

    public void judges() {
        int age = 21;
        int year =0;
        boolean T = true;
        while (T) {
            year++;
            System.out.println("第"+year+"年");
            age++;
           /* if (age > 28) {
                System.out.println("不嫁!");
                T = false;
            }*/
            System.out.println("==================================");
            System.out.println("今年年薪增加了:");
            int boySalaryAdd = sc.nextInt();
            boySalary += boySalaryAdd;//每年年薪

            System.out.println("==================================");
            System.out.println("女友生日是否送花? \n 1:是  好感+1  2:否 好感-1");
            do {
                gift = sc.nextInt();
                if (gift == 1) {
                    girlsLoverCount += 1;
                } else if (gift == 2) {
                    girlsLoverCount = girlsLoverCount-1;
                } else {
                    System.out.println("输入错误!重新输入");
                }
            } while (gift != 1 && gift != 2);
            System.out.println("===================================");
            System.out.println("情人节是否送花? \n 1:是  好感+1  2:否 好感-1");
            do {
                flower = sc.nextInt();
                if (flower == 1) {
                    girlsLoverCount += 1;
                } else if (flower == 2) {
                    girlsLoverCount = girlsLoverCount-1;
                } else {
                    System.out.println("输入错误!重新输入");
                }
            } while (flower != 1 && flower != 2);
            if (girlsLoverCount>=8&&boySalary>=100000){
                System.out.println("结婚吧");
               T=false;
            }else if (girlsLoverCount<=0){     // 不送礼物
                System.out.println("没感情了不嫁");
               T=false;
            }else if (girlsLoverCount>=8&&boySalary<=100000){  //送礼物没钱
                System.out.println("没钱不嫁");
               T=false;
            }else if (age > 28){
                System.out.println("年龄太大了");
               T=false;
            }
        }


    }
}
