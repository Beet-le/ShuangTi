package px.control;

import px.dao.User_Dao;
import px.model.User_model;

import java.util.Scanner;

public class User_control
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        User_model[] user=new User_model[100];
        int j=0;
        while (true)
        {
            User_Dao dao=new User_Dao();
            System.out.println("**********************************");
            System.out.println("*********欢迎使用核算检测系统*********");
            System.out.println("**********************************");
            System.out.println("****请选择操作：1.注册 2.登录 3.退出系统");
            int num=sc.nextInt();
            switch (num)
            {
                case 1:
                    user=dao.post(user,j);
                    j++;
                    break;
                case 2:
                    dao.loge(user,j);
                    break;
                case 3:
                    dao.end();
                    break;
            }
        }
    }
}