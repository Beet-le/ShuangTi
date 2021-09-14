package Day914;

import java.util.Scanner;

public class Demo03return {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum2=add(a,b);
//        System.out.println(sum2);
    }
    public static int add(int a,int b){
        System.out.println(a);
        System.out.println(b);
        int sum=a+b;
        return sum;
    }
}
