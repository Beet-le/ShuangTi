package XiaoXianQiDay916;

import java.util.Scanner;

public class Zhuche {
    static String Usename, Paseward, PhoneNumber, Emil;
    static int PasewardLength,EmilIndexAiT,EmillIndexDian,PhoneNumberLength;
    static String PhoneNumberFirstNumber;
    static char[] PaSwardArray, UsenameArray;
    static Scanner sc = new Scanner(System.in);
    //注册并判断
    public void register() {
        System.out.println("注册用户");
        Usename = sc.next();
        UsenameArray=Usename.toCharArray();

        System.out.println(UsenameArray);

        System.out.println("注册用户密码:  密码大于6位");
        do {
            Paseward = sc.next();
            PasewardLength = Paseward.length();
            if (PasewardLength < 6) {
                System.out.println("密码错误,重新输入");
            }else {
                System.out.println("正确");
            }
//            String Pasward=new String(Paseward);
           PaSwardArray=Paseward.toCharArray();
        } while (PasewardLength < 6);

        System.out.println("请输入册邮箱:格式为xxxxx@xx.xxx");
        do {
            Emil = sc.next();
            EmilIndexAiT=Emil.indexOf("@");
            EmillIndexDian=Emil.indexOf(".");
            if(EmillIndexDian<0||EmilIndexAiT<0){
                System.out.println("输入错误！！重新输入");
            }
            else {
                System.out.println("输入正确");
            }
        }while (EmillIndexDian<0||EmilIndexAiT<0);
        System.out.println("请输入手机号： 第一个数字为1且长度为11");
        do {
            PhoneNumber=sc.next();
            PhoneNumberLength=PhoneNumber.length();
            PhoneNumberFirstNumber=PhoneNumber.substring(0 ,1);//PhoneNumberFirstNumber是String类型
//            System.out.println(PhoneNumberFirstNumber);
                if(PhoneNumberLength!=11 || !PhoneNumberFirstNumber.equals("1") ){
                    System.out.println("您输入的手机号不正确！ 请重新输入");
                }else {
                    System.out.println("正确！");
                }
        }while (PhoneNumberLength!=11 || !PhoneNumberFirstNumber.equals("1"));

    }
}
