package COV_19;

import java.util.Scanner;

public class Main {
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("******欢迎使用核酸检测系统*****");
        System.out.println("***请选择操作：\n" +
                "***1.注册\n" +
                "***2.登录\n" +
                "***3.退出系统\n" +
                "******************\n");
        int zhuche = sc.nextInt();

        do{
            switch (zhuche){
                case 1:
                case 2:
                case 3:
            }

        }while (zhuche>3&&zhuche<1);
    }
}
