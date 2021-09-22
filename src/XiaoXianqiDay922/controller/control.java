package control;

import com.XiaoXianQi.control.User_Dao;

import java.util.Scanner;

public class control {
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        User_Dao dao=new User_Dao();
        while (true){
            System.out.println("1:注册  2:登录   3:退出");
            int num=sc.nextInt();
            switch (num){
                case 1:dao.in_user();
            }
        }

    }
}
