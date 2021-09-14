package Day914;

import java.util.Scanner;

public class Demo02ADD {
    public static void main(String[] args) {
                add();// 加减法
        }
    public static void  add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int no1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int no2 = sc.nextInt();
        System.out.println("请输入运算符号");
        String c = sc.next();
        switch (c) {
            case "+":
                System.out.println(no1 + no2);
                break;
            case "-":
                System.out.println(no1 - no2);
                break;
            default:
                System.out.println("去尼玛的！");
//                break;
        }
    }

}
