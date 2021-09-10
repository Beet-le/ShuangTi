package Day909;

public class Shuixiahu2 {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println("他是水仙花数"+i);
            }
           /*else {
                System.out.println("a");
            }*/
        }
    }
}
