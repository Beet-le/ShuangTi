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

    }
}
