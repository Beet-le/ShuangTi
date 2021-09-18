package Day916;

public class Demo02 {
    public static void main(String[] args) {
        String char1="阿萨的吗v啊对了，了";
//        char1=char1.substring(1,6);
//        System.out.println(char1);
       char1 = char1.length()>5?char1.substring(1,7 ):char1;
       char1+="....";
        System.out.println(char1);
    }

}
