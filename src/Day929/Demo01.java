package Day929;

public class Demo01 {
    public static void main(String[] args) {
        try {
            int a,b;
            a=3;
            b=0;
            System.out.println(a/b);

        }catch (Exception e){
            System.out.println("分母不能为零");
        }
    }
}
