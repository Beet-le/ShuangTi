package Day906;
import java.util.Calendar;
import java.util.Scanner;
public class Demo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = 2016;
        System.out.println("欢迎使用2021年日历");
        System.out.println();
        System.out.print("请输入月份:");
        System.out.print("");
        int month = input.nextInt();
        System.out.print("");
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(year, month - 1, 1);
        int week = rightNow.get(Calendar.DAY_OF_WEEK) - 1;// 获取当月第一日是星期几，存入week中
        int[] cal = new int[42];// 开一个长度为42数组，存放日历
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                || month == 10 || month == 12) {
            for (int i = 1; i <= 31; i++) {
                cal[week] = i;// 从星期几开始存入1号
                week++;
            }
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            for (int i = 1; i <= 30; i++) {
                cal[week] = i;// 从星期几开始存入1号
                week++;
            }
        }
        // 判断平年闰年
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {// 闰年
            if (month == 2) {// 闰年2月份
                for (int i = 1; i <= 29; i++) {
                    cal[week] = i;// 从星期几开始存入1号
                    week++;
                }
            }
        } else {// 平年
            if (month == 2) {// 平年二月份
                for (int i = 1; i <= 28; i++) {
                    cal[week] = i;// 从星期几开始存入1号
                    week++;
                }
            }
        }
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期 六 ");
        // 输出日历
        int count = 0;
        for (int i = 0; i < 42; i++) {
            if (cal[i] != 0) {
                System.out.print(cal[i]);
            }
            System.out.print("\t");

            count++;
            if (count % 7 == 0) {
                System.out.println();
            }
        }

    }

}

