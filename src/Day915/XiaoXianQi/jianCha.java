package Day915.XiaoXianQi;

public class jianCha {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5};
        int[]  newarray=new int[4];
        int i=0;
        for (; i < 3; i++) {
            newarray[i]=array[i];
        }
        for (  i=3;i< array.length;i++){
            newarray[i-1]=array[i];
        }
        for (int i1 = 0; i1 < newarray.length; i1++) {
            System.out.println(newarray[i1]);
        }
    }
}
