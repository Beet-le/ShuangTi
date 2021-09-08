package Day908;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Usename();
        Key();
    }
    public static void Usename(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String str1 = sc1.next();
        String usename= "Adminster";
        if (str1==usename){
            System.out.println("输入正确");
        }else {
            System.out.println("输入错误用户名");
        }
    }
    public static void Key(){
        Scanner sc2=new Scanner(System.in);
        System.out.println("请输入密码： ");
       int str2=sc2.nextInt();
        int key=888888;
        if (str2==key){
        }
        else {
            System.out.println("密码错误！");
        }
    }

}
