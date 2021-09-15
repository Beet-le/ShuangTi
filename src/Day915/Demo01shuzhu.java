package Day915;

import java.sql.Array;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo01shuzhu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Array[]=new int[5];//定义数组
        /*for (int i = 0; i < num.length; i++) {
        }*/

        for (int i = 0; i < Array.length; i++) {
            System.out.println("输入第"+ (i+1)+"学生成绩");
            Array[i]=sc.nextInt();
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }

    }
}
