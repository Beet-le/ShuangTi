package XiaoXianqi;

import java.util.Scanner;

public class Denglu {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1注册: 2登录");
        int One=sc.nextInt();
        int Two=sc.nextInt();
        System.out.println("填写账户");
        int sig=sc.nextInt();
        System.out.println("填写密码");
        int pas=sc.nextInt();
        register(sig,pas);

    }

    public static int register(int sig,int pas){
        System.out.println("账号");
        int sig1=sc.nextInt();
        System.out.println("密码");
        int pas1= sc.nextInt();
        if (sig1==sig&&pas1==pas){
            System.out.println("成功进入");
        }else {
            System.out.println("滚!");
        }
        return 0;
    }
}
