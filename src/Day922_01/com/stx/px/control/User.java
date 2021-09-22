package Day922_01.com.stx.px.control;

import Day922_01.com.stx.px.Dao.Mima;

import java.util.Scanner;

public class User {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Mima mima=new Mima();
        System.out.println("1:注册  2：登录  3：退出");
        int num=sc.nextInt();
        switch (num){
            case 1:
                mima.in_user();
                break;
            case  2:
                mima.login();
        }
    }
}
