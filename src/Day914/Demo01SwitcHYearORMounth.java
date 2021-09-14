package Day914;

import java.util.Scanner;

public class Demo01SwitcHYearORMounth {
    public static void main(String[] args) {
        int sum = 0;
        int fed=28;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int y = sc.nextInt();
        System.out.println("请输入月份");
        int m = sc.nextInt();
        System.out.println("请输入号数");
        int d = sc.nextInt();
        if ((y % 4 == 0 && y % 100 != 0)||(y%400==0)){
            fed=fed+1;
        }
            switch (m) {
                case 1:
                    sum = d;
                    break;
                case 2:
                    sum = 31 + d;
                    break;
                case 3:
                    sum = 31 + fed + d;
                    break;
            }
        System.out.println("");
    }
}
