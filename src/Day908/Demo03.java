package Day908;
import java.util.Scanner;
public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        boolean limit = true;
//        int count = 0;
        while (limit) {
            if ("admin".equals(username) && "888888".equals(password)) {
                System.out.println("密码正确!");
                limit = false;
            }
            /*else if (2 == count) {
                System.out.println("密码错误次数超过限制，程序退出");
                limit = false;}*/
             else {
                System.out.println("密码错误，请重新输入：");
                password = sc.nextLine();
//                count ++;
            }
        }

    }

}
