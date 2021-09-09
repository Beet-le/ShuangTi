package Day909;
import java.util.Scanner;
public class ShuiXianhua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = scanner.nextInt();
        int a = num / 100;
        int b = num / 10 % 10;
        int c = num % 10;
        if (a * a * a + b * b * b + c * c * c == num) {
            System.out.println("他是水仙花数");
        } else {
            System.out.println("他不是水仙花数");
        }
    }
}

