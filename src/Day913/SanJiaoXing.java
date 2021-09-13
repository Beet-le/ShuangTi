package Day913;
public class SanJiaoXing {
    public static void main(String[] args) {
        int size = 9;
        //先打印上半部分
        System.out.println("正三角形");
        for (int i=0;i<size/2+1;i++) {
            //打印空白部分
            //i = 0 1 2 3 4
            //打印空格是 4 3 2 1 0
            for (int j=size/2;j>i;j--) {
                System.out.print(" ");
            }
            //打印星号
            //i = 0 1 2 3 4
            //星号数量 1 3 5 7 9
            // 2*i + 1
            for (int k=0;k<2*i+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("倒三角形");
        for (int i=0;i<size/2+1;i++) {
            //打印空白部分
            //i = 1 2 3 4
            //空格是 1 2 3 4
            for (int j=0;j<i;j++) {
                System.out.print(" ");
            }
            //打印星号
            //i = 0 1 2 3 4
            //星号是9 7 5 3 1
            for (int k=size-2*i;k>0;k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
