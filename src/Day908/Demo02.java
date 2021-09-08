package Day908;
import java.util.Scanner;
public class Demo02
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("欢迎");
        System.out.println("用户名：");
        String a=sc.nextLine();
        System.out.println("密码：");
        String b=sc.nextLine();
        Numbertest n=new Numbertest();
        try
        {
            n.uu(a,b);
            System.out.println("用户登录成功");
        }
        catch(userException e)
        {
            System.out.println("用户名或密码不正确");
        }
        catch(nullException f)
        {
            System.out.println("用户名或密码不能为空");
        }
        catch(shortException g)
        {
            System.out.println("密码不能少于6位");
        }
    }
}
class userException extends Exception
{
    public userException(String msg)
    {
        super(msg);
    }
}
class nullException extends Exception
{
    public nullException(String msg)
    {
        super(msg);
    }
}
class shortException extends Exception
{
    public shortException(String msg)
    {
        super(msg);
    }
}
class Numbertest
{
    public String uu(String a,String b) throws userException,nullException,shortException
    {
        if(a.equals("") || b.equals(""))
        {
            throw new nullException("抛出自定义异常：用户名或密码不能为空");
        }
        if(b.length()<6)
        {
            throw new shortException("抛出自定义异常：密码不能少于6位");
        }
        if(!a.equals("Admin") || !b.equals("888888"))
        {
            throw new userException("抛出自定义异常：用户名或密码不正确");
        }
        else
        {
            return a;
        }
    }
}



