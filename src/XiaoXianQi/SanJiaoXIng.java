package XiaoXianQi;

public class SanJiaoXIng {
    public static void main(String[] args) {
        int Long=9;
        for (int i=0;i<Long/2+1;i++) {
            for (int j=0;j<i;j++) {
                System.out.print(" ");
            }
            for (int k=Long-2*i;k>0;k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
