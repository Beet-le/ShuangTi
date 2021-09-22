package Day922_01.com.stx.px.Dao;

import java.util.Scanner;

public class Mima {
     Scanner sc=new Scanner(System.in);
     String name=null;
     String username=null;

    public void login(){

        System.out.println(" 请输入用户名");
        String name=sc.next();
        System.out.println(" 请输入用户名密码");
        String paseward=sc.next();
        if(name.equals("yoyo")&&paseward.equals("axxx")){

        }

    }
    public  void in_user(){
        System.out.println();
         name=sc.next();
        System.out.println();
    }
}
