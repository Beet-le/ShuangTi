package SuanfaDay919;

public class Demo02     {
    public static void main(String[] args) {
        long result = fun(10);
        System.out.println(result);

    }
    public static long fun(long n){
        int result=1;
        for (long i = 1; i <=n; i++) {
            result*=i;
        }
        return  result;
    }
}
