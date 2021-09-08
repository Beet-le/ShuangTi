package Day908;


import java.util.Scanner;
public class Demo02  //主程序
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);//从键盘接收数据
        System.out.println("欢迎");
        System.out.println("用户名：");
        String a=sc.nextLine();  //输入用户名
        System.out.println("密码：");
        String b=sc.nextLine();//输入密码
        Numbertest n=new Numbertest();
        //捕获异常
        try
        {
            n.uu(a,b);
            System.out.println("用户登录成功");//输出语句
        }
        catch(userException e)
        {
            System.out.println("用户名或密码不正确");//输出语句
        }
        catch(nullException f)
        {
            System.out.println("用户名或密码不能为空");//输出语句
        }
        catch(shortException g)
        {
            System.out.println("密码不能少于6位");//输出语句
        }
    }
}
class userException extends Exception //自定义userException异常类，继承Exception类
{
    public userException(String msg)
    {
        super(msg);//调用父类的构造方法
    }
}
class nullException extends Exception //自定义nullException异常类，继承Exception类
{
    public nullException(String msg)
    {
        super(msg);//调用父类的构造方法
    }
}
class shortException extends Exception //自定义shortException异常类，继承Exception类
{
    public shortException(String msg)
    {
        super(msg);//调用父类的构造方法
    }
}

class Numbertest //自定义异常类
{
    public String uu(String a,String b) throws userException,nullException,shortException  //抛出自定义异常
    {
        if(a.equals("") || b.equals(""))
        {
            throw new nullException("抛出自定义异常：用户名或密码不能为空");//抛出自定义异常
        }
        if(b.length()<6)
        {
            throw new shortException("抛出自定义异常：密码不能少于6位");//抛出自定义异常
        }
        if(!a.equals("Admin") || !b.equals("888888"))
        {
            throw new userException("抛出自定义异常：用户名或密码不正确");//抛出自定义异常
        }
        else
        {
            return a;
        }
    }
}



