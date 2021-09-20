package XiaoXianQiZhongQIu;

import java.util.Scanner;

public class Two extends Feeling {
    public void  judge(){
        Scanner sc=new Scanner(System.in);
        System.out.println("是否愿意等待: \n 1:是 \n 2:否 ");
        int Print = sc.nextInt();
        if (Print==1){
                judges();
        }else if (Print==2){
            System.out.println("不嫁!");
        }else {
            System.out.println("输入错误!");
        }
    }
}
