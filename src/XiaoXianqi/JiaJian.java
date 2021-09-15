package XiaoXianqi;

import java.util.Scanner;

public class JiaJian {
    static  int sum;
    public static void main(String[] args) {
        System.out.println("1:加法  2:减法  3:乘法  4除法");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch (m){
            case 1:
                add(a,b);break;
            case 2:
                jian(a,b);break;
            case 3:
               cheng(a,b);break;
            case 4:
                chu(a,b);break;
        }
    }
    public static int add(int a,int b){
        sum=a+b;
        System.out.println(sum);
        return sum;
    }
    public static int jian(int a,int b){
        sum=a-b;
        System.out.println(sum);
        return sum;
    }
    public static int cheng(int a,int b){
        sum=a*b;
        System.out.println(sum);
        return sum;
    }
    public static int chu(int a,int b){
        sum=a/b;
        System.out.println(sum);
        return sum;
    }
}
