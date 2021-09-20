package SuanfaDay919;

public class Demo05 {
/*    第二种解法：
    如果输入量为n为1，则需要计算1次；
    如果输入量n为1亿，则需要计算1次；*/
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        int sum = 0;//执行1次
        int n=100000000;//执行1次
        sum = (n+1)*n/2;//执行1次
        System.out.println("sum="+sum);
        long end=System.currentTimeMillis();
        System.out.println(end-start+"    2");
    }

}
