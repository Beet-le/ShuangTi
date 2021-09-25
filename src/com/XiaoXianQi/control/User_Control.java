package com.XiaoXianQi.control;

import java.util.Scanner;

public class User_Control
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        User_Dao dao=new User_Dao();
        String user[]=new String[2];
        String user2[]=new String[2];

        while(true)
        {
            System.out.println("1.注册 2.登录 3.退出");
            int num=sc.nextInt();
            switch (num)
            {
                case 1:
                    user=dao.in_user();
                    user2=dao.in_user2();
                    break;
                case 2:
                    dao.login(user,user2);
                    break;
                case 3:
                    dao.end();
                    break;
            }
        }
    }
}
