package Day906;
import java.util.Scanner;
public class Demo04{
    public static boolean judgeYear(int year) {
        if (year % 400 == 0)
            return true;
        else if ((year % 4 == 0) && (year % 100 != 0))
            return true;
        else
            return false;
    }
    public static int getWeekOfDate(int year, int month, int day) {
        int week = -1;
        int[] monthDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        boolean isLeapYear = false;
        int sumDay = 0;
        if (year >= 1900) {
            for (int i = 1900; i < year; i++) {
                if (judgeYear(i))
                    sumDay += 366;
                else
                    sumDay += 365;
            }
            for (int i = 0; i < month - 1; i++) {
                sumDay += monthDay[i];
            }
            if (month > 2) {
                isLeapYear = judgeYear(year);
                if (isLeapYear)
                    sumDay++;
            }
            sumDay += day;

            week = sumDay % 7;
        }
        return week;
    }
    public static String convert(int week) {
        String[] weekName = { "星期天", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
        return weekName[week];
    }
    public static void main(String[] args) {
        int year, month, day;
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("请输入年:以0结束");
            year = sc.nextInt();
            if (year == 0) {
                System.out.println("结束！");
                sc.close();
                return;
            }

            if (year < 1900) {
                System.out.println("请输入1900以后的年份");
                continue;
            }

            System.out.println("请输入月:");
            month = sc.nextInt();
            while (month > 12 || month < 1) {
                System.out.println("请输入1-12间的月份");
            }
            System.out.println("请输入日:");
            day = sc.nextInt();
            while (!(day > 0 && day < 32)) {
                System.out.println("请输入1号到31号间的日期");
            }
            System.out.println();
            int week = getWeekOfDate(year, month, day);
            System.out.println(convert(week));
            System.out.println();

        }

    }
}

