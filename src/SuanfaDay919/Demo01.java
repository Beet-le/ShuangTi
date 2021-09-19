package SuanfaDay919;
//10 的阶乘
public class Demo01 {
    public static void main(String[] args) {
        long result=fun(10);
        System.out.println(result);
    }
    public static long fun(long n){
        if(n==1){
            return 1;           //递归
        }
        return n*fun(n-1);
    }
}
