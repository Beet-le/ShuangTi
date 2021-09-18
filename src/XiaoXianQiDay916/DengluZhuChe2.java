package XiaoXianQiDay916;

import java.util.Scanner;

/*作业一：输入 菜单
1.注册 2.登录（密码长度不得低于六位，确认密码）
3.手机号码（11位，第一位必须是1）
 4.邮箱验证格式（必须含有@  .  ）   注册过的用户能够登录成功*/
public class DengluZhuChe2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      Zhuche zhuche=new Zhuche();
      Denglu denglu=new Denglu();
//      switch ();
        System.out.println("请输入1:注册  2:登录 ");
        int Print = sc.nextInt();
        if(Print==1){
            zhuche.register();
            denglu.lpgen();
        }else if (Print == 2) {
            denglu.lpgen();
            System.out.println("您还为注册");
            zhuche.register();
            denglu.lpgen();
        }
        else {
            System.out.println("语法错误");
        }

    }

}

