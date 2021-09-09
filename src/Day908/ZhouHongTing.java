package Day908;
import java.util.Scanner;
public class ZhouHongTing {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入用户名");
        String name=scanner.nextLine();
        System.out.println("请输入密码");
        String password=scanner.nextLine();
        if ("admin" .equals(name)&&"888888".equals(password)){
            System.out.println("登陆成功");
        }
        else {
            System.out.println("您输入的用户名或者密码错误!请重新输入!");
            scanner.close();
        }
    }
}
