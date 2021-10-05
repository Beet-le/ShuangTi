package px.dao;

import px.model.User_model;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class User_Dao
{
    static User_model[] infor=new User_model[100];
    static Scanner sc=new Scanner(System.in);
    static int inform=0;

//   注册页面
    public User_model[] post(User_model[] user,int j)
    {
        user[j]=new User_model();
        System.out.println("--------注册页面--------");
        System.out.println("请输入用户名:"+(j+1));
        user[j].setName(sc.next());
        System.out.println("请输入密码:");
        user[j].setPassword(sc.next());
        System.out.println("注册成功!");
        return user;
    }

//    登录页面
    public void loge(User_model[] user,int j)
   {
       while (true)
       {
           System.out.println("--------登录页面--------");
           System.out.println("请输入用户名:");
           String username1=sc.next();
           System.out.println("请入密码:");
           String password1=sc.next();
           for(int i=0;i<j;i++)
           {
               System.out.println(j+"xxx");
               System.out.println(user[i].getName());
               System.out.println(username1);
               System.out.println(user[i].getPassword());
               System.out.println(password1);
               if (user[i].getName().equals(username1)&&user[i].getPassword().equals(password1))
               {
                   userController();
                   return;
               }
           }
           System.out.println("对不起，您输入的账户名或密码错误，登录失败！-_-");
           System.out.println("请您重新输入^_^");
           return;
       }
   }

//   功能界面
   public void userController(){

       System.out.println();
       System.out.println("恭喜，登录成功!^_^");
       while (true)
       {
           System.out.println();
           System.out.println("******************************************************************");
           System.out.println("*************************欢迎使用核算检测系统*************************");
           System.out.println("******************************************************************");
           System.out.println("***************************请选择你的操作****************************");
           System.out.println("1.添加受检者 2.删除受检者 3.查看受检者 4.修改受检者 5.修改受检结果 6.退出登录");
           int m=sc.nextInt();
           switch (m)
           {
               case 1:
                   this.add_user(infor,inform);
                   inform++;
                   break;
               case 2:this.delete(infor,inform);
                   break;
               case 3:
                   this.select_all(infor,inform);
                   break;
               case 4:
                   this.modify(infor,inform);
                   break;
               case 5:this.modify1(infor,inform);
                   break;
               case 6:
                   /*System.exit(0);*/
                   return;
               default:
                   System.out.println("您输入的数字不合法，请您重新输入吖^_^");
           }
       }
   }

//     结束页面
    public void end()
    {
        System.exit(0);
    }

//    添加受检者页面
    public User_model[] add_user(User_model[] infor,int inform)
    {
        infor[inform]=new User_model();
        System.out.println("请输入ID:");
        String id=sc.next();
        infor[inform].setID(id);
        System.out.println("请输入姓名:");
        String name=sc.next();
        infor[inform].setName1(name);
        System.out.println("请输入年龄:");
        String age=sc.next();
        infor[inform].setAge(age);
        System.out.println("请输入检测日期(格式 yyyy-mm-dd):");
        String day=sc.next();
        infor[inform].setDay(day);
        System.out.println("请选择类型:");
        System.out.println("1.鼻拭子 2.咽拭子");
        int c=sc.nextInt();
        switch (c)
        {
            case 1:
                String b="鼻拭子";
                infor[inform].setState(b);
                break;
            case 2:
                String y="咽拭子";
                infor[inform].setState(y);
                break;
        }
        String tyep="检测中";
        infor[inform].setType(tyep);
        System.out.println("添加成功!");
        return infor;
    }

//    查看受检者
    public void select_all(User_model[] infor,int inform)
    {
        for (int i=0;i<inform;i++)
        {
            //需要制作表格的样式
            System.out.println(infor[i].getID());
            System.out.println(infor[i].getName1());
            System.out.println(infor[i].getAge());
            System.out.println(infor[i].getDay());
            System.out.println(infor[i].getType());
            System.out.println(infor[i].getState());
        }
    }

//    修改受检者
    public void modify(User_model[] infor,int inform)
    {
        System.out.println("--------修改受检者界面--------");
        System.out.println("请输入修改者ID:");
        String id1=sc.next();
        for (int i=0;i<inform;i++)
        {
            if (id1.equals(infor[i].getID()))
            {
                System.out.println("请输入更新的受检者ID:");
                System.out.println("请输入更新后的姓名:");
                String name=sc.next();
                infor[i].setName1(name);
                System.out.println("请输入更新后的年龄:");
                String age=sc.next();
                infor[i].setAge(age);
                System.out.println("请输入更新后的日期(格式 yyyy-mm-dd):");
                String day=sc.next();
                infor[i].setDay(day);
                System.out.println("请选择更新后的类型:");
                System.out.println("1.鼻拭子 2.咽拭子");
                int c=sc.nextInt();
                //需要do-while
                switch (c)
                {
                    case 1:
                        String b="鼻拭子";
                        infor[i].setState(b);
                        break;
                    case 2:
                        String y="咽拭子";
                        infor[i].setState(y);
                        break;
                    default:
                        System.out.println("您输入的数字不合法，请重新输入哟^_^");
                }
            }
            System.out.println("更新成功!*_*");
        }
    }

//    修改受检结果
    public void modify1(User_model[] infor,int inform)
    {
        System.out.println("--------修改受检结果界面--------");
        System.out.println("请输入修改者ID");
        String id2=sc.next();
        for (int i=0;i<inform;i++)
        {
            if (id2.equals(infor[i].getID()))
            {
                System.out.println("请选择检测状态:");
                System.out.println("1.检测中 2.阴性 3.阳性");
                int c=sc.nextInt();
                switch (c)
                {
                    case 1:
                        infor[i].setState("检测中~");
                        break;
                    case 2:
                        infor[i].setState("阴性!");
                        break;
                    case 3:
                        infor[i].setState("阳性!");
                        break;
                    default:
                        System.out.println("您输入的数据有误，请您重新输入哟~");
                }
                System.out.println("修改成功!*_*");
            }
        }
    }
    public void delete(User_model[] infor,int inform)
    {
        System.out.println("请输入用户ID:");
        String id3=sc.next();
        String a=null;
        for (int i=0;i<inform;i++)
        {
            if (id3.equals(infor[i].getID()))
            {
                infor[i].setID(a);
                infor[i].setName1(a);
                infor[i].setAge(a);
                infor[i].setDay(a);
                infor[i].setType(a);
                infor[i].setState(a);
            }
        }
        System.out.println("删除成功!*_*");
    }
}
