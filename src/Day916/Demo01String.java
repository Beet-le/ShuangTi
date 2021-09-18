package Day916;

public class Demo01String {
    public static void main(String[] args) {
        String title=new String("12345679");
      /*  char a=title.charAt(2);
        System.out.println(a);*/
        char[] chars = title.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='1'){
                chars[i]='8';

            }
        }
        System.out.println(chars);

    }
}
