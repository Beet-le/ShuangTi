package Day913;

public class DaoSanjiao {
    public static void main(String[] args) {
        for (int i = 5; i >=1; i--) {
            for (int i1 = 1; i1 <=i; i1++) {
                System.out.print("  *");
            }
            System.out.println();
        }
    }
}
