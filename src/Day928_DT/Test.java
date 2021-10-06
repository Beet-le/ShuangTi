package Day928_DT;

public class Test {
    public static void main(String[] args) {

//        Animal animal=new Cat();
        Animal animal2=new Dog();
        Animal animal=new Cat();
//      animal.eat();
      Cat cat=(Cat) animal;
      cat.function();
        /*if (animal instanceof Cat){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }*/

    }
}
