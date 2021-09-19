package Day918;

import java.util.Arrays;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        Date date=new Date();
      /*  String a="yoyo";
        String b="coco";
        String c="lulu";
        String.format("%tF",date);//格式化
        System.out.println(  String.format("Hi:%s:%s,%s",a,b,c));//捕获系统时间*/
    /*    String num1="123";
        float v = Float.parseFloat(num1);
        String num2="1";
        int newnum1 = Integer.parseInt(num1);//类型间的相互转换
        int newnum2 = Integer.parseInt(num2);
        System.out.println(num1+num2);
        System.out.println(newnum1+newnum2);
        System.out.println(v+newnum2);
//        System.out.println(date);*/
        String str="yoyoy     oyoyyyoy     ";
        String trims = str.trim();
        System.out.println(trims);
        /*

        str=str.replaceAll("y","c");
        System.out.println(str);*/
        /*int[] num={1,92,32,41,55,16};
        Arrays.sort(num);//排序
        int BS = Arrays.binarySearch(num, 92);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println(BS);*/


    }
}
