package Day915;

public class Demo03MySz3 {
    public static void main(String[] args) {
        int[] oldstu=new  int[]{12,45,78,89,98};
        int[] newstu=new  int[6];
        int i = 0;
        for (; i < 3; i++) {
            newstu[i]=oldstu[i];
        }
        if(i==3){
            newstu[i]=85;
        }
        for ( i =3; i <newstu.length; i++) {
            newstu[i+1]=oldstu[i];
        }
        for (int i1 = 0; i1 < newstu.length; i1++) {
            System.out.println(newstu[i1]);
        }

    }
}
