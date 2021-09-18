package XiaoXianqi;

import java.util.Scanner;

public class Denglu3 {
    static Scanner sc = new Scanner(System.in);
    static int username, password;
    static int username1, password1;
    public static void main(String[] args) {
        do {
            System.out.println("***********菜单************");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("**************************");
            int put = sc.nextInt();
            switch (put) {
                case 1:
                    zhuche();
                    denglu();
                    Panduan();
                    break;
                case 2:
                    denglu();
                    System.out.println("您未注册请重新注册");
                    zhuche();
                    denglu();
                    Panduan();
                    break;
            }
        } while (username != username1 || password != password1);
    }
    public static void Panduan() {
        if (username == username1 && password == password1) {
            System.out.println("密码真确");
        } else {
            System.out.println("输入有误");
        }
    }
    public static void zhuche() {
        System.out.println("请输入账号：");
        username = sc.nextInt();
        System.out.println("请输入密码：");
        password = sc.nextInt();
    }
    public static void denglu() {
        System.out.println("请输入账号：");
        username1 = sc.nextInt();
        System.out.println("请输入密码：");
        password1 = sc.nextInt();
    }
}