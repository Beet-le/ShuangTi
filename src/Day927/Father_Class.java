package Day927;

public class Father_Class {
   private String name;
   private String sex;
   public void makemoney(){
       System.out.println("赚钱");
   }
   private void testp(){
       System.out.println("私有秘密 ");
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
