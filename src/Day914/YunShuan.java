package Day914;

import java.util.Scanner;

public class YunShuan {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("***********菜单************");
        System.out.print("1.加法");
        System.out.print(" 2.减法");
        System.out.print(" 3.乘法");
        System.out.println(" 4.除法");
        System.out.println("请输入你选择的编号：");
        int a = sc.nextInt();
        System.out.println("请输入第一个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int c = sc.nextInt();
        add(a, b, c);
    }
    public static int add(int a, int b, int c) {
        switch (a) {
            case 1:
                System.out.println(b + c);
                break;
            case 2:
                System.out.println(b - c);
                break;
            case 3:
                System.out.println(b * c);
                break;
            case 4:
                System.out.println(b / c);
                break;
        }
        return 0;
    }
}