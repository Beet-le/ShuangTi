package com.XiaoXianQi.control;

import java.util.Scanner;

public class User_Dao
{
    Scanner sc = new Scanner(System.in);
    String username=null;
    String password=null;
    public void login(String[] user, String[] user2)
    {
        System.out.println("----------->登录页面<----------");
        System.out.println("请输入用户名：");
        username=sc.next();
        System.out.println("请输入密码：");
        password=sc.next();
        if ((username.equals(user[0])&&password.equals(user[1]))||(username.equals(user2[0])&&password.equals(user2[1])))
        {
            System.out.println("---------->欢迎光临<----------");
            System.out.println("1.添加 2.删除 3.修改 4.查询");
            System.exit(0);
        }else
        {
            System.out.println("拜拜");
        }
    }
    public String[] in_user()
    {
        String[] user=new String[2];
        System.out.println("------------>注册页面<-----------");
        System.out.println("请输入用户名：");
        username=sc.next();
        user[0]=username;
        System.out.println("请输入密码：");
        password=sc.next();
        user[1]=password;
        System.out.println("注册成功。");
        return user;
    }
    public String[] in_user2()
    {
        String[] user2=new String[2];
        System.out.println("------------>注册页面<-----------");
        System.out.println("请输入用户名：");
        username=sc.next();
        user2[0]=username;
        System.out.println("请输入密码：");
        password=sc.next();
        user2[1]=password;
        System.out.println("注册成功。");
        return user2;
    }
    public void end()
    {
        System.exit(0);
    }
}
