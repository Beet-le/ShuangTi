package Day927;

public class Son2_Class extends Father_Class{

    public Son2_Class() {
        System.out.println("没有参数");
    }
//    重载
    public Son2_Class(String name) {
        System.out.println("STRING参数");
    }
    public Son2_Class(String name,int i) {
        System.out.println("一个string参数一个int");
    }
    public Son2_Class(int a,int i) {
        System.out.println("2个int参数");
    }

    public void study(){
        System.out.println("努力学习");
    }

   public void makemoney(){
//        super.makemoney();
        System.out.println("自立更生YYDS");
    }
    public void makemoney(String name){
//        super.makemoney();
        System.out.println(name+"自立更生YYDS");
    }


}
