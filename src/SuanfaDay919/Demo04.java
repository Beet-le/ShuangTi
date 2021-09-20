package SuanfaDay919;

public class Demo04 {
   /* 如果输入量为n为1，则需要计算1次；
    如果输入量n为1亿，则需要计算1亿次；*/
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        int sum = 0;//执行1次
        int n=100000000;//执行1次
        for (int i = 1; i <= n; i++) {//执行了n+1次
            sum += i;//执行了n次
        }
        System.out.println("sum=" + sum);
        long end=System.currentTimeMillis();
        System.out.println(end-start+"    1");
    }

}
