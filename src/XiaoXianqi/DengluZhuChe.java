package XiaoXianqi;

import java.util.Scanner;

public class DengluZhuChe{
    static Scanner sc = new Scanner(System.in);
    static int usename, paseword;
    static int usename2, paseword2;
    public static void main(String[] args) {
        int Print = sc.nextInt();
        if (Print == 1) {
            register();
            lpgen();
        } else if (Print == 2) {
            lpgen();
            System.out.println("您还为注册");
            register();
            lpgen();
        } else {
            System.out.println("语法错误");
        }
        if (usename == usename2 && paseword == paseword2) {
            System.out.println("登录成功");
        } else {
            System.out.println("滚");
        }
    }
    public static void register() {
        System.out.println("注册用户");
        usename = sc.nextInt();
        System.out.println("注册用户密码");
        paseword = sc.nextInt();
    }

    public static void lpgen() {
        System.out.println("登录用户");
        usename2 = sc.nextInt();
        System.out.println("登录用户密码");
        paseword2 = sc.nextInt();

    }
}

