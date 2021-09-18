package XiaoXianQiDay916;

import java.util.Scanner;

public class Denglu extends Zhuche{
    static String NewUsename,NewPaseward;
    static Scanner sc=new Scanner(System.in);
    public void lpgen(){
        do {
            System.out.println("请输入用户名");
            NewUsename=sc.next();
            char []NewUsenameArray=NewUsename.toCharArray();
            System.out.println(NewUsenameArray);
            System.out.println("请输入用户名密码");
            NewPaseward=sc.next();
            char []  NewPasewardArray=NewPaseward.toCharArray();
            if(NewPasewardArray!=(PaSwardArray)|| NewUsenameArray!=(UsenameArray)){
                System.out.println("输入错误");
               continue;

            }else {
                System.out.println("登录成功");
            }

        }while (!NewPaseward.equals(Paseward)||!NewUsename.equals(Usename));

    }
}
