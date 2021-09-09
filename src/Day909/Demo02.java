package Day909;
import java.util.Scanner;
public class Demo02 {
    public static void main(String[] args) {
        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入您的薪水");
            int salary=sc.nextInt();
            if(salary>=20000){
                System.out.println("教授");
            }else if (salary>=10000&&salary<20000){
                System.out.println("副教授");
            }else if (salary>=5000&&salary<10000){
                System.out.println("讲师");
            }else if (salary>=2000&&salary<5000){
                System.out.println("助教");
            }else if(salary>0&&salary<2000){
                System.out.println("清洁工");
            }else {
                System.out.println("nb");
            }
        }

    }
}
