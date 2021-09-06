package Day906;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("请输入年月日：  年");
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
//        System.out.println("输入的字符串是 ：" + str);
        String Year=str.substring(0,4);
        String Moon=str.substring(5,7);
        String Day=str.substring(8,10);

    }
    public static int day(int Year ,int Moon){


        if(Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0){
            System.out.println("是闰年");
           int Moon2=29;
        }else{
            System.out.println("不是闰年");
            int Moon2=28;
        }
     return 0;
    }
}

