package SuanfaDay919;
/*事后分析估算方法：
        比较容易想到的方法就是我们把算法执行若干次，然后拿个计
        时器在旁边计时，这种事后统计的方法看上去的确不错，并且
        也并非要我们真的拿个计算器在旁边计算，因为计算机都提
        供了计时的功能。这种统计方法主要是通过设
        计好的测试程序和测试数据，利用计算机计时器对不同的
        算法编制的程序的运行时间进行比较，从而确定算法效率
        的高低，但是这种方法有很大的缺陷：必须依据算法实
        现编制好的测试程序，通常要花费大量时间和精力，测试完
        了如果发现测试的是非常糟糕的算法，那么之前所做的
        事情就全部白费了，并且不同的测试环境(硬件环境)的差别
        导致测试的结果差异也很大。*/
public class Demo03 {
    public static void main(String[]args){
        long start=System.currentTimeMillis();
        int sum=0;
        int n=100;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("sum="+sum);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }

}

